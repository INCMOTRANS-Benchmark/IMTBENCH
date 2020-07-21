package fr.tpt.mem4csd.utils.osate.standalone;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.analysis.SerializationContext.RuleContext;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.DefaultAnnexLibrary;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.FlowImplementation;
import org.osate.aadl2.FlowSpecification;
import org.osate.annexsupport.AnnexRegistry;
import org.osate.annexsupport.AnnexUnparser;
import org.osate.xtext.aadl2.serializer.AbstractAadl2SemanticSequencer;
import org.osate.xtext.aadl2.services.Aadl2GrammarAccess;

// import fr.tpt.mem4csd.utils.osate.standalone.StandaloneSerializationContext.RuleContext;

public class StandaloneAadl2SemanticSequencer extends AbstractAadl2SemanticSequencer {
	
	@Inject
	protected Aadl2GrammarAccess grammarAccess;
	protected StandaloneAnnexRegistry annexRegistry;

	protected StandaloneAnnexRegistry getAnnexUnparserRegistry() {
		if (annexRegistry == null) {
			annexRegistry = StandaloneAnnexRegistry.getRegistry(AnnexRegistry.ANNEX_UNPARSER_EXT_ID);
		}
		return annexRegistry;
	}

	@Override
	public void createSequence(ISerializationContext context, EObject semanticObject) {
		
		if ((semanticObject instanceof DefaultAnnexLibrary) &&
			(Objects.equal(context.getParserRule(), grammarAccess.getAnnexLibraryRule()) || 
			 Objects.equal(context.getParserRule(), grammarAccess.getDefaultAnnexLibraryRule()))) {
			
			final DefaultAnnexLibrary annexLib = (DefaultAnnexLibrary)semanticObject;
			final AnnexLibrary parsedLibrary = annexLib.getParsedAnnexLibrary();
			final AnnexUnparser annexUnparser = getAnnexUnparserRegistry().getAnnexUnparser(annexLib.getName());
			// serialize if there is an unparser and the annex has been parsed
			// otherwise use the original annex text
			if (parsedLibrary != null && annexUnparser != null) {
				try {
					performModification(semanticObject, new Runnable() {
						@Override
						public void run() {
							String text = "{**" + annexUnparser.unparseAnnexLibrary(parsedLibrary, "  ") + "**}";
							annexLib.setSourceText(text);
						}				
					});
				} catch (Exception e) {
					throw new RuntimeException("Error while serializing " + annexLib.getName() + " annex library", e);
				}
			}
			sequence_DefaultAnnexLibrary(context, annexLib);
		} else if ((semanticObject instanceof DefaultAnnexSubclause) && 
				   (Objects.equal(context.getParserRule(), grammarAccess.getAnnexSubclauseRule()) ||
					Objects.equal(context.getParserRule(), grammarAccess.getDefaultAnnexSubclauseRule()))) {
			final DefaultAnnexSubclause annexSubclause = (DefaultAnnexSubclause)semanticObject;
			final AnnexSubclause parsedSubclause = annexSubclause.getParsedAnnexSubclause();
			final AnnexUnparser annexUnparser = getAnnexUnparserRegistry().getAnnexUnparser(annexSubclause.getName());
			// serialize if there is an unparser and the annex has been parsed
			// otherwise use the original annex text
			if (parsedSubclause != null && annexUnparser != null) {
				try {
					performModification(semanticObject, new Runnable() {
						@Override
						public void run() {
							String text = "{**" + annexUnparser.unparseAnnexSubclause(parsedSubclause, "  ") + "**}";
							annexSubclause.setSourceText(text);
						}				
					});
				} catch (Exception e) {
					throw new RuntimeException("Error while serializing " + annexSubclause.getName() + " annex library", e);
				}
			}
			sequence_DefaultAnnexSubclause(context, annexSubclause);
		} else {
			super.createSequence(context, semanticObject);
		}
	}
	
	protected TransactionalEditingDomain performModification(EObject semanticObject, final Runnable runnable) {
		ResourceSet resourceSet = null;
		if (semanticObject != null) {
			if (semanticObject.eResource() != null) {
				resourceSet = semanticObject.eResource().getResourceSet();
			}
		}
		
		TransactionalEditingDomain domain = null;
		
		if(resourceSet != null) {
			domain = TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(resourceSet);
		}
		
		if(domain == null) {
			runnable.run();
		} else {
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				protected void doExecute() {
					runnable.run();
				}
			});
		}
				
		return domain;
	} 
	
	@Override
	protected void sequence_FlowPathSpec_FlowSinkSpec_FlowSourceSpec_FlowSpecRefinement(ISerializationContext context, FlowSpecification spec) {
		if (spec.getRefined() != null) {
			sequence_FlowSpecRefinement(new RuleContext(context, grammarAccess.getFlowSpecRefinementRule()), spec);
		} else {
			switch(spec.getKind()) {
				case SOURCE:
					sequence_FlowSourceSpec(new RuleContext(context, grammarAccess.getFlowSourceSpecRule()), spec);
				case PATH:
					sequence_FlowPathSpec(new RuleContext(context, grammarAccess.getFlowPathSpecRule()), spec);
				case SINK:
					sequence_FlowSinkSpec(new RuleContext(context, grammarAccess.getFlowSinkSpecRule()), spec);
			}
		}
	}
	
	@Override
	protected void sequence_FlowPathImpl_FlowSinkImpl_FlowSourceImpl(ISerializationContext context, FlowImplementation impl) {
		switch(impl.getKind()) {
			case SOURCE:
				sequence_FlowSourceImpl(new RuleContext(context, grammarAccess.getFlowSourceImplRule()), impl);
			case PATH:
				sequence_FlowPathImpl(new RuleContext(context, grammarAccess.getFlowPathImplRule()), impl);
			case SINK:
				sequence_FlowSinkImpl(new RuleContext(context, grammarAccess.getFlowSinkImplRule()), impl);
		}
	}
}

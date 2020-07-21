package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.test;

import java.util.Collection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osate.workspace.WorkspacePlugin;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;

public class UpdateTest extends AbstractTest {

	protected UpdateTest(final String baseDir) {
		super(baseDir);
	}

	@SuppressWarnings("unchecked")
	protected Resource executeAadl2AadlTransformation(int testNumber, Result res,
			final String inputModelName, final TransformationDirectionEnum direction) throws Exception {
		final Resource aadlResourceleft;
		final Resource aadlResourceright;
		final Resource createdResource;
		final URI createdResourceUri = createURI("outputs/" + inputModelName, null);
		final Collection<EObject> createdElements;
		final ResourceSet resourceSet = createResourceSet();

		final MoTE2Sdm engine = createEngine();

		ModelModif modif = new ModelModif();
		long[] runsOfUp = new long[res.runtimes];

		switch (direction) {
		case FORWARD:
			aadlResourceleft = loadInputResource(inputModelName, WorkspacePlugin.MODEL_FILE_EXT);
			aadlResourceright = resourceSet
					.createResource(createdResourceUri.appendFileExtension(WorkspacePlugin.MODEL_FILE_EXT));
			createdResource = aadlResourceright;
			createdElements = engine.getRightInputElements();

			break;

		default:
			throw new IllegalArgumentException("Unsupported tranformation direction : " + direction);
		}

		System.out.println("Test " + testNumber + " Performing transformation:");

		engine.initModels(aadlResourceleft.getContents(), aadlResourceright.getContents());
		engine.transform(direction, false, false, false, false, null);

		long t0, t1;
		System.out.println(res.runtimes);
		for (int i = 0; i < res.runtimes; i++) {
			modif.updateConnectionInstance(aadlResourceleft);

			t0 = System.nanoTime();
			engine.transform(direction, true, false, false, false, null);
			t1 = System.nanoTime();
			runsOfUp[i] = t1 - t0;
		}

		res.setExecutionTimes((testNumber - 1), res.getMedian(runsOfUp));
		System.out.println("Test " + testNumber + " in " + res.getMedian(runsOfUp) + " ns");

		createdResource.getContents().addAll(createdElements);
		aadlResourceright.save(null);

		System.out.println("Transformation finished.");
		return createdResource;
	}

}
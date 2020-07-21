package fr.tpt.mem4csd.mtbench.aadl2aadl.mote.test;

import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.ConnectionReference;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.SystemInstance;

public class ModelModif {

	public ModelModif() {
	}

	/**
	 * Update the name of the first connection at the system level
	 * 
	 * @param inputModel
	 */
	void updateConnectionInstance(Resource inputModel) {
		SystemInstance systemRoot = (SystemInstance) inputModel.getContents().get(0);
		EList<ConnectionInstance> allConnections = systemRoot.getConnectionInstances();
		if (!allConnections.isEmpty()) {
			ConnectionInstance firstConnection = allConnections.get(0);
			firstConnection.setName("updatedConnection");
		}
		// save the updated connection
//		try {
//			inputModel.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

	/**
	 * Copy oldFeat feature
	 * 
	 * @param oldFeat
	 * @return addedFeat
	 */
	FeatureInstance addFeature(FeatureInstance oldFeat) {
		FeatureInstance addedFeat = oldFeat.getContainingComponentInstance().createFeatureInstance();
		addedFeat.setCategory(oldFeat.getCategory());
		addedFeat.setDirection(oldFeat.getDirection());
		addedFeat.setName("addedFeat_" + oldFeat.getName());
		return addedFeat;
	}

	/**
	 * Copy the first connection at the system level
	 * 
	 * @param inputModel
	 */
	@SuppressWarnings("unchecked")
	void addConnectionInstance(Resource inputModel) {
		SystemInstance systemRoot = (SystemInstance) inputModel.getContents().get(0);

		EList<ConnectionInstance> allConnections = systemRoot.getConnectionInstances();

		if (!allConnections.isEmpty()) {
			ConnectionInstance firstConnection = allConnections.get(0);

			ConnectionInstance newConnection = firstConnection.getContainingComponentInstance()
					.createConnectionInstance();

			newConnection.setName("addedConnection");
			newConnection.setKind(firstConnection.getKind());

			ListIterator<ConnectionReference> it = firstConnection.getConnectionReferences().listIterator();
			while (it.hasNext()) {
				ConnectionReference ref = it.next();
				ConnectionReference newref = newConnection.createConnectionReference();
				newref.setContext(ref.getContext());
				DirectionType in = (DirectionType) ((FeatureInstance) ref.getDestination()).getDirection();
				DirectionType out = (DirectionType) ((FeatureInstance) ref.getSource()).getDirection();

				if (in.equals(out)) {
					newref.setDestination(addFeature((FeatureInstance) ref.getDestination()));
					newref.setSource(addFeature((FeatureInstance) ref.getSource()));
				}
			}
		}
		// save the added connection
//		try {
//			inputModel.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	/**
	 * Delete the first connection at the system level
	 * 
	 * @param inputModel
	 */
	void deleteConnectionInstance(Resource inputModel) {
		SystemInstance systemRoot = (SystemInstance) inputModel.getContents().get(0);
		EList<ConnectionInstance> allConnections = systemRoot.getConnectionInstances();
		if (!allConnections.isEmpty()) {
			ConnectionInstance firstConnection = allConnections.get(0);

			EcoreUtil.removeAll(firstConnection.getConnectionReferences());
			EcoreUtil.delete(firstConnection, true);
		}
		// save
//		try {
//			inputModel.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
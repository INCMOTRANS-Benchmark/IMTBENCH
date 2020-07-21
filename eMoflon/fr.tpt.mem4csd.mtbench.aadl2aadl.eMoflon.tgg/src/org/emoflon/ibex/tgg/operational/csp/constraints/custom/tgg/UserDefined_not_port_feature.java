package org.emoflon.ibex.tgg.operational.csp.constraints.custom.tgg;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.osate.aadl2.instance.FeatureCategory;

public class UserDefined_not_port_feature extends RuntimeTGGAttributeConstraint {
	@Override
	public void solve() {

		if (variables.size() != 1)
			throw new RuntimeException("The CSP " + getClass().getName() + " "
					+ "needs exactly two variables");

		RuntimeTGGAttributeConstraintVariable a =  variables.get(0);

		String bindingStates = getBindingStates(a);

		if (bindingStates.equals("B")) {
			setSatisfied(!((a.getValue().equals(FeatureCategory.DATA_PORT)) ||
					     (a.getValue().equals(FeatureCategory.EVENT_DATA_PORT)) ||
					     (a.getValue().equals(FeatureCategory.EVENT_PORT))));
		}
		else if (bindingStates.equals("F")) {
			a.bindToValue(FeatureCategory.ABSTRACT_FEATURE);
			setSatisfied(true); 
		} else {
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}

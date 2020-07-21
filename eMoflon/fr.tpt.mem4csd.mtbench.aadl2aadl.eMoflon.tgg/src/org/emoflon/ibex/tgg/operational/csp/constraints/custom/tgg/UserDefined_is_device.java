package org.emoflon.ibex.tgg.operational.csp.constraints.custom.tgg;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.osate.aadl2.ComponentCategory;

public class UserDefined_is_device extends RuntimeTGGAttributeConstraint {

	@Override
	public void solve() {

		if (variables.size() != 2)
			throw new RuntimeException("The CSP " + getClass().getName() + " needs exactly two variables");

		RuntimeTGGAttributeConstraintVariable a = variables.get(0);
		RuntimeTGGAttributeConstraintVariable b = variables.get(1);

		String bindingStates = getBindingStates(a, b);


		if (bindingStates.equals("BB")) {
			setSatisfied(
					(a.getValue().equals(ComponentCategory.DEVICE)) || 
					(b.getValue().equals(ComponentCategory.DEVICE)));
			
		} else if (bindingStates.equals("BF")) {
			b.bindToValue(a.getValue());
			setSatisfied(true);
			
		} else if (bindingStates.equals("FB")) {
			a.bindToValue(b.getValue());
			setSatisfied(true);
		}
		// modelgen implementation
		else if (bindingStates.equals("FF")) {
			a.bindToValue(ComponentCategory.ABSTRACT);
			b.bindToValue(ComponentCategory.ABSTRACT);
			setSatisfied(true);
		} else {
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}

package org.emoflon.ibex.tgg.operational.csp.constraints.custom.tgg;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_eq_enum extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint eq_enum(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {

		if (variables.size() != 2)
			throw new RuntimeException("The CSP " + getClass().getName() + " needs exactly two variables");

		RuntimeTGGAttributeConstraintVariable a = variables.get(0);
		RuntimeTGGAttributeConstraintVariable b = variables.get(1);

		String bindingStates = getBindingStates(a, b);

		if (bindingStates.equals("BB")) {
			setSatisfied(a.getValue().equals(b.getValue()));
		} 
		else if (bindingStates.equals("BF")) {
			b.bindToValue(a.getValue());
			setSatisfied(true);
		} 
		else if (bindingStates.equals("FB")) {
			a.bindToValue(b.getValue());
			setSatisfied(true);
		}
		// modelgen implementation
		else if (bindingStates.equals("FF")) {
			//Integer type = a.getType();
			String value =  null;
			a.bindToValue(value);
			b.bindToValue(value);
			setSatisfied(true);
		} else {
			throw new UnsupportedOperationException(
					"This case in the constraint has not been implemented yet: " + bindingStates);
		}
	}
}


package org.emoflon.ibex.tgg.operational.csp.constraints.factories.tgg;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.tgg.UserDefined_eq_enum;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.tgg.UserDefined_not_port_connection;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.tgg.UserDefined_not_port_feature;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.tgg.UserDefined_is_device;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("eq_enum", () -> new UserDefined_eq_enum());
		creators.put("not_port_connection", () -> new UserDefined_not_port_connection());
		creators.put("not_port_feature", () -> new UserDefined_not_port_feature());
		creators.put("is_device", () -> new UserDefined_is_device());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}

package com.gmail.zariust.otherdrops.parameters.conditions;

import java.util.List;

import com.gmail.zariust.common.Verbosity;
import com.gmail.zariust.otherdrops.ConfigurationNode;
import com.gmail.zariust.otherdrops.Log;
import com.gmail.zariust.otherdrops.event.OccurredEvent;
import com.gmail.zariust.otherdrops.parameters.Parameter;

public abstract class Condition extends Parameter {
	String conditionName = "undefined";
	
	
	public final boolean check(OccurredEvent occurrence) {
		boolean result = checkInstance(occurrence);
		Log.logInfo("Condition '"+this.getClass().getSimpleName()+"' "+(result?"passed":"failed"), Verbosity.HIGHEST);
		return result;
	}
	
	protected abstract boolean checkInstance(OccurredEvent occurrence);

	
	
	//protected abstract static List<Condition> parseInstance(ConfigurationNode node);

}
package org.darkstorm.minecraft.darkbot.protocol.condition;

import java.util.Collection;

public interface OrCondition extends Condition {
	public Collection<Condition> getConditions();
}
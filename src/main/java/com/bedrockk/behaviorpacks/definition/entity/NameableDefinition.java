package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import lombok.Data;

import java.util.List;

@Data
public class NameableDefinition implements EntityComponentDefinition {
	private boolean allowNameTagRenaming = true;
	private boolean alwaysShow = false;
	private EntityEventTriggerDefinition defaultTrigger;
	private List<NameAction> nameActions;

	@Data
	public static class NameAction implements PackNode {
		private String nameFilter;
		private EntityEventTriggerDefinition onNamed;
	}
}
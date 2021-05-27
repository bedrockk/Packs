package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class NameableDefinition implements EntityComponentDefinition {
	@Builder.Default
	private boolean allowNameTagRenaming = true;
	private boolean alwaysShow;
	private EntityEventTriggerDefinition defaultTrigger;
	@Singular
	private List<NameAction> nameActions;

	@Data
	@Builder
	@Jacksonized
	public static class NameAction implements PackNode {
		private String nameFilter;
		private EntityEventTriggerDefinition onNamed;
	}
}
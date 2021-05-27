package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.PackNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class ShooterDefinition implements ItemComponentNode {
	@Singular("ammo")
	private List<Ammo> ammunition;
	private int maxDrawDuration;
	private boolean scalePowerByDrawDuration;
	private boolean chargeOnDraw;

	@Data
	@Builder
	@Jacksonized
	public static class Ammo implements PackNode {
		private String item;
		private boolean useOffhand;
		private boolean searchInventory;
		private boolean useInCreative;
	}
}

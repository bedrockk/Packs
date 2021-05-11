package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import com.bedrockk.packs.node.PackNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonSince("1.16.100")
public class ShooterDefinition implements ItemComponentNode {
	private List<Ammo> ammunition = new ArrayList<>();
	private int maxDrawDuration;
	private boolean scalePowerByDrawDuration = false;
	private boolean chargeOnDraw = false;

	@Data
	public static class Ammo implements PackNode {
		private String item;
		private boolean useOffhand = false;
		private boolean searchInventory = false;
		private boolean useInCreative = false;
	}
}
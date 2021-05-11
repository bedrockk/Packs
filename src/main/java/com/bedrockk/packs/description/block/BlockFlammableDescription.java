package com.bedrockk.packs.description.block;

import com.bedrockk.packs.description.BlockDescription;
import lombok.Data;

@Data
public class BlockFlammableDescription implements BlockDescription {
	private double burnOdds;
	private double flameOdds;
}

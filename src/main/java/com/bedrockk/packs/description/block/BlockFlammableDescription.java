package com.bedrockk.packs.description.block;

import com.bedrockk.packs.description.BlockDescription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class BlockFlammableDescription implements BlockDescription {
	private double burnOdds;
	private double flameOdds;
}

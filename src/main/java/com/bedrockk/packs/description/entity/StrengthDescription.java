package com.bedrockk.packs.description.entity;

import com.bedrockk.packs.description.EntityDescription;
import lombok.Data;

@Data
public class StrengthDescription implements EntityDescription {
	private int max = 5;
	private int value = 1;
}

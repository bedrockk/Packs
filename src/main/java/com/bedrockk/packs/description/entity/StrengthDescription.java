package com.bedrockk.packs.description.entity;

import com.bedrockk.packs.description.EntityDescription;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class StrengthDescription implements EntityDescription {
	@Builder.Default
	private int max = 5;
	@Builder.Default
	private int value = 1;
}

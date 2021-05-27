package com.bedrockk.packs.description.block;

import com.bedrockk.packs.annotation.JsonSince;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

@Data
@SuperBuilder
@Jacksonized
@EqualsAndHashCode(callSuper = true)
@JsonSince("1.16.100")
public class OnFallOnTriggerDescription extends BlockEventTriggerDescription {
	private double minFallDistance;
}

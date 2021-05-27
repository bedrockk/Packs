package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonUntil;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
@JsonUntil("1.16.100")
public class UseOnDefinition implements ItemComponentNode {
	@Singular
	private List<String> blocks;
}

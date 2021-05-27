package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class SetBookContentsFunction implements LootTableFunction {
	private String author;
	private String title;
	@Singular
	private List<String> pages;
}

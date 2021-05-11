package com.bedrockk.packs.definition.loot.function;

import com.bedrockk.packs.definition.loot.LootTableFunction;
import lombok.Data;

import java.util.List;

@Data
public class SetBookContentsFunction implements LootTableFunction {
	private String author;
	private String title;
	private List<String> pages;
}

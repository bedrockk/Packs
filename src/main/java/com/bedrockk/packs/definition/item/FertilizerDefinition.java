package com.bedrockk.packs.definition.item;

import com.bedrockk.packs.annotation.JsonSince;
import com.bedrockk.packs.node.ItemComponentNode;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.Locale;

@Data
@Builder
@Jacksonized
@JsonSince("1.16.100")
public class FertilizerDefinition implements ItemComponentNode {
	public Type type;

	public enum Type {
		BONEMEAL,
		RAPID;

		@Override
		public String toString() {
			return name().toLowerCase(Locale.ENGLISH);
		}
	}
}

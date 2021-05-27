package com.bedrockk.packs.definition.event.response;

import com.bedrockk.packs.definition.event.EventResponseDefinition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.file.Path;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SpawnLootResponseDefinition implements EventResponseDefinition {
	private Path table;
}
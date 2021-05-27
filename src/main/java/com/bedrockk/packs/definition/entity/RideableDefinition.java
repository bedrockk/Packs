package com.bedrockk.packs.definition.entity;

import com.bedrockk.packs.node.PackNode;
import com.bedrockk.packs.type.ExpressionNode;
import com.bedrockk.packs.type.ImmutableVec3;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class RideableDefinition implements EntityComponentDefinition {
	private int controllingSeat;
	@Builder.Default
	private boolean crouchingSkipInteract = true;
	@Singular
	private List<String> familyTypes;
	private String interactText;
	private boolean pullInEntities;
	private boolean riderCanInteract;
	@Builder.Default
	private int seatCount = 1;
	@Singular
	private List<Seat> seats;

	@Data
	@Builder
	@Jacksonized
	public static class Seat implements PackNode {
		private double lockRiderRotation;
		private int maxRiderCount;
		private int minRiderCount;
		private ImmutableVec3 position;
		private ExpressionNode rotateRiderBy;
	}
}
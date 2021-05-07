package com.bedrockk.behaviorpacks.definition.entity;

import com.bedrockk.behaviorpacks.node.PackNode;
import com.bedrockk.behaviorpacks.type.ExpressionNode;
import com.bedrockk.behaviorpacks.type.ImmutableVec3;
import lombok.Data;

import java.util.List;

@Data
public class RideableDefinition implements EntityComponentDefinition{
	private int controllingSeat = 0;
	private boolean crouchingSkipInteract = true;
	private List<String> familyTypes;
	private String interactText;
	private boolean pullInEntities = false;
	private boolean riderCanInteract = false;
	private int seatCount = 1;
	private List<Seat> seats;

	@Data
	public static class Seat implements PackNode {
		private double lockRiderRotation;
		private int maxRiderCount;
		private int minRiderCount;
		private ImmutableVec3 position;
		private ExpressionNode rotateRiderBy;
	}
}
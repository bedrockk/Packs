package com.bedrockk.behaviorpacks.definition;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
public class FilterDefinition implements Definition {
    private Operator operator;
    private Subject subject = Subject.SELF;
    private String test;
    private Object value;
    private String domain = null;
    private String target = null;
    private String otherWithFamilies = null;

    private List<FilterDefinition> allOf;
    private List<FilterDefinition> anyOf;
    private List<FilterDefinition> noneOf;

    @RequiredArgsConstructor
    public enum Operator {
        EQUALS("=="),
        NOT_EQUALS("!="),
        SMALLER("<"),
        SMALLER_OR_EQUALS("<="),
        NOT_EQUALS_2("<>"),
        EQUALS_SHORT("="),
        GREATER(">"),
        GREATER_OR_EQUALS(">="),
        LOGICAL_EQUALS("equals"),
        LOGICAL_NOT_EQUALS("not");

        private final String symbol;

        @JsonValue
        public String getSymbol() {
            return symbol;
        }
    }

    public enum Subject {
        BLOCK,
        DAMAGER,
        OTHER,
        PARENT,
        PLAYER,
        SELF,
        TARGET,
        BABY;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}

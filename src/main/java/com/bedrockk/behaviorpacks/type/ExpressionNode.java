package com.bedrockk.behaviorpacks.type;

import com.bedrockk.behaviorpacks.PackHelper;
import com.bedrockk.molang.MoLang;
import com.bedrockk.molang.parser.Expression;
import com.bedrockk.molang.runtime.MoLangRuntime;
import com.bedrockk.molang.runtime.value.MoValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class ExpressionNode {
    private final Object rawCode;
    private final List<Expression> expressions;

    @JsonCreator
    public ExpressionNode(int code) {
        this.rawCode = code;
        this.expressions = MoLang.newParser(String.valueOf(code)).parse();
    }

    @JsonCreator
    public ExpressionNode(double code) {
        this.rawCode = code;
        this.expressions = MoLang.newParser(String.valueOf(code)).parse();
    }

    @JsonCreator
    public ExpressionNode(float code) {
        this.rawCode = code;
        this.expressions = MoLang.newParser(String.valueOf(code)).parse();
    }

    @JsonCreator
    public ExpressionNode(String code) {
        this.rawCode = code;
        this.expressions = MoLang.newParser(code).parse();
    }

    public Object getRawCode() {
        return this.rawCode;
    }

    public String getRawCodeString() {
        return String.valueOf(this.rawCode);
    }

    public MoValue evaluate(MoLangRuntime runtime) {
        return this.evaluate(runtime, new HashMap<>());
    }

    public MoValue evaluate(MoLangRuntime runtime, Map<String, MoValue> context) {
        return runtime.execute(this.expressions, context);
    }

    @JsonValue
    public JsonNode toJson() {
        return PackHelper.toJsonNode(this.rawCode);
    }
}

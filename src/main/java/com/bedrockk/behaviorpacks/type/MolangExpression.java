package com.bedrockk.behaviorpacks.type;

import com.bedrockk.molang.MoLang;
import com.bedrockk.molang.parser.Expression;
import com.bedrockk.molang.runtime.MoLangRuntime;
import com.bedrockk.molang.runtime.value.MoValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class MolangExpression {
    private final String rawCode;
    private final List<Expression> expressions;

    @JsonCreator
    public MolangExpression(int code) {
        this(String.valueOf(code));
    }

    @JsonCreator
    public MolangExpression(double code) {
        this(String.valueOf(code));
    }

    @JsonCreator
    public MolangExpression(float code) {
        this(String.valueOf(code));
    }

    @JsonCreator
    public MolangExpression(String code) {
        this.rawCode = code;
        this.expressions = MoLang.newParser(code).parse();
    }

    public String getRawCode() {
        return rawCode;
    }

    public MoValue evaluate(MoLangRuntime runtime) {
        return this.evaluate(runtime, new HashMap<>());
    }

    public MoValue evaluate(MoLangRuntime runtime, Map<String, MoValue> context) {
        return runtime.execute(expressions, context);
    }

    @Override
    @JsonValue
    public String toString() {
        return this.rawCode;
    }
}

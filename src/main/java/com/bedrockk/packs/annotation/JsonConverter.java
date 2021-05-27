package com.bedrockk.packs.annotation;

import com.fasterxml.jackson.databind.util.Converter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface JsonConverter {

	Class<? extends Converter> current() default Converter.None.class;

	Class<? extends Converter> past() default Converter.None.class;
}

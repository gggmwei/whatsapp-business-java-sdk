package com.whatsapp.api.domain.messages.type;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The enum Parameter type.
 */
public enum ParameterType {
    /**
     * Text parameter type.
     */
    TEXT("text"),
    /**
     * Currency parameter type.
     */
    CURRENCY("currency"),
    /**
     * Date time parameter type.
     */
    DATE_TIME("date_time");

    private final String value;

    ParameterType(String value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    @JsonValue
    public String getValue() {
        return value;
    }
}

package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;

@Schema(description = "A test class")
public class TestModel {
    @JsonProperty(required = true)
    @Schema(description = "A test field", example = "1", required = true)
    @NotNull
    private Long testId;
}

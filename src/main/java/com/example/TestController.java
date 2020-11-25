package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

@Tags(value = { @Tag(name = "Test") })
@Controller
public class TestController {
    @Operation(summary = "Retrieves a test")
    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    public TestModel getAll() {
        return new TestModel();
    }
}

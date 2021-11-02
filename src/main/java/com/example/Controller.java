package com.example;

import jakarta.inject.*;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "My API",
                version = "0.1",
                description = "Awesome API"
        )
)
@Singleton
public class Controller {}


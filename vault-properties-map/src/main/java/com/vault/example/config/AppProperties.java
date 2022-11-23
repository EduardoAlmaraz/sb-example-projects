package com.vault.example.config;

import java.util.LinkedHashMap;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "mar.example")
@Getter
@Setter
public class AppProperties {
    
    /**
     * Propiedad Foo
     */
    private String foo;

    /*
     * Propiedades Bar
     */
    private LinkedHashMap<String, String> bar;

}

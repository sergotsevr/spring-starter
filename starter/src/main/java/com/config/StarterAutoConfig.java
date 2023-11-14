package com.config;

import com.service.ErrorPrinter;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(StarterConfig.class)
@ConditionalOnProperty(prefix = "starter", name = "enabled", havingValue = "true")
public class StarterAutoConfig {

    private final StarterConfig starterConfig;

    public StarterAutoConfig(StarterConfig starterConfig) {
        this.starterConfig = starterConfig;
    }

    @Bean
    public ErrorPrinter getPrinter() {
        return new ErrorPrinter(starterConfig.message());
    }

    @PostConstruct
    void postConstruct() {
        log.error("Starter initialized");
    }
}
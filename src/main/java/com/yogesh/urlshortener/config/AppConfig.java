// application.properties configuration
package com.yogesh.urlshortener.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class AppConfig {
    @Value("${spring.datasource.url}")
    private String databaseUrl;
    
    @Value("${spring.redis.host}")
    private String redisHost;
    
    @Value("${spring.redis.port}")
    private int redisPort;
} 
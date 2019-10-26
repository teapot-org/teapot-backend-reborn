package org.teapot.security;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.teapot.security.config.AppProperties;

@Configuration
@EnableConfigurationProperties(AppProperties.class)
@EntityScan
@ComponentScan
@EnableJpaRepositories
public class SecurityModule {
}

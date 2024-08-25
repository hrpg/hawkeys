package com.opencode.hawkeyes.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "hawkeyes.enabled", havingValue = "true")
public class HawkEyesAutoConfiguration {


}

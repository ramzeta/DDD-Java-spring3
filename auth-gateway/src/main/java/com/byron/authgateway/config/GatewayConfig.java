package com.byron.authgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
        @Bean
        public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
                return builder.routes()
                                .route("ms-users-route", r -> r.path("/v1/users/**")
                                                .uri("lb://ms-users"))
                                .route("ms-profiles-route", r -> r.path("/v1/profiles/**")
                                                .uri("lb://ms-profiles"))
                                .build();
        }
}

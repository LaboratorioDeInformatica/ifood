package br.com.fiap.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

public class SpringCloudConfig {
	
	 public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	                .route(r -> r.path("/purchase/**")
	                        .uri("lb://purchase")
	                      //  .id("employeeModule")
	                        )

	                .route(r -> r.path("/voucher/**")
	                        .uri("lb://voucher")
	                        //.id("consumerModule")
	                        )
	                .build();
	    }

}

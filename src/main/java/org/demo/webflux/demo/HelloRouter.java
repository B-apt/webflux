package org.demo.webflux.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class HelloRouter {

    @Bean
    public RouterFunction<ServerResponse> routerFunction(HelloHandler helloHandler) {
        return RouterFunctions.route(
                RequestPredicates
                        .GET("/reactive")
                        .and(RequestPredicates.contentType(MediaType.TEXT_PLAIN)), HelloHandler::hello);

    }
}

package org.demo.webflux.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {


    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public Mono<ServerResponse> helloWorld() {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromValue("Greetings everyone"));
    }

    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloSimple() {
        return "A simple hello from the controller";
    }

}

package org.demo.webflux.demo.controller;

import org.demo.webflux.demo.data.Shipwreck;
import org.demo.webflux.demo.repositories.ShipwreckReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/wrecks")
public class ShipwreckController {

    @Autowired
    private ShipwreckReactiveRepository shipwreckReactiveRepository;

//    @Autowired
//    public ShipwreckController(ShipwreckReactiveRepository reactiveRepository) {
//        this.shipwreckReactiveRepository = reactiveRepository;
//    }

    @GetMapping()
    public @ResponseBody
    Mono<Shipwreck> getOneShipwreck() {
        // Shipwreck res = shipwreckReactiveRepository.findById("578f6fa2df35c7fbdbaed8c4").block(Duration.ofSeconds(3));
        System.out.println("getOneShipwreck() called");
        return shipwreckReactiveRepository.findById("578f6fa2df35c7fbdbaed8c4");
    }

    @GetMapping("/count")
    public @ResponseBody Mono<Long> getShipwreckCount() {
        Mono<Long> count = shipwreckReactiveRepository
                .count();
//                .onErrorMap(throwable -> throwable.printStackTrace());
        return count;
    }

    @GetMapping("/a")
    public @ResponseBody String test() {
        return "hot reload working";
    }

    @GetMapping("/all")
    public @ResponseBody
    Flux<Shipwreck> getAllShipwrecks() {
        //Flux<Shipwreck> res = shipwreckReactiveRepository.count()
        return shipwreckReactiveRepository.findAll().take(1000).onErrorReturn(new Shipwreck());
    }

    // Tweets are Sent to the client as Server Sent Events
    @GetMapping(value = "/stream", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Shipwreck> streamAllShipwrecks() {
        return shipwreckReactiveRepository.findAll();
    }


}

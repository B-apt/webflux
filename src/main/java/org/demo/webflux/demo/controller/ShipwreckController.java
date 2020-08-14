package org.demo.webflux.demo.controller;

import org.demo.webflux.demo.data.Shipwreck;
import org.demo.webflux.demo.repositories.ShipwreckReactiveRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/wrecks")
public class ShipwreckController {

    private final Logger LOG = LoggerFactory.getLogger(ShipwreckController.class);

    @Autowired
    private ShipwreckReactiveRepository shipwreckReactiveRepository;

    @GetMapping()
    public @ResponseBody
    Mono<Shipwreck> getOneShipwreck() {
        return shipwreckReactiveRepository.findById("578f6fa2df35c7fbdbaed8c4");
    }

    @GetMapping("/count")
    public @ResponseBody Mono<Long> getShipwreckCount() {
        Mono<Long> count = shipwreckReactiveRepository
                .count();
        return count;
    }

    @GetMapping("/a")
    public @ResponseBody String test() {
        return "hot reload working";
    }

    @GetMapping("/all")
    public @ResponseBody
    Flux<Shipwreck> getAllShipwrecks() {
        return shipwreckReactiveRepository.findAll().take(1000).onErrorReturn(new Shipwreck());
    }

    // Tweets are Sent to the client as Server Sent Events
    @GetMapping(value = "/stream", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<List<Shipwreck>> streamAllShipwrecks() {
        AtomicLong count = new AtomicLong();
        return shipwreckReactiveRepository
                .findAll()
                .buffer(100)
                .doOnEach(
                    listSignal ->
                            LOG.debug("streamAllShipwrecks() - Number of packet of shipwrecks retrieved={}",
                                    count.incrementAndGet()));
    }

    @GetMapping(value = "/closest", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Shipwreck> findClosest(@RequestParam double x_coordinates, @RequestParam double y_coordinates) {
        LOG.debug("findClosest() called with coordinates (x:{}, y:{})", x_coordinates, y_coordinates);
        return shipwreckReactiveRepository.findClosest(x_coordinates, y_coordinates);
    }


}

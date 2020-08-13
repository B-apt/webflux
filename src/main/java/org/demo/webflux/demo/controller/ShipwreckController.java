package org.demo.webflux.demo.controller;

import org.demo.webflux.demo.repositories.ShipwreckReactiveRepository;
import org.demo.webflux.demo.data.Shipwreck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@Controller
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
        System.out.println("getOneShipwreck() called");
        return shipwreckReactiveRepository.findById("578f6fa2df35c7fbdbaed8c4");
    }
}

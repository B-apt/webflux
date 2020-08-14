package org.demo.webflux.demo.repositories;

import org.demo.webflux.demo.data.Shipwreck;
import reactor.core.publisher.Flux;

public interface CustomShipwreckRepository {

    // https://dev.to/andreevich/how-to-build-custom-queries-with-spring-data-reactive-mongodb-1802


    Flux<Shipwreck> findByWaterlevel(double waterlevel);

}

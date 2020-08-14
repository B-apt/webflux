package org.demo.webflux.demo.repositories;

import org.demo.webflux.demo.data.Shipwreck;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ShipwreckReactiveRepository extends ReactiveMongoRepository<Shipwreck, String> {

    Mono<Shipwreck> findById(String id);

    Flux<Shipwreck> findAllBy();

}

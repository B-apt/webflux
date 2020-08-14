package org.demo.webflux.demo.repositories;

import org.demo.webflux.demo.data.Shipwreck;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ShipwreckReactiveRepository extends ReactiveMongoRepository<Shipwreck, String>, CustomShipwreckRepository {

    Mono<Shipwreck> findById(String id);

    Flux<Shipwreck> findAllBy();

    @Query(value = "{\"coordinates\":\n" +
            "       { $near :\n" +
            "          {\n" +
            "            $geometry : {\n" +
            "               type : \"Point\" ,\n" +
            "               coordinates : [ ?0, ?1] }\n" +
            "          }\n" +
            "       }}")
    Flux<Shipwreck> findClosest(double x_coordinates, double y_coordinates);

}

package org.demo.webflux.demo.repositories;

import org.demo.webflux.demo.data.Shipwreck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import reactor.core.publisher.Flux;

/**
 * https://dev.to/andreevich/how-to-build-custom-queries-with-spring-data-reactive-mongodb-1802
 */
public class CustomShipwreckRepositoryImpl implements CustomShipwreckRepository {

    private final ReactiveMongoTemplate mongoTemplate;

    @Autowired
    public CustomShipwreckRepositoryImpl(ReactiveMongoTemplate mongoT) {
        this.mongoTemplate = mongoT;
    }

    @Override
    public Flux<Shipwreck> findByWaterlevel(double waterlevel) {
        Query q = new Query(Criteria.where("watlev").in("always dry"));
        return mongoTemplate.find(q, Shipwreck.class);
    }
}

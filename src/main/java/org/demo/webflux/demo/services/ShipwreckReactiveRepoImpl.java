//package org.demo.webflux.demo.services;
//
//import org.demo.webflux.demo.data.Shipwreck;
//import org.demo.webflux.demo.repositories.ShipwreckReactiveRepository;
//import org.reactivestreams.Publisher;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Sort;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//
//public class ShipwreckReactiveRepoImpl implements ShipwreckReactiveRepository {
//
//    @Override
//    public <S extends Shipwreck> Mono<S> save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Flux<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Flux<S> saveAll(Publisher<S> publisher) {
//        return null;
//    }
//
//    @Override
//    public Mono<Shipwreck> findById(String id) {
//        return null;
//    }
//
//    @Override
//    public Mono<Shipwreck> findById(Publisher<String> publisher) {
//        return null;
//    }
//
//    @Override
//    public Mono<Boolean> existsById(String s) {
//        return null;
//    }
//
//    @Override
//    public Mono<Boolean> existsById(Publisher<String> publisher) {
//        return null;
//    }
//
//    @Override
//    public Flux<Shipwreck> findAll() {
//        return null;
//    }
//
//    @Override
//    public Flux<Shipwreck> findAllById(Iterable<String> iterable) {
//        return null;
//    }
//
//    @Override
//    public Flux<Shipwreck> findAllById(Publisher<String> publisher) {
//        return null;
//    }
//
//    @Override
//    public Mono<Long> count() {
//        return null;
//    }
//
//    @Override
//    public Mono<Void> deleteById(String s) {
//        return null;
//    }
//
//    @Override
//    public Mono<Void> deleteById(Publisher<String> publisher) {
//        return null;
//    }
//
//    @Override
//    public Mono<Void> delete(Shipwreck shipwreck) {
//        return null;
//    }
//
//    @Override
//    public Mono<Void> deleteAll(Iterable<? extends Shipwreck> iterable) {
//        return null;
//    }
//
//    @Override
//    public Mono<Void> deleteAll(Publisher<? extends Shipwreck> publisher) {
//        return null;
//    }
//
//    @Override
//    public Mono<Void> deleteAll() {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Mono<S> insert(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Flux<S> insert(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Flux<S> insert(Publisher<S> entities) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Mono<S> findOne(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Flux<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Flux<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Mono<Long> count(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Shipwreck> Mono<Boolean> exists(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public Flux<Shipwreck> findAll(Sort sort) {
//        return null;
//    }
//}

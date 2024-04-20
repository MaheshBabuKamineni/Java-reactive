package com.mahesh.sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonotoFlux {

    public static void main(String[] args) {
        Mono<String> m=Mono.just("a");
        Flux<String> f=Flux.from(m);
        f.subscribe(Util.onNext());
    }
}

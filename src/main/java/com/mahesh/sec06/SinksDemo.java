package com.mahesh.sec06;

import courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class SinksDemo {
    public static void main(String[] args) {
        Sinks.Many<Object> sinks=Sinks.many().unicast().onBackpressureBuffer();
        Flux<Object> flux=sinks.asFlux();
        flux.subscribe(Util.onNext());
        sinks.tryEmitNext("hi");
        sinks.tryEmitNext("how are you");
    }
}

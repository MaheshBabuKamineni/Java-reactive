package com.mahesh.sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;

public class Fluxdemo {
    public static void main(String[] args) {
        Flux<Integer> f=Flux.just(1,2,3,3,3,3,3,3,3,3,3);
        f.subscribe(Util.onNext());
    }
}

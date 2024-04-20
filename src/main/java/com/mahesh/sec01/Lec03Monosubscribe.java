package com.mahesh.sec01;

import courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec03Monosubscribe {
    public static void main(String[] args) {
        Mono<Integer> m=Mono.just("Mahesh")
                        .map(s->s.length());


        m.subscribe(
                Util.onNext(),
               Util.onError(),
        Util.onComplete()

        );

    }
}

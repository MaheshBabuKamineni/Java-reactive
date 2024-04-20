package com.mahesh.sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;

public class FluxStream {
    public static void main(String[] args) {
        Flux<String> s=Flux.just("Mahesh");
        for(int i=0;i<10;i++) {

            s.subscribe(

                    Util.onNext()
        );
        }
    }
}

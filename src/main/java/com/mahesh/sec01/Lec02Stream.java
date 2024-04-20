package com.mahesh.sec01;

import reactor.core.publisher.Mono;

public class Lec02Stream {


    public static void main(String[] args) {
        Mono<Integer> m=Mono.just(1);
        System.out.println(m);
        m.subscribe(i->System.out.println("Received:" +i));
    }
}

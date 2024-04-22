package com.mahesh.sec05;

import courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

public class Repeat {

    public static void main(String[] args) {
        getIntegres().repeat(1).subscribe(Util.onNext());

    }
    private static Flux<Integer> getIntegres()
    {
       return Flux.range(1,10).doOnSubscribe(s->System.out.println("Subscribed"))
                .doOnComplete(()->System.out.println("Completed"));

    }

}

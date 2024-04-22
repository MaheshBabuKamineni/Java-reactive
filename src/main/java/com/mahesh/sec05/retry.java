package com.mahesh.sec05;

import courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicInteger;

public class retry {
    private static AtomicInteger atomicInteger=new AtomicInteger(1);
    public static void main(String[] args) {
        getIntegers().retry(2).subscribe(Util.onNext());

    }
    private static Flux<Integer> getIntegers()
    {
        return Flux.range(1,10).doOnSubscribe(s->System.out.println("Subscribed"))
                .doOnComplete(()->System.out.println("Completed")).map(i->i/0).doOnError(err->System.out.println("Divide by Zero"));

    }
}

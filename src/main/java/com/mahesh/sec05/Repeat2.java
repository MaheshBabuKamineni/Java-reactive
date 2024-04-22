package com.mahesh.sec05;

import courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicInteger;

public class Repeat2 {
    private static AtomicInteger atomicInteger=new AtomicInteger(1);
    public static void main(String[] args) {
        getIntegres().repeat(()->atomicInteger.get()<14).subscribe(Util.onNext());

    }
    private static Flux<Integer> getIntegres()
    {
        return Flux.range(1,10).doOnSubscribe(s->System.out.println("Subscribed"))
                .doOnComplete(()->System.out.println("Completed")).map(i->atomicInteger.getAndIncrement());

    }
}

package com.mahesh.sec01;

import com.github.javafaker.Faker;
import courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;

public class MonoSupplier {
    public static void main(String[] args) {
        Mono<String> m=Mono.just(getName());
        m.subscribe(
                Util.onNext()
        );
        Mono<String> n=Mono.fromSupplier(()->getName());
        n.subscribe(Util.onNext());

        Mono<String> j=Mono.fromCallable(()->getName());
        j.subscribe(Util.onNext());

    }
    private static String getName()
    {
        System.out.println("Genreating Name...");
        return Faker.instance().name().fullName();
    }
}

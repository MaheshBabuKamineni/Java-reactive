package com.mahesh.sec02;

import com.github.javafaker.Faker;
import courseutil.Util;
import reactor.core.publisher.Flux;

public class Fluxgenerate {
    public static void main(String[] args) {

        Flux.generate(synchronousSink -> {

            String country= Faker.instance().country().name();
            synchronousSink.next(country);
            if(country.toLowerCase().equals("canada"))
            {
                synchronousSink.complete();
            }
        }).subscribe(Util.onNext());
    }
}

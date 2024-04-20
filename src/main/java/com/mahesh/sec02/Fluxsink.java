package com.mahesh.sec02;

import com.github.javafaker.Faker;
import courseutil.Util;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.ForkJoinTask;

public class Fluxsink {

    public static void main(String[] args) {
        Flux.generate(synchronousSink -> {
                   synchronousSink.next(Faker.instance().country().name());

                }).take(3)
                .subscribe(Util.onNext());
    }
}

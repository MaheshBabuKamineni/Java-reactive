package com.mahesh.sec05;

import courseutil.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class Buffer {
    public static void main(String[] args) {
        eventStream()
                .window(5)
                .flatMap(flux -> flux.collectList().map(list -> String.join(", ", list)))
                .doOnNext(System.out::println)
                .blockLast(); // Ensure the program waits for the Flux to complete before exiting

    }

    private static Flux<String> eventStream() {
        return Flux.interval(Duration.ofMillis(100))
                .map(i -> "event" + i)
                .take(20); // To limit the number of events for demonstration
    }
}

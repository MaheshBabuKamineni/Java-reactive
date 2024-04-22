package com.mahesh.sec08;

import reactor.core.publisher.Flux;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

public class TestingDemo {

    @Test
    public void test1()

    {
        Flux<Integer> just=Flux.just(1,2,3);
        StepVerifier.create(just).expectNext(1).expectNext(2).expectNext(3).verifyComplete();
    }
}

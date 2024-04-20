package com.mahesh.sec02;

import courseutil.Util;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class CustomSubscriber {


    public static void main(String[] args) throws InterruptedException {
        AtomicReference<Subscription> at=new AtomicReference<>();
        Flux.range(1,20).subscribeWith(new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Subscription subscription) {
                     System.out.println("received Sub" +subscription);
                     at.set(subscription);
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("onNext" +integer);

            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError,"+ throwable.getMessage());

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete" );

            }
        });

   Util.Sleepseconds(1000);



            at.get().request(5);
        Util.Sleepseconds(2000);
            at.get().request(5);

    }
}

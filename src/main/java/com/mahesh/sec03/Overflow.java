package com.mahesh.sec03;

import courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Overflow {
    public static void main(String[] args) throws InterruptedException {
        Flux.create(fluxsink->
        {
            for(int i=1;i<201;i++)
            {
                fluxsink.next(i);
                System.out.println("Pushed" + i);
            }


        })
                .onBackpressureError()
                .publishOn(Schedulers.boundedElastic())
                .doOnNext(i->{
                    Util.Sleepseconds(80);
                })


                .subscribe(
               o-> System.out.println("Recived" + 0)
                  );
        Util.Sleepseconds(10);

    }
}

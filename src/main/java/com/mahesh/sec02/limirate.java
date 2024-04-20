package com.mahesh.sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;

public class limirate {
    public static void main(String[] args) {
        Flux.range(1,10000).limitRate(100000).subscribe(Util.onNext());
    }
}

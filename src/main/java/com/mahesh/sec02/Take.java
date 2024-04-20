package com.mahesh.sec02;

import courseutil.Util;
import reactor.core.publisher.Flux;

public class Take {
    public static void main(String[] args) {
        Flux.range(1,20).take(5).subscribe(Util.onNext());
    }
}

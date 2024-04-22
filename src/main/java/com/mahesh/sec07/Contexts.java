package com.mahesh.sec07;

import courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.util.context.Context;

public class Contexts {
    public static void main(String[] args) {
        getWelcomeMessage().contextWrite(Context.of("user","mahesh")).subscribe(Util.onNext());

    }
    private static Mono<String> getWelcomeMessage()
    {
        return Mono.deferContextual(ctx->
        {
            if(ctx.hasKey("user"))
            {
                return Mono.just("Welcome" +ctx.get("user"));

            }else{
                return Mono.error(new RuntimeException("unauthenticated"));
            }

        });
    }
}

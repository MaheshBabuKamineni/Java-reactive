package com.mahesh.sec01;

import java.util.stream.Stream;

public class Lec01Stream {

    @Override
    public String toString() {
        return "Lec01Stream{}";
    }

    public static void main(String[] args) {
        Stream<Integer> st=Stream.of(1)
                .map(i->
                {
                    try
                    {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return i*2;
                });
st.forEach(System.out::println);
    }
}

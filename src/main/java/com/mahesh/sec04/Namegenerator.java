package com.mahesh.sec04;

import com.github.javafaker.Faker;
import reactor.core.publisher.Flux;

public class Namegenerator {
    public static void main(String[] args) {
        Namegenerator name=new Namegenerator();
        name.generatenames().take(5).subscribe(
                o-> System.out.println("Name" + o)
        );

    }
  public Flux<String> generatenames()
  {
     return Flux.generate(stringSynchronousSink -> {
         String name= String.valueOf(Faker.instance().name().firstName());
         stringSynchronousSink.next(name);
     });

  }
}


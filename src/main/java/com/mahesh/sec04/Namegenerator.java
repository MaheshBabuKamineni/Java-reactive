package com.mahesh.sec04;

import com.github.javafaker.Faker;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class Namegenerator {
    public static void main(String[] args) {
        Namegenerator name=new Namegenerator();
        name.generatenames().take(5).subscribe(
                o-> System.out.println( o)
        );

    }
    private List<String> names=new ArrayList<>();
  public Flux<String> generatenames()
  {
     return Flux.generate(stringSynchronousSink -> {
         String name= String.valueOf(Faker.instance().name().firstName());
         names.add(name);
         stringSynchronousSink.next(name);
     }).cast(String.class)
             .startWith(getfromcache());

  }
  private Flux<String> getfromcache()
  {
      return Flux.fromIterable(names);
  }
}


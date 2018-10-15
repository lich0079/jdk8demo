package jdk8demo.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        System.out.println("stream--------------------");
        Stream<Integer> s =  list.stream();
        s.filter(i -> i%2==0).forEach(i -> System.out.println(i));
        
        System.out.println(list.stream().filter(i -> i>2).toString());
        
        System.out.println("parallelStream--------------------");
        list.parallelStream().filter(i -> i%2==0).forEach(i -> System.out.println(i));
        
        System.out.println("sum--------------");
        System.out.println(list.stream().reduce((i,j) -> i+j).get());
        
        
        
        System.out.println(Stream.of(1,2,3,4,5).reduce((i,j) -> i+j).get());
        System.out.println(Stream.of(1).reduce((i,j) -> i+j).get());
        System.out.println(Stream.of(0,0).reduce((i,j) -> i+j).get());
    }
}

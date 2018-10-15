package jdk8demo.jdk8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        String str = "log";
        
        list.forEach(x -> System.out.println(x));
        
        list.forEach(x -> {
            System.out.println(x);
            System.out.println(x+"  " + str);
        });
        
        List<String> test = new ArrayList<String>();
        test.add("xxxx");
        
        for (int i = 0; i < 10; i++) {
            test.add("xxx");
        }
        
        System.out.println(test.stream().filter(String::isEmpty).count());
    }
}

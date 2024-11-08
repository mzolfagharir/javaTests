package src.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Collection nums = new ArrayList(100);
        Random rand = new Random();
        for(int i=1; i<=100; i++){
            nums.add(rand.nextInt(100_000));
        }
        //Using Method Reference
        nums.forEach(System.out::println);

    }
}

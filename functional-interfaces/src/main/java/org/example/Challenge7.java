package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Challenge7 {

    /**
     * Create a Consumer which takes in a List of Integers and squares each number.
     *
     * Write another Consumer which prints a result to the console.
     *
     * Using .andThen(), call your functions by their variable name and print the results of the following ArrayList:
     * */

    static Consumer<List<Integer>> squareEachNumber = numbers -> {
        for(int i=0; i< numbers.size();i++){
            numbers.set(i, numbers.get(i) * numbers.get(i));
        }
    };

    static Consumer<List<Integer>> printAllNumbers = nums-> nums.forEach(System.out::println);

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(3);
        numList.add(6);
        numList.add(67);
        squareEachNumber.andThen(printAllNumbers).accept(numList);

    }
}

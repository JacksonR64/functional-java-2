package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task1 data setup
        List<String> emaiList = new ArrayList<>();
        emaiList.add("simon.morgan@northcoders.com");
        emaiList.add("chris.ward@northcoders.com");
        emaiList.add("info@stackoverflow.com");
        emaiList.add("hannah.montana@mileycyrus.com");
        //task1 invoke
        emaiList.forEach(Challenge1.printAtSignIndex);
        //task2 invoke
        System.out.println(Challenge1.listofEmails.get());
        //task3 invoke
        emaiList.forEach(Challenge1.lengthOfEmailIsOverFive);
        //task4 invoke
        //what is the side effect of calling functional interface impl with an instance vs Static invocation?
        Challenge4 challenge4 = new Challenge4();
        emaiList.forEach(challenge4.printUserName);
        //emaiList.forEach(Challenge4.printUserName);

        //task5 invoke
        HashMap<String,Integer> nameAndAgeMap = new HashMap<>();
        nameAndAgeMap.put("John",25);
        nameAndAgeMap.put("Donna",27);
        nameAndAgeMap.put("Piyush",22);
        //Challenge5 challenge5 = new Challenge5();
        nameAndAgeMap.forEach(Challenge5.greetUser);

    }
}

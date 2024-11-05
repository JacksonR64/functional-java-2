package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> emaiList = new ArrayList<>();
        emaiList.add("simon.morgan@northcoders.com");
        emaiList.add("chris.ward@northcoders.com");
        emaiList.add("info@stackoverflow.com");
        emaiList.add("hannah.montana@mileycyrus.com");

        emaiList.stream().forEach(Challenge1.printAtSignIndex);

    }
}

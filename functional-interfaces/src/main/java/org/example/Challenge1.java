package org.example;

import java.util.function.Consumer;

public class Challenge1 {
//    public static void challenge1() {
//    }
    static Consumer<String> printAtSignIndex = email -> {
        System.out.println(email.indexOf('@'));
    };
}

package org.example;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Challenge1 {
//    public static void challenge1() {
//    }
    static Consumer<String> printAtSignIndex = email -> {
        System.out.println(email.indexOf('@'));
    };

    static Supplier<List<String>> listofEmails = ()->List.of("simon.morgan@northcoders.com","chris.ward@northcoders.com","info@stackoverflow.com","hannah.montanna@mileycyrus.com");

    /** Task3
     * Create a Consumer which checks whether the length of a String is over 5 characters long. If so, print this to the console with an exclamation point ! added to the end of the String.
     *
     * Apply this for each String in a stream.
     * */
    static Consumer<String> lengthOfEmailIsFive = email-> System.out.println(email.length()>5?email+"!": "");
//    {
//        if (email.length() > 5) {
//            System.out.println(email + "!");
//        } else {
//            System.out.println(email);
//        }
//    } ;

}

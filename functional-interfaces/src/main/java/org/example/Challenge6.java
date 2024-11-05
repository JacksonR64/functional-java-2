package org.example;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Challenge6 {
    /**
     * Create a Supplier which has a List of Strings assigned to a variable, using the list of email addresses from the previous examples.
     *
     * Then, write a consumer which will print each of these to the console.
     *
     * Call the Consumer variable and .accept() the Supplier as an argument.
     * **/
    //supplier

    public static void main(String[] args) {
        List<String> emails = Challenge1.listofEmails.get();
        Consumer<List<String>>printEmails = emailList -> emailList.forEach(System.out::println);
        printEmails.accept(emails);

    }
}

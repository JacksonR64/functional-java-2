package org.example;

import java.util.function.BiConsumer;


public class Challenge5 {
    /**
     * Create a BiConsumer which takes in a name and age and prints both to the console with a nice greeting message.
    **/
    static BiConsumer<String,Integer> greetUser = (name,age)-> System.out.printf("Hey There, %s! Congratulations on turning %d!%n", name,age);
            //STR."Hey There, : \{name},how are you?";
}

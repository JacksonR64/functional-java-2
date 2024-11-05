package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Challenge8 {

    // Create a BiConsumer which checks the contents of two Integer lists for equality and prints "True" to the console if they are equal and "False" if not.
    static BiConsumer<List<Integer>, List<Integer>> compareLists = (list1, list2) -> {

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1.equals(list2));
    };

}

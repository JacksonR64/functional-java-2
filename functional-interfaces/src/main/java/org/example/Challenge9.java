package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Challenge9 {



    static Supplier<List<String>> emailList = () -> {
        List<String> emailList = new ArrayList<>();
        emailList.add("simon.morgan@northcoders.com");
        emailList.add("chris.ward@northcoders.com");
        emailList.add("mario@plumbing.it");
        emailList.add("link@hyrule.co.uk");
        emailList.add("shrek@duloc.com");
        emailList.add("ellie@northcoders.js");
        emailList.add("java@oracle.jvm");
        emailList.add("ziggy@spidersfrommars.co.uk");
        emailList.add("lemmy@motorhead.co,uk");
        emailList.add("me@myhouse.sleep");
        return emailList;
    };

    static Predicate<String> isUkDomain = email -> email.endsWith(".co.uk");
    static Predicate<String> isDotCom = email -> email.endsWith(".com");
//    static Predicate<String> isValidEmail2 = email -> isUkDomain.negate().and(isDotCom.negate());

    static Predicate<String> isValidEmail = isUkDomain.negate().and(isDotCom.negate());
//    static Predicate<String> isValidEmail3 = email -> (isUkDomain.test(email) && isDotCom.test(email));


    static BiFunction<Supplier<List<String>>, Predicate<String>, List<String>> emailSorter = (emails, condition) -> emails.get().stream().filter(condition).toList();
}

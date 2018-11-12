package com.anthony.lambda.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        //Challenge1 : Convert this anonymous class as a lambda expression
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for(String part: parts){
//                    System.out.println(part);
//                }
//            }
//        };
//        runnable.run();

        //Solution to first part of challenge
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        runnable.run();

        System.out.println(everySecondChar("Lou"));

        //Solution to challenge2
        Function<String, String> lambdaFunction = (String s1) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s1.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s1.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(lambdaFunction.apply("1234567890"));

        //Challenge4 calling the method we made for challenge3
        String result = everySecondChar(lambdaFunction, "1234567890");
        System.out.println(result);

        //Challenge5 write a lambda expression that maps to the util.java.Supplier interface
        Supplier<String> iLoveJava = () -> "I Love Java";
        System.out.println(iLoveJava.get());

        //Challenge6 Given this list, using lambdas where possible, print this list with the first letter in each name
        //uppercase and sort the list
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> copyNames2015 = new ArrayList<>();
//        topNames2015.forEach(s -> copyNames2015.add(s.substring(0,1).toUpperCase() + s.substring(1)));
////        copyNames2015.sort((s1,s2) -> s1.compareTo(s2));
////        copyNames2015.forEach(s -> System.out.println(s));
//
//        //Challenge7 change the code so that it uses method references
//        copyNames2015.sort(String::compareTo);
//        copyNames2015.forEach(System.out::println);

        //challenge 8 is the same idea as previous code except to to now use streams
        topNames2015.stream()
                     .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                     .sorted(String::compareTo)
                     .forEach(System.out::println);

        //challenge 9 is to print out how many sorted names begin with the letter A
        long nameBeginsWIthA = topNames2015.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("Number of names that begin with A is " + nameBeginsWIthA);

        //Challenge10 this prints out nothing because the chain doesn't contain a terminal operation
        topNames2015.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo);

        //Challenge11 add a terminal operation so that the peek call will execute
        topNames2015.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count();

    }

    //Challenge2 write this method as a lambda expression
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i<source.length(); i++){
            if(i%2==1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    //Challenge3 instead of executing Function directly, pass it to a method and return the output with a source
    public static String everySecondChar(Function<String,String> function, String source){
        return function.apply(source);
    }

}

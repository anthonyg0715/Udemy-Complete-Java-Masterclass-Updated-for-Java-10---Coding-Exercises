package com.anthony.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        String regEx = "I want a \\w*.";
        System.out.println(challenge1.matches(regEx));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regEx));

        //Challenge 3 - Use the Matcher().matches method instead of String.matches() for our previous regEx.
        Pattern challenge3 = Pattern.compile(regEx);
        Matcher m1 = challenge3.matcher(challenge1);
        m1 = challenge3.matcher("I want a ball.");
        System.out.println(m1.matches());
        System.out.println(m1.matches());

        //Challenge 4 - Replace all occurrences of blank with an underscore for the following string
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s","_"));

        //Challenge 5 - Write a regular expression that will match the following string in it's entirety. Use the
        //String.matches() method to verify your answer
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]*"));
        System.out.println(challenge5.matches("[a-g]*"));
        System.out.println(challenge5.matches("\\w*"));

        //Challenge6 - Write a regular expression that will only match the challenge 5 string in its entirety.
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        //Challenge 7 - Write a regular expression that will match a string that starts with a series of letters. The
        //letters must be followed by a period. After the period there must be a series of digits.
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[a-zA-Z]*\\.\\d*$"));

        //Challenge 8 - Modify the regular expression in challenge 7 to use a group, so that we can print all the digits
        //that occur in a string that contains multiple occurrences of the pattern.
        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern p1 = Pattern.compile("^[a-zA-Z]*\\.(\\d*)[a-zA-Z]*\\.(\\d*)[a-zA-Z]*\\.(\\d*)$");
        Matcher m2 = p1.matcher(challenge8);
        while(m2.find()){
            System.out.println("Occurrences: " + m2.group(1) + m2.group(2) + m2.group(3));
        }

        //Challenge 9 - Let's suppose we're reading strings that match the patterns we used in challenge 7 and 8 from a
        //file. Tabs are used to separate the matches, with one exception. The last match is followed by a newline. Our
        //revised challenge8 string would like like this.

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern p2 = Pattern.compile("^[a-zA-Z]*\\.(\\d*)\\s*[a-zA-Z]*\\.(\\d*)\\s*[a-zA-Z]*\\.(\\d*)\\s*$");
        Matcher m3 = p2.matcher(challenge9);
        while(m3.find()){
            System.out.println("Occurrences: " + m3.group(1) + m3.group(2) + m3.group(3));
        }

        //Challenge 10 - Instead of printing out the numbers themselves, print out their start and end indices.
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern p3 = Pattern.compile("[a-zA-Z]+\\.(\\d+)\\s");
        Matcher m4 = p3.matcher(challenge10);
        while(m4.find()){
            System.out.println("Occurrence start = " + m4.start(1) + " end = " + (m4.end(1)-1));
        }

        //Challenge 11 - Suppose we have the following String containing points on a graph within curly braces.
        //Extract whats in the curly braces.

        String challenge11 = "{0,2},{0,5},{1,3},{2,4}";
        Pattern p4 = Pattern.compile("\\{(.*?)}");
        Matcher m5 = p4.matcher(challenge11);
        while(m5.find()){
            System.out.println("Occurrence " + m5.group(1));
        }

        System.out.println();

        String challenge11a = "{0,2}, {0,5}, {1,3}, {2,4}, {x,y}, {6,34}, {11,12}";
        Pattern p5 = Pattern.compile("\\{(\\d+,\\d+)}");
        Matcher m6 = p5.matcher(challenge11a);
        while(m6.find()){
            System.out.println("Occurrence " + m6.group(1));
        }

        //Challenge 12 - Write a regular expression that will match a 5-digit US Zip Code. Use "11111" as your test
        //String.
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^(\\d+){5}$"));

        //Challenge 13 - US Zip Codes can be followed by a dash and another four numbers. Write a regular expression
        //that will match those zip codes. Use "11111-1111" as your test string.
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^(\\d+){5}-(\\d+){4}$"));

        //Challenge 14 - Write a regular expression that will match 5-digit US zip codes and zip codes that contain
        //the optional 4 digits preceded by a dash
        String challenge14 = "11111-1111";
        System.out.println(challenge14.matches("^((\\d+){5}|(\\d+){5}-(\\d+){4}$)"));
    }




}

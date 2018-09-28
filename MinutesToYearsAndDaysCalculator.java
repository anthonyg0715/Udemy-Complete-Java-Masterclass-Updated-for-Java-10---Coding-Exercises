/*
@Author Anthony Garzon
@Date 9/28/2018
@Program Name: Minutes To Years And Days Calculator
@Description: Write a program that calculates given minutes to years and days.
Hints: hour = 60min, 1day = 24hrs, 1yr = 365days
 */
public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = (minutes / 60) / 24 / 365;//to get years we divide minutes by 60 24 and 365
            long days = (minutes / 60) / 24;// then for days we only need 60 and 24
            long remainingDays = (days % 365);// to figure out remaining days in a year we mod by 365
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }

    }
}

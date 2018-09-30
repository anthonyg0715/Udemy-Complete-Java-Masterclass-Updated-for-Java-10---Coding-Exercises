/*
@Author Anthony Garzon
@Date 9/29/2018
@Program Number Palindrome
@Description Write a program to determine if a given number is a palindrome.
Hint: A palindrome is a number that when reversed is equal to the original number
 */
public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));//should return true
        System.out.println(isPalindrome(707));//should return true
        System.out.println(isPalindrome(11212));//should return false

    }

    public static boolean isPalindrome(int number){

        int a = number , reverse=0;

        while (a != 0){
            //For the modulo part we are extracting the last digit of the given number
            //And then we multiply the quotient * 10 to make the end of the number zero
            //then we just add them together to be able to check if that reversed number equals the original given number
            reverse = (a%10) + reverse*10;
            //Finally here we are diving to remove last digit from the number
            a/=10;

        }

        if(reverse==number){
            return true;
        }

        return false;

    }
}

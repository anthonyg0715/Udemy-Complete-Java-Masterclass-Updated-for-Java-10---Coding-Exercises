/*
@author Anthony Garzon
@Date 9/27/2018
@description Leap Year Calculator. Write a method isLeapYear with a parameter of type int named year.
The range for year is 1 through 9999 if not in that range then return false otherwise calculate if it is a leap year
or not.
Hint: A leap year is divisible by 4 but not by 100 or divisible by 400.
 */
public class LeapYear {
    public static void main(String[] args) {
        boolean checkLeapYear = isLeapYear(2000);
        System.out.println(checkLeapYear);
    }

    public static boolean isLeapYear(int year){
        if((year < 1) || (year > 9999)){
            return false;
        }else{
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }
    }
}

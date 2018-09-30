/*
@Author Anthony Garzon
@Date 9/30/2018
@Program Shared Digit
@Description Returns true if x and y both share a same digit and should not work if they are not in range from 10 - 99
Hint: Look at the quotient and remainder of the numbers supplied for the test cases 
 */
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));//should return true
        System.out.println(hasSharedDigit(9,99));//should return false because x is not in range
        System.out.println(hasSharedDigit(99,9));//should return false because y is not in range
        System.out.println(hasSharedDigit(15,55));//should return true
    }

    public static boolean hasSharedDigit(int x, int y){
        if((x < 10 || x > 99) || (y < 10 || y > 99)){
            return false;
        }//we are not in range

        int dividingFromX = x / 10;
        int remainder1 = x % 10;

        int dividingFromY = y / 10;
        int remainder2 = y % 10;

        //Here we are just checking all possible cases
        if((dividingFromX == dividingFromY) || (dividingFromX == remainder2)){
            return true;
        }//Here we are checking if division from number 1 is equal to division from number two or if division from number one
        //is equal to the remainder from number 2 then return true

        if ((remainder1 == dividingFromY) || (remainder1 == remainder2)){
            return true;
        }//here we are checking if the remainder from number one is equal to division from number 2 or if the remainder
        //from number one is equal to the remainder of number two then return true

        return false;
    }

}

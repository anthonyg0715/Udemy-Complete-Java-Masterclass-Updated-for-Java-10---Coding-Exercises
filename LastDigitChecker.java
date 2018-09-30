/*
@Author Anthony Garzon
@Date 9/30/2018
@Program Name Last Digit Checker
@Description Return true if any of the three digits have the same last digit otherwise return false and keep it within
a range of 10 - 1000
Hint: You only need to look at the remainder by 10 for comparison 
 */
public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));//should return true
        System.out.println(hasSameLastDigit(23,32,42));//should return true
        System.out.println(hasSameLastDigit(9,99,999));//should return false
    }

    public static boolean hasSameLastDigit(int x, int y, int z){
        if((x < 10 || y < 10 || z < 10) || (x > 1000 || y > 1000 || z > 1000)){
            return false;
        }

        int remainder = x % 10;
        int remainder2 = y % 10;
        int remainder3 = z % 10;

        if(remainder == remainder2 || remainder == remainder3 || remainder2 == remainder3){
            return true;
        }

        return false;
    }
}

/*
@Author Anthony Garzon
@Date 9/30/18
@Program Greatest Common Divisor
@Description Create a method that returns the greatest common divisor of two supplied numbers
Hint: The greatest common divisor is the largest number that evenly divides into the supplied number meaning a remainder
of zero
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));//should return 6
        System.out.println(getGreatestCommonDivisor(1,11));//should return -1
        System.out.println(getGreatestCommonDivisor(25,15));//should return 5
        System.out.println(getGreatestCommonDivisor(81,153));//should return 9
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int count = 1;
        int gcd = 0;
        while(count < first){
            if(first % count == 0 && second % count == 0){
                gcd = count;
            }
            count++;
        }
        return gcd;
    }

}

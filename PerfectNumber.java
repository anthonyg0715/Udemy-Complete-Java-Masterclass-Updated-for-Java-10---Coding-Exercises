/*
@Author Anthony Garzon
@Date 9/30/18
@Program Name Perfect Number
@Description Write a program that returns true or false if the number supplied is a perfect number
Hint: A perfect number is a positive integer which is equal to the sum of its proper positive divisors. Proper positive
divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect
number itself. For example 6 is a perfect number because 1 + 2 + 3 = 6. 
 */
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));//should return true
        System.out.println(isPerfectNumber(28));//should return true
        System.out.println(isPerfectNumber(5));//should return false
        System.out.println(isPerfectNumber(-1));//should return false
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }else {
            int factor = 1;
            int sum =0;
            while (factor < number) {
                if (number % factor == 0) {
                    sum +=factor;
                }
                factor++;

            } if(sum == number){
                return true;
            }
        }
        return false;
    }
}

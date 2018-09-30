/*
@Author Anthony Garzon
@Date 9/30/18
@Program Name Even Digit Sum
@Description Create a method getEvenDigitSum which returns the sum of even digits only within a given number
 */
public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));//should return 20
        System.out.println(getEvenDigitSum(252));//should return 4
        System.out.println(getEvenDigitSum(-22));//should return -1
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0){
            return -1;//test case for negative values
        }
        while(number != 0){
            if(number % 2 == 0){
                sum = sum + number % 10;//if the remainder of the number being divided is even then only sum those numbers
            }
            number/=10;//We are diving the number passed in so long as it is not 0
        }
        return sum;
    }
}

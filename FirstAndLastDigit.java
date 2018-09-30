/*
@Author Anthony Garzon
@Date 9/30/2018
@Program First And Last Digit Sum
@Description Return the sum of the first and last digit of any number given
 */
public class FirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));//should print 4
        System.out.println(sumFirstAndLastDigit(0));//should print 0
        System.out.println(sumFirstAndLastDigit(-10));//should print -1
        System.out.println(sumFirstAndLastDigit(10));//should print 1
        System.out.println(sumFirstAndLastDigit(122222));//should print 3
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int firstDigit, lastDigit = 0;
        if(number < 0){
            return -1;
        }//Here we are making sure negatives aren't allowed
        if(number < 10){
            sum = number + number;
        }//here we are testing for cases less than 10
        firstDigit = number;
        while(firstDigit >= 10){
            firstDigit /= 10;//dividing by ten extracts the first digit
            lastDigit = number % 10;//modding by ten extracts the last digit
            sum = firstDigit + lastDigit;//then we just simply add them together
        }//here we are checking for any other number greater than 10

        return sum;
    }

}

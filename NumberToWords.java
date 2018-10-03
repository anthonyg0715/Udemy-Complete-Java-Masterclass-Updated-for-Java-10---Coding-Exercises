/*
@Author Anthony Garzon
@Date 10/1/2018
@Program Name Number To Words
@Description Write a program when supplied a number it returns it in words. For example 123 is one two three.
 */
public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(numberToWords(123));//should return one teo three
        System.out.println(numberToWords(1010));//should return one zero one zero
        System.out.println(numberToWords(1000));//should return one zero zero zero
        System.out.println(numberToWords(-12));
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;//if number is less than zero return -1
        } else {
            int count = 0;//otherwise create a counter
            if (number == 0) {
                return 1;//if number is 0 return 1
            } else {
                while (number != 0) {
                    int digit = number % 10;//set digits to the remainders
                    number = number / 10;//while the number is not zero keep dividing
                    count++;//update counter after each division until we hit zero
                }
                return count;//then just return that count
            }
        }
    }

    //We need this reverse method because the logic for numberToWords method would print 234 as Four Three Two when
    //instead we want Two Three Four. So we need to reverse the original output
    public static int reverse(int number) {
        int newNum = number;
        if (number < 0) {
            newNum = newNum * 1;
        }
        newNum = newNum;

        int reverse = 0;
        while (newNum != 0) {
            reverse = (newNum % 10) + (reverse * 10); // if reverse = (newNum % 10)  >> will give only the first number
            newNum /= 10;
        }
        return reverse;

    }


    public static int numberToWords(int number) {
        int digitCount = getDigitCount(number);//using getDigit method to count the number of digits in number passed
        int reverseDigitCount = getDigitCount(reverse(number));//counting the reversed number
        int differeceinDigits = digitCount-reverseDigitCount;//then we need the difference of both
        number = reverse(number);//setting number passed to be equal to its reverse
        if (number < 0) {
            System.out.println("Invalid Value");//if number is negative print invalid value
        } else {
            int lastDigit;
            while (number != 0) {
                lastDigit = number % 10; // extract last digit of the remainder
                switch (lastDigit) {//switching on the value of the digit found above for all cases 0-9
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                    default:
                        System.out.println("Invalid Value");
                        break;

                }
                number = number / 10;//remove the last digit from the number
                lastDigit++;
            }//we repeat the above steps until number is zero

           for (int i=0; i < differeceinDigits; i++){
                System.out.println("Zero");
            }//looping through the digits and returning the zeros
            return differeceinDigits;
        }
        return -1;
    }
}

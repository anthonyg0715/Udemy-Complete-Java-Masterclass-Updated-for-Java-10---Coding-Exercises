/*
 @Author Anthony Garzon
 @Date 9/29/2018
 @Program Name: Number In Word
 @Description: Create a void method named printNumberInWord with the parameter of type int named number
 and for each case 0...9 print ONE TWO.. and so on and for the default case print OTHER using the switch
 statement
 */
public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(9);//should print NINE
        printNumberInWord(10);//should print Other
    }

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5:
                System.out.println("FIVE");
                break;

            case 6:
                System.out.println("SIX");
                break;

            case 7:
                System.out.println("SEVEN");
                break;

            case 8:
                System.out.println("EIGHT");
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
                break;
        }
    }
}

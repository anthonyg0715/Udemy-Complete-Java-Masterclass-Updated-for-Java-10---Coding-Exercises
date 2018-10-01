/*
@Author Anthony Garzon
@Date 9/30/18
@Program All Factors
@Description Write a method that returns nothing but prints out all factors of a supplied number.
Hint: All factors meaning a number that fully divides into the supplied number leaving a remainder of zero
 */
public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);//should print 1 2 3 6
        printFactors(32);//should print 1 2 4 8 16 32
        printFactors(10);//should print 1 2 5 10
        printFactors(-1);//should print Invalid Value
    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }

        for(int i = 1; i<=number; i++){

            if(number % i == 0){
                System.out.println(i);

            }

        }

    }
}

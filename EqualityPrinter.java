/*
@Author Anthony Garzon
@Date 9/28/2018
@Program Name: Equality Printer
@Description: Write a method printEqual that determines if either all numbers are equal, neither are equal or different,
all are different, or invalid value if less than 0.
 */
public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1,1,1);//should print All numbers are equal
        printEqual(1,1,2);//should print Neither all are equal or different
        printEqual(-1,-1,-1);//should print Invalid Value
        printEqual(1,2,3);//should print All numbers are different
    }

    public static void printEqual(int x, int y, int z){
        if((x < 0) || (y < 0) || (z < 0)){
            System.out.println("Invalid Value");
        }else if(x == y && y == z && x == z){
            System.out.println("All numbers are equal");
        }else if(x != y && x != z && y != z){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}

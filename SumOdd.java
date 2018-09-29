/*
@Author Anthony Garzon
@Date 9/29/2018
@Program Sum Odd
@Description First create a method called isOdd which checks if a given number is odd or not. After create a method
called sum odd which basically sums the odd number found. See code below.
 */
public class SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));//should print 2500
        System.out.println(sumOdd(-1,100));//should print -1
        System.out.println(sumOdd(100,100));//should print 0
        System.out.println(sumOdd(100,-100));//should print -1
        System.out.println(sumOdd(100,1000));//should print 247500
    }

    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }

        if(number % 2 != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if(end < 0 || start < 0){//ranges that start and end must follow
            return -1;
        }
        if(end < start){//and end cannot be less than start
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
           if(isOdd(i)){
               sum+=i;

           }

        }
        return sum;
    }
}

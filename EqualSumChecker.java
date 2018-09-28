//Anthony Garzon
// 9/27/2018
//Program name: Equal sum checker
//We want to check if the sum of the first two parameters is equal to the third parameter
public class EqualSumChecker {
    public static void main(String[] args) {
        boolean check = hasEqualSum(1,-1,0);
        System.out.println(check);
    }

    public static boolean hasEqualSum(int x, int y, int z){
        if(x + y == z){//here is where we do the sum check
            return true;
        }else{
            return false;
        }
    }
}

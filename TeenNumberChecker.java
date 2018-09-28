// Anthony Garzon
// 9/27/2018
//Program Name: Teen Number Checker
//Description: Return tue if one of the three parameters is in the range of 13-19 otherwise return false
public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean check = hasTeen(9,19,99);
        System.out.println(check);//true
        boolean check2 = hasTeen(22,23,34);
        System.out.println(check2);//false
    }

    public static boolean hasTeen(int x, int y, int z){
        if(x >= 13 && x <=19 || y >= 13 && y <= 19 || z >= 13 && z <=19){
            return true;
        }else{
            return false;
        }
    }

}

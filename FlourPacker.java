/*
@Author Anthony Garzon
@Date 10/2/2018
@Program Flour Pack Problem
@Description Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
bigCount represents the count of big flour bags 5kilo each, smallCount represents the count of small flour bags 1kilo
each, and goal represents the amount kilo of flours needed to assemble a package
 */
public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));//should return false
        System.out.println(canPack(1,0,5));//should return true
        System.out.println(canPack(2,2,12));//should return true
        System.out.println(canPack(-3,0,5));//should return false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        // Start with using full packs of big 5kg flour
        for (int big = bigCount; big > -1; big--) {
            // Start with using full packs of small 1kg flour
            for (int small = smallCount; small > -1; small--) {
                // check if sum of used flours equal to goal
                if ((big*5 + small*1 == goal)) {
                    return true;
                }
            }
        }

        return false;

    }

}

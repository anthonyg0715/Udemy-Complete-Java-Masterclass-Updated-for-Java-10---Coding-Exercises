/*
@Author Anthony Garzon
@Date 9/28/2018
@Program Name: Playing Cat
@Description: Write a method that determines if the cat is playing given a range from 25 - 35 which is when it is playing
and 25 - 45 if it is summer and it is playing
 */
public class PlayingCat {

    public static void main(String[] args) {
        boolean check = isCatPlaying(true,10);//should return false since temperature is not in range 25 - 45
        System.out.println(check);
        boolean check2 = isCatPlaying(false,36);//should return false since temperature is not in range 25 - 35
        System.out.println(check2);
        boolean check3 = isCatPlaying(false,35);//should return true since temperature is in range 25 - 35
        System.out.println(check3);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if((summer) && (temperature >= 25 && temperature <= 45)){
            //Here I am checking if the range is between 25 - 45 for when summer is true
            return true;

        }else if((summer == false) && (temperature >= 25 && temperature <= 35)){
            //Here I am explicitly setting summer to false however checking the proper range for playing
            return true;

        }else{

            return false;

        }
    }
}

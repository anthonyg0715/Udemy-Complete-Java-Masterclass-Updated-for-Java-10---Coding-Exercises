/*
@author Anthony Garzon
@Date 9/26/2018
 */
/*
@description Write a method bark that has two parameters. 1st parameter should be of type boolean and represents if
the dog is barking or not.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and the range of the day is
only from 0 - 23.
We wake up if the dog is barking before 8 am or after 22 hours. In all other cases return false.
 */
public class BarkingDog {
    public static void main(String[] args) {
        boolean actual = bark(true,-1);
        System.out.println(actual);
    }

    public static boolean bark(boolean barking, int hourOfDay){
        if(barking){//here we are checking if barking is true or false
            if(hourOfDay < 0 || hourOfDay > 23){//here we take care of the range specification
                barking = false;
            }else if(hourOfDay >=0 && hourOfDay < 8){//here we are checking if it is before 8
                barking = true;
            }else if(hourOfDay >=8 && hourOfDay <= 22){//here we are checking in between 8 and 22 hours
                barking = false;
            }else if(hourOfDay > 22){//here we are checking after 22 hours
                barking = true;
            }

        }
        return barking;
    }
}

/**
 * @author Anthony Garzon
 * @Date 10/7/2018
 * @Program Arrays Challenge
 * @Description Using a scanner given a certain amount of numbers from input using arrays sort them in descending order
 *
 */

import java.util.Scanner;

public class ArraysChallenge {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        sortArrayInDescendingOrder(myIntegers);
        printArray(myIntegers);
    }

    //instructor's solution
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    //my solution to sort array in descending order
    public static void sortArrayInDescendingOrder(int[] myArray){
            for (int i = 0; i < myArray.length; i++) {
                for (int j = myArray.length-1; j > i; j--) {
                        if (myArray[i] < myArray[j]) {
                            int temp = myArray[i];
                            myArray[i] = myArray[j];
                            myArray[j] = temp;
                        }
                }

            }
    }


    public static int[] getIntegers(int numbers){
        System.out.println("Enter number " + numbers + " integer value.\r");
        int[] value = new int[numbers];
        for(int i=0; i<value.length; i++){
            value[i] = scan.nextInt();
        }
        return value;
    }

    public static void printArray(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            System.out.println("Element [" + i + "] value is " + myArray[i]);
        }

    }
}

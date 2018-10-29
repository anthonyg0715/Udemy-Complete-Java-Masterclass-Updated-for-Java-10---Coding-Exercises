package com.anthony.Series;

public class Series {

    public static int nSum(int n){
        return (n * (n+1)) / 2;
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int sum=1;
        for(int i=1; i<=n; i++){
            sum *=i;
        }
        return sum;
    }

    public static long fibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        long nMinus1=1;
        long nMinus2=0;
        long sum=0;
        for(int i=1; i<n; i++){
            sum = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;//incrementing the loop
            nMinus1 = sum;
        }
        return sum;
    }
}

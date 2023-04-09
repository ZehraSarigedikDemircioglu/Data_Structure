package com.cydeo.Review;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));

    }

    public static long factorial(long n){

        if(n <= 1){
            return 1;
        }else{
            return n*factorial(n - 1);
        }
    }
}

package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        boolean condition=true;
        int sum=0;
        while (condition){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number  : ");
            int n = in.nextInt();
            if (n==0){
                condition=false;
                System.out.println("The sum of numbers are : "+sum);
            }
            else {
                condition=true;
            }
            sum=sum+n;
        }

    }
}
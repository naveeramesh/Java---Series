package com.company;

import java.util.Scanner;

public class LargeNumber0 {
    public static void main(String[] args) {
        boolean condition=true;
        int large = Integer.MIN_VALUE;
        while (condition){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number  : ");
            int n = in.nextInt();
            large = Integer.max(large, n);
            if (n==0){
                condition=false;
                System.out.println("The largest integer is: " + large);
            }
            else {
                condition=true;
            }
        }

    }
}

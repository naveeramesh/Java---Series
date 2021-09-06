//Find the largest number of 2 numbers
package com.company;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int n =in.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 =in.nextInt();
        if(n>n2){
            System.out.println(n+ " is Greater" );
        }
        else {
            System.out.println(n2+ " is Greater");
        }

    }
}

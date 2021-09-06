//Find the factors of given number

package com.company;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        for (int i =1;i<=n;i++){
            if (n%i==0){
                System.out.println("The factors are : "+ i);
            }
        }
    }
}

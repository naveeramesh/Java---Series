package com.company;

import java.util.Scanner;

public class Intrest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a principle ? ");
        int p=in.nextInt();
        System.out.print("Enter a temp ? ");
        int t=in.nextInt();
        System.out.print("Enter a rate ? ");
        int r=in.nextInt();
        int result=p*t*r;
        System.out.println("The simple Intrest is " + result);


    }
}

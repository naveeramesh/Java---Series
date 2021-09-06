package com.company;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter first  number ? ");
        int n=in.nextInt();
        System.out.println("Enter second  number ? ");
        int n2=in.nextInt();
        System.out.println("Enter a operator ? ");
        String s=in.next();
        if (s.equals("+")){
            int result=n+n2;
            System.out.println("The answer is "+result);

        }
        else {
            System.out.println("nill");
        }
        if (s.equals("*")){
            int result=n*n2;
            System.out.println("The answer is "+result);

        }
        else {
            System.out.println("nill");
        }
        if (s.equals("-")){
            int result=n-n2;
            System.out.println("The answer is "+result);

        }
        else {
            System.out.println("nill");
        }
        if (s.equals("/")){
            int result=n/n2;
            System.out.println("The answer is "+result);

        }
        else {
            System.out.println("nill");
        }

    }
}

package com.company;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ₹ :");
        float n =in.nextFloat();
        float result= n * 0.013f;
        System.out.println("The dollar is : " +result);

    }
}

package com.company;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        if (n<=1){
            System.out.println("Neither prime nor composite");
            return;
        }
        int c=2;
        if (n==4){
            System.out.println("Not Prime");
        }
        else {
            while (c*c<n){
                if (n % c == 0){
                    System.out.println("Not prime");
                    return;
                }
                c=c+1;
            }
        }
        if (c*c>n){
            System.out.println("Prime");
        }

    }

}

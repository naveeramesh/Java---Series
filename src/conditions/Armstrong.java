package conditions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int original=n;
        int sum=0;
        while (n>0){
            int rem=n%10;
           n=n/10;
           sum=sum+rem*rem*rem;

        }
        if (sum==original){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

}}

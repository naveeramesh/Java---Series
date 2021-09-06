package conditions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;

        while (count <= n) {
            int temp = a;
            a = b + a;
            b = temp;
            count++;

            System.out.print(b+" ");
        }



    }
}

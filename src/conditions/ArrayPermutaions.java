package conditions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPermutaions {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr=new int[6];
        //input
        for (int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();

        }
        //output
        for (int j : arr) {

            System.out.print(arr[j] + " ");
        }
    }
}

package conditions;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int sum=0;
        int average=1;

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i=1;i<=n;i++){
            sum=sum+i;
            average++;

        }
        System.out.println(sum);
        System.out.println(average);
        System.out.println(sum/average);
    }
}

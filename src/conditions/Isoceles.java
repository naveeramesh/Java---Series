package conditions;

import java.util.Scanner;
import java.lang.Math;

public class Isoceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a height : ");
        int height=in.nextInt();
        System.out.print("Enter a breadth : ");
        int breadth = in.nextInt();
        int height1=height*height;
        int breadth2=breadth*breadth;
        int halfarea = breadth/2;
        int nexthalf=height1-(breadth2/4);
        double result=halfarea*Math.sqrt(nexthalf);
        System.out.println(result);

    }
}

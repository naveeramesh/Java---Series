package conditions;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a height : ");
        int height=in.nextInt();
        System.out.print("Enter a breadth : ");
        int breadth = in.nextInt();
        float area =height*breadth;
        System.out.println("Area of rectangle : "+area);
     }

}

package conditions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pi=3.14f;
        System.out.print("Enter a radius to calculate the area of circle : ");
        float r=in.nextFloat();
        float area=pi*r*pi;
        System.out.println("Area od circle is " + area);


    }
}

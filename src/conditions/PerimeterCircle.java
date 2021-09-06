package conditions;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pi=3.14f;
        System.out.print("Enter a radius to calculate the perimeter of circle : ");
        float r=in.nextFloat();
        float area=2*pi*r;
        System.out.println("Perimeter of circle is " + area);
    }
}

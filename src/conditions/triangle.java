package conditions;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a height : ");
        int height =in.nextInt();
        System.out.println("Enter a breadth : ");
        int breadth =in.nextInt();
        float constant=0.5f;
        float area=constant*height*breadth;
        System.out.println("The are of triangle is :" + area);

    }
}

//Jamar Palmer
//CIs 3515

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Square:");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the Square:");
        int height = scanner.nextInt();
        //Square Class Instantiation
        Square square = new Square("Square");
        square.setDimensions(length, height);

        System.out.println("Please enter the radius of the Circle:");
        int radius = scanner.nextInt();
        //Circle Class Instantiation
        Circle circle = new Circle("Circle");
        circle.setDimensions(radius);

        System.out.println("Please enter Side 1 of the Triangle:");
        int side1 = scanner.nextInt();
        System.out.println("Please enter Side 2 of the Triangle:");
        int side2 = scanner.nextInt();
        System.out.println("Please enter Side 3 of the Triangle:");
        int side3 = scanner.nextInt();
        //Triangle Class Instantiation
        Triangle triangle = new Triangle("Triangle");
        triangle.setDimensions(side1, side2, side3);

        System.out.println("Please enter the side of the Equilateral Triangle:");
        int side = scanner.nextInt();
        //EquilateraLTriangle Class Instantiation
        EquilateralTriangle equilateral = new EquilateralTriangle("EquilateralTriangleTriangle");
        equilateral.setDimensions(side);

        //Shape Class Instantiation
        Shape shape = new Shape("Shape");

        //Console Printing
        System.out.println("Name: " + shape.getName() +  "\nArea: " + shape.getArea());
        shape.printDimensions();
        System.out.println("Name: " + square.getName()  + "\nArea: " + square.getArea());
        square.printDimensions();
        System.out.println("Name: " + circle.getName()  + "\nArea: " + circle.getArea());
        circle.printDimensions();
        System.out.println("Name: " + triangle.getName() + "\nArea: " + triangle.getArea());
        triangle.printDimensions();
        System.out.println("Name: " + equilateral.getName() + "\nArea: " + equilateral.getArea());
        equilateral.printDimensions();

    }
}

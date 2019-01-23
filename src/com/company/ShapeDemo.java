//1.) Create (3) classes: Circle, Square, and Triangle. Each class should have appropriate properties
//(for example, a Circle should have a radius, a diameter and a circumference). Each class should have a getter
//and setter method for each instance variable, and should have a print() method which displays all available data about the object.
//
//2.) Create a program which asks the user what kind of shape they would like to make (circle, square, or triangle)
//and then asks them for the data to construct those shapes (e.g., "What is the radius of your circle?")
//Create an object of the requested type, assign the user's values to its instance variables,
//and call the print() method to display information about the new shape to the user.
//
//Your program should allow the user to make as many shapes as they want. It should include error handling for unexpected input.

package com.company;
import java.util.Scanner;

public class ShapeDemo {

    public static void main(String[] args) {
        String lineBreak = "\n";
        String prompt = "Please choose a shape: " + lineBreak + "1 - Triangle" + lineBreak + "2 - Square" + lineBreak + "3 - Circle";
        Triangle myTriangle = new Triangle();
        Square mySquare = new Square();
        Circle myCircle = new Circle();
	    Scanner input = new Scanner(System.in);

	    System.out.println(prompt);

	    int choice = input.nextInt();
	    switch(choice){
            case 1:
                System.out.println("Triangle selected!");
                System.out.println("Please enter a value for the base");
                myTriangle.setBase(input.nextDouble());
                System.out.println("Please enter a value for the height");
                myTriangle.setHeight(input.nextDouble());
                myTriangle.printInfo();
                break;
            case 2:
                System.out.println("Square selected!");
                System.out.println("Please enter a value for the width");
                mySquare.setWidth(input.nextDouble());
                System.out.println("Please enter a value for the height");
                mySquare.setHeight(input.nextDouble());
                mySquare.printInfo();
                break;
            case 3:
                System.out.println("Circle selected!");
                System.out.println("Please enter a value for the radius");
                myCircle.setRadius(input.nextDouble());
                myCircle.printInfo();
                break;
            default:
                System.out.println("Error - Incorrect input");
        }



    }
}

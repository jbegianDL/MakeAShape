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

public class Square {
    private double width;
    private double height;
    private double area;

    public void setWidth(double sqrWidth){
        width = sqrWidth;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double sqrHeight){
        height = sqrHeight;
    }

    public double getHeight(){
        return height;
    }

    public void printInfo(){
        area = width * height;
        System.out.print("Width is: " + width + " -- Height is: " + height + " -- Area is : " + area);
    }
}

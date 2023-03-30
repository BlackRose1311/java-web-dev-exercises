package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius? ");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area for radius " + radius + " is: " + area);
    }
}

package exercises;
import java.util.Scanner;
public class Wanderer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you traveled? ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of fuel have been consumed? ");
        double fuel = input.nextDouble();
        double mph = miles/fuel;
        System.out.println("You are averaging " + mph + " miles per gallon.");
    }
}

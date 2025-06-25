import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasCapacity = 0.00;
        double milesPerGallon = 0.00;
        double pricePerGallon = 0.00;
        double costPerHundredMiles = 0.00;
        double fullTankDistance = 0.00;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("Enter the number of gallons of gas that can go in your car's gas tank: "); //OUTPUT
            if (in.hasNextDouble()) // OK safe to read in a double
            {
                gasCapacity = in.nextDouble();
                in.nextLine(); //clear input buffer
                if (gasCapacity <= 0.0) {
                    System.out.println("Enter a valid number of gallons not " + gasCapacity);
                }
                else {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have to enter a valid number not " + trash);
            }
        }while (!done);
        done = false;
        do {
            System.out.print("Enter how many miles per gallon your car can travel: "); //OUTPUT
            if (in.hasNextDouble()) // OK safe to read in an int
            {
                milesPerGallon = in.nextDouble();
                in.nextLine(); //clear input buffer
                if (milesPerGallon <= 0.0) {
                    System.out.println("Enter a valid number of miles not " + milesPerGallon);
                } else {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have to enter a valid number not " + trash);
            }
        }while(!done);
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: "); //OUTPUT
            if (in.hasNextDouble()) // OK safe to read in an int
            {
                pricePerGallon = in.nextDouble();
                in.nextLine(); //clear input buffer
                if (pricePerGallon <= 0.0)
                {
                    System.out.println("Enter a valid price for a gallon of gas not " + pricePerGallon);
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You have to enter a valid number not " + trash);
            }
        }while (!done);
        costPerHundredMiles = (pricePerGallon * (100 / milesPerGallon));
        fullTankDistance = (milesPerGallon * gasCapacity);
        System.out.printf("The cost to drive 100 miles is $%.2f.%n", costPerHundredMiles);
        System.out.printf("Your car can drive %.2f miles with a full tank of gas.", fullTankDistance);
    }
}
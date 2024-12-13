import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasGallons = 0.00;
        double milesPerGallon = 0.00;
        double gallonGasPrice = 0.00;
        String continueYN = "";
        boolean done = false;
        do {
            System.out.print("Enter the number of gallons of gas that can go in your car's gas tank: "); //OUTPUT
            if (in.hasNextDouble()) // OK safe to read in a double
            {
                gasGallons = in.nextDouble();
                in.nextLine(); //clear input buffer
                if (gasGallons < 0)
                {
                    System.out.println(+gasGallons + " is an invalid number of gallons. Try again? [YN] ");
                    continueYN = in.nextLine();
                    if (continueYN.equalsIgnoreCase("Y")) ;
                    {
                        done = true;
                    }
                }
                else
                {
                    System.out.println("Continue [YN]: ");
                    continueYN = in.nextLine();
                    if (continueYN.equalsIgnoreCase("Y"))
                    {
                        done = true;
                    }
                    else
                        {
                            System.exit(0);
                        }
                }
            }
        }
        while (!done);
        do {
            System.out.print("Enter how many miles per gallon your car can travel: "); //OUTPUT
            if (in.hasNextDouble()) // OK safe to read in an int
            {
                milesPerGallon = in.nextDouble();
                in.nextLine(); //clear input buffer
                System.out.println("Do you want to continue? [YN]: ");
                continueYN = in.nextLine();
                if (continueYN.equalsIgnoreCase("Y")) {
                    done = true;
                }
                done = true; // we got a valid number so we can end the loop
                if (continueYN.equalsIgnoreCase("Y")) {
                    done = true;
                }
            } else {
                System.out.println("\n You have ended the program!");
            }
        }
        while (!done);
        do {
            System.out.print("Enter the price of gas per gallon: "); //OUTPUT
            if (in.hasNextDouble()) // OK safe to read in an int
            {
                gallonGasPrice = in.nextDouble();
                in.nextLine(); //clear input buffer
                done = true; // we got a valid number so we can end the loop
                if (continueYN.equalsIgnoreCase("Y")) {
                    done = true;
                }
            } else {
                System.out.println("\n You have ended the program!");
            }
        }
        while (!done);
    }
}
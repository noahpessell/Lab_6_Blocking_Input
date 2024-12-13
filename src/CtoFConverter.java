import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int degreesCelsius = 0;
        int degreesFahrenheit = 0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do {
            System.out.print("Enter your degrees Celsius to be converted into Fahrenheit: "); //OUTPUT
            if (in.hasNextInt()) // OK safe to read in an int
            {
                degreesCelsius = in.nextInt();
                in.nextLine(); //clear input buffer
                done = true; // we got a valid number so we can end the loop
            } else {
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a degree of Celsius");
                System.out.println("You have to enter a valid amount!");
            }
        }
            while (!done) ;
            degreesFahrenheit = (((degreesCelsius * 9)/5)+32);
            System.out.println(+ degreesCelsius + " degrees converted to Fahrenheit is: " + degreesFahrenheit + " degrees");
    }
}
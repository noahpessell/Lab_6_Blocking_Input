import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double degreesCelsius = 0.0;
        double degreesFahrenheit = 0.0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do {
            System.out.print("Enter your degrees Celsius to be converted into Fahrenheit: "); //OUTPUT
            if (in.hasNextDouble()) // OK safe to read in an double
            {
                degreesCelsius = in.nextDouble();
                in.nextLine(); //clear input buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid degree of Celsius, please try again.");
            }
        }while(!done);
            degreesFahrenheit = (((degreesCelsius * 9)/5)+32);
            System.out.printf("%.2f degrees Celsius converted to Fahrenheit is: %.2f degrees", degreesCelsius, degreesFahrenheit);
    }
}
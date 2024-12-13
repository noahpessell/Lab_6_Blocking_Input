import java.util.Scanner; // before the class at top of the file
public class CtoFConverter {
}
Scanner in = new Scanner(System.in);
int degreesCelsius = 0;
String trash = ""; // use for bad input which will read as a String
boolean done = false;
do
        {
        System.out.print("Enter degrees Celsius to be converted into Fahrenheit: ");
if(in.hasNextInt()) // OK safe to read in a double
        {
degreesCelsius = in.nextInt();
   in.nextLine(); // clears the newline from the buffer
done = true; // we got a valid number so we can end the loop
        }
        else
        {
// Not a double so use nextLine() instead to read a String
trash = in.nextLine();
   System.out.println("\nYou said your wage was: " + trash);
   System.out.println("You have to enter a valid amount!");
        }
                }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
// when done is true !done i.e. NOT TRUE is false

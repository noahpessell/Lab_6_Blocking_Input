import java.util.Scanner;
import java.util.Random;
public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userGuess = 0; //listing out variables
        String trash = ""; //trash is for invalid input
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        boolean done = false;
        do
        {
            System.out.print("Enter your guess for the random number: ");
            if(in.hasNextInt()) // OK safe to read int
            {
                userGuess = in.nextInt();
                in.nextLine(); // clears the newline from the buffer
                if(userGuess <= 10 && userGuess >= 1)
                {
                    done = true; // we got a valid number so we can end the loop
                }
                else
                {
                    System.out.println("You have to enter a number within range [1-10] not: " + userGuess);
                }
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("You have to enter a valid number [1-10] not " + trash);
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false
        if(userGuess < val)
        {
            System.out.println("Your guess of " + userGuess + " is lower than the random number: " + val);
        }
        else if(userGuess > val)
        {
            System.out.println("Your guess of " + userGuess + " is higher than the random number: " + val);
        }
        else
        {
            System.out.println("You guessed the random number perfectly! It is " + userGuess);
        }
    }
}
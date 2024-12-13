import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0; //listing out variables
        double shipCost = 0;
        double totalCost = 0;
        String trash = ""; //trash is for invalid input
        System.out.print("Enter your item price: "); //OUTPUT
        if(in.hasNextDouble()) //checking if input is a double
        {
            itemPrice = in.nextDouble(); //input, set to variable
            in.nextLine(); //clear input buffer
            if(itemPrice >= 100) //shipping cost is 0 if item is more or equal to 100
            {
                shipCost = 0;
                System.out.println("There is no shipping cost.");
                totalCost = itemPrice + shipCost;
                System.out.printf("Your total cost is: $" + totalCost);
            }
            else if(itemPrice < 100 && itemPrice >= 0) //shipping cost is 2% of item price if item is less than $100 and not negative
            {
                shipCost = itemPrice * .02;
                System.out.printf("Your shipping cost is: $ %.2f" , shipCost);
                totalCost = itemPrice + shipCost;
                System.out.printf("%n" + "Your total cost is: $ %.2f" , totalCost); //%n is added to make a new line with SOUTprintf
            }
            else //if item price input is negative, it is an invalid number
            {
                System.out.println("Your input " + itemPrice + " is invalid. Please try again.");
            }
        }
        else //if item price input was never a double, it is an invalid number
        {
            trash = in.nextLine();
            System.out.println("Your input " + trash + " is invalid. Please try again.");
        }
    }
}
import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double rectangleWidth = 0.0; //listing out variables
        double rectangleHeight = 0.0;
        double rectanglePerimeter = 0.0;
        double rectangleArea = 0.0;
        double rectangleDiagonal = 0.0;
        String trash = ""; //trash is for invalid input
        boolean done = false;
        do
        {
            System.out.print("Enter the rectangle width: ");
            if(in.hasNextDouble()) // OK safe to read double
            {
                rectangleWidth = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                if (rectangleWidth > 0.0) {
                    do {
                        System.out.print("Enter the rectangle height: ");
                        if (in.hasNextDouble()) {
                            rectangleHeight = in.nextDouble();
                            in.nextLine();
                            if (rectangleHeight > 0.0) {
                                done = true; // we got a valid number so we can end the loop
                            } else {
                            System.out.println("You have to enter a valid rectangle height not " + rectangleHeight);
                            }
                        } else {
                            trash = in.nextLine();
                            System.out.println("You have to enter a valid number value for rectangle height not " + trash);
                         }
                    }while(!done);
                } else {
                    System.out.println("You have to enter a valid rectangle width not " + rectangleWidth);
                }
            }
            else
            {
              trash = in.nextLine();
              System.out.println("You have to enter a valid number value for rectangle width not " + trash);
            }
        }while(!done);
        rectanglePerimeter = (2*(rectangleWidth + rectangleHeight));
        rectangleArea = (rectangleWidth * rectangleHeight);
        rectangleDiagonal = Math.hypot(rectangleWidth, rectangleHeight);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", rectanglePerimeter);
        System.out.printf("The area of the rectangle is: %.2f%n", rectangleArea);
        System.out.printf("The length of the diagonal of the rectangle is: %.2f%n", rectangleDiagonal);
    }
}
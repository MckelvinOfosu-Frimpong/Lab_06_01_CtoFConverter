import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	double cValue = 0;
    double fValue;
    String trash =" ";
    Scanner console = new Scanner(System.in);


        System.out.print("Please input your Celsius values to convert to Fahrenheit: ");
        if (console.hasNextDouble())
        {
            cValue = console.nextDouble();
            console.nextLine();
        }
        else
        {
            trash = console.nextLine();
            System.out.println("Invalid input: " + trash + " Restart the program ");
           System.exit(0);
        }

        fValue = ((cValue * 1.8) + 32);
        System.out.println("Your temperature in Fahrenheit is: " + fValue);

        if (fValue >= 120)
        {
            System.out.println("Your Temperature is at or above the boiling point ");
        }
        else if (fValue <= 32)
        {
            System.out.println("Your Temperature is at or below the freezing point ");
        }
        else
        {
            System.out.println("Your Temperature is not freezing or boiling");
        }


    }
}

import java.util.Scanner;

public class PS2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // initialising the variable to 1 for 0 factorial  
        long factorial = 1;

        // Calculate the factorial using a for loop
        for (int i = 1; i <= number; i++)
        {
            factorial *= i;  // Multiply factorial by the current number
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        
        sc.close();
    }
}
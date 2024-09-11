import java.util.Scanner;

public class PS1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate the sum
        int sum = num1+num2;

        // Check divisibility by 7
        if (sum % 7 == 0) 
            System.out.println("The sum of "+num1+" and "+num2+" is divisible by 7.");
        else 
            System.out.println("The sum of " + num1 + " and " + num2 + " is not divisible by 7.");

        // Check divisibility by 5
        String divisibleBy5=(sum%5==0) ? "The sum is divisible by 5." : "The sum is not divisible by 5.";
        System.out.println(divisibleBy5);
        
        sc.close();
    }
}
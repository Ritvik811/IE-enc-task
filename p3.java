import java.util.Scanner;

public class P3
{
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;

        // Loop to compare characters from both ends
        while (left < right)
        {
            // If characters at both ends are not equal, return false
            if (str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;  // If loop completes, the string is a palindrome
    }

    // Function to swap the case of each letter in the string
    public static String swapCase(String str) 
    {
        StringBuilder swappedStr = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            // If the character is uppercase, convert it to lowercase
            if (Character.isUpperCase(ch))
            {
                swappedStr.append(Character.toLowerCase(ch));
            } 
            // If the character is lowercase, convert it to uppercase
            else if (Character.isLowerCase(ch)) 
            {
                swappedStr.append(Character.toUpperCase(ch));
            } 
            // If the character is not a letter, append it as is
            else
            {
                swappedStr.append(ch);
            }
        }
        return swappedStr.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(originalString)) 
        {
            System.out.println("The string is a palindrome.");
        } else
        {
            System.out.println("The string is not a palindrome.");
        }

        // Swap the case of all characters in the original string
        String swappedString = swapCase(originalString);
        System.out.println("The string with swapped cases: " + swappedString);

        scanner.close();
    }
}
package Palin;

import java.util.Scanner;

public class Next_Palindrome
{
    public static void main(String[] args)
    {
        // test numbers : 45312,12345,12945,4531,1459,1997;
        Scanner user_input = new Scanner(System.in);
        System.out.print( "Enter choice of method: " );
        int choice = user_input.nextInt();

        System.out.print( "Enter number: " );
        int input_number = user_input.nextInt();

        Next_Palindrome_Method1 palin1 = new Next_Palindrome_Method1();
        Next_Palindrome_Method2 palin2 = new Next_Palindrome_Method2();
        try {
        if (choice == 1) palin1.get_next_palindrome(input_number);
        else palin2.get_next_palindrome(input_number);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }
}

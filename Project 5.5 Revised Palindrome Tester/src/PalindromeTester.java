//********************************************************************
//  PalindromeTester.java       Author: Lewis/Loftus
//								Edited: Erik Boswell
//  Demonstrates the use of nested while loops.
//********************************************************************

import java.util.Scanner;

public class PalindromeTester
{
   //-----------------------------------------------------------------
   //  Tests strings to see if they are palindromes.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      String str, another = "y";
      String strchg1, strchg2;
      int left, right;

      Scanner scan = new Scanner(System.in);

      while (another.equalsIgnoreCase("y"))  // allows y or Y
      {
         System.out.println("Enter a potential palindrome:");
         str = scan.nextLine();
         
         //This change takes str and makes all chars lower case, and 
         //then removes all chars not a lower case letter. [^a-z] is 
         //pulled from Appendix I in the book, however, it did not 
         //work with replace(). The docs on Oracles website gave an 
         //explanation of need for replaceAll instead, given that 
         //regular expressions work with replaceAll, but replace can 
         //only use one character at a time, and not regular 
         //expressionslip
         
         strchg1 = str.toLowerCase();
         strchg2 = strchg1.replaceAll("[^a-z]", "");	
         str = strchg2;

         left = 0;
         right = str.length() - 1;

         while (str.charAt(left) == str.charAt(right) && left < right)
         {
            left++;
            right--;
         }

         System.out.println();

         if (left < right)
            System.out.println("That string is NOT a palindrome.");
         else
            System.out.println("That string IS a palindrome.");

         System.out.println();
         System.out.print("Test another palindrome (y/n)? ");
         another = scan.nextLine();
      }
   }
}
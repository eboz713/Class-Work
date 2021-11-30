//********************************************************************
//  Stars.java       Author: Erik Boswell
//
//  Stars for 6.7.B
//********************************************************************

public class Stars
{

   public static void main(String[] args)
   {
      final int MAX_ROWS = 10;

      for (int row = 1; row <= MAX_ROWS; row++)
      {
    	  for (int space = 9; space >= row; space--)
         	 System.out.print(" "); 
    	  
    	 for (int star = 1; star <= row; star++)
            System.out.print("*");

         System.out.println();
      }
   }
}

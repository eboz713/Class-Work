//********************************************************************
//  Stars.java       Author: Erik Boswell
//
//  Stars for 6.7.D
//********************************************************************

public class Stars
{

   public static void main(String[] args)
   {
      final int MAX_ROWS = 5;

      for (int row = 1; row <= MAX_ROWS; row++)
      {
    	 for (int space = 4; space >= row; space--)
         	 System.out.print(" "); 
    	  
    	 for (int star = 2; star <= row; star++)
            System.out.print("*");
    	 
    	 System.out.print("*");
    	 
    	 for (int star = 2; star <= row; star++)
             System.out.print("*");
    	 
    	 for (int space = 4; space >= row; space--)
         	 System.out.print(" "); 

         System.out.println();
      }
      
      
      for (int row = 1; row <= MAX_ROWS; row++)
      {
    	 for (int space = 2; space <= row; space++)
         	 System.out.print(" "); 
    	  
    	 for (int star = 4; star >= row; star--)
            System.out.print("*");
    	 
    	 System.out.print("*");
    	 
    	 for (int star = 4; star >= row; star--)
             System.out.print("*");
    	 
    	 for (int space = 2; space <= row; space++)
         	 System.out.print(" "); 

         System.out.println();
      }
      
   }
}

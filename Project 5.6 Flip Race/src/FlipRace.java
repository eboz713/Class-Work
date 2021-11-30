//********************************************************************
//  FlipRace.java       Author: Erik Boswell
//
//  Demonstrates the use of an if-else statement.
//********************************************************************

public class FlipRace
{
   //-----------------------------------------------------------------
   //  Creates a Coin object, flips it, and prints the results.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      int score1 = 0;
      int score2 = 0;
	   
	  Coin coin1 = new Coin();
	  Coin coin2 = new Coin();

      while(score1 < 3 && score2 <3)
      {
    	  coin1.flip();
    	  coin2.flip();
    	  
    	  if(coin1.isHeads())
    		  score1 ++;
    	  else
    		  score1 = 0;
    	  
    	  if(coin2.isHeads())
    		  score2 ++;
    	  else
    		  score2 = 0;
    	  
    	  System.out.println("Coin 1 has " + score1 + " points, and "+ 
    	  "Coin 2 has " + score2 + " points.");
    	  
      }
      
      if (score1 > score2)
    	  System.out.println("Coin 1 wins!");
      if (score2 > score1)
    	  System.out.println("Coin 2 wins!");
      if (score1 == score2)
    	  System.out.println("It's a tie!");
      
   }
}

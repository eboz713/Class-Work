//********************************************************************
//  Firm.java       Author: Lewis/Loftus
//  Edited By: Erik Boswell
//
//  Demonstrates polymorphism via inheritance, modified to implement
//  Payable instead of use abstract pay method
//********************************************************************

public class Firm
{
   //-----------------------------------------------------------------
   //  Creates a staff of employees for a firm and pays them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Staff personnel = new Staff();

      personnel.payday();
   }
}

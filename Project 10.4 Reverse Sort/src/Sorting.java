//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//  Edited by: Erik Boswell
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************
public class Sorting
{

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public void selectionSort(int[] list)
   {
      int min;
      int temp;
      for (int index = 0; index < list.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
        	 
        	 //Changed to > to swap sort standard
            if ((list[scan] - list[min]) > 0)
               min = scan;
         // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
   }
   
   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public void insertionSort (int[] list)
   {
      for (int index = 1; index < list.length; index++)
      {
         int key = list[index];
         int position = index;

         //  Shift larger values to the left
         while (position > 0 && (key - list[position-1]) > 0)
         {
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }
   }

	
}


import java.util.Scanner;

public class ScoreBoard
{

     public static void main(String args[])
     {

           Scanner scnr = new Scanner(System.in);
           System.out.println("Enter the input string: ");
           String input = scnr.nextLine();
           SinglyLinkedList head = new SinglyLinkedList();
           String scores[] = input.split(" ");

           for(String scr:scores)
           {
                int start = scr.indexOf('(');
                int end = scr.indexOf(')');
                scr = scr.substring(start+1, end);
                String subScores[] = scr.split(",");
                
                if(subScores[0].equals("A"))
                {
                      Score score = new Score(subScores[1].trim(),
                                Integer.parseInt(subScores[2].trim()),null,null);
                      head.addScore(score);
                }

                else if(subScores[0].equals("R"))
                {
                      head.remove(subScores[1].trim(),
                                Integer.parseInt(subScores[2].trim()));
                }
           }
           System.out.println();

           head.displayScores();
     }
}


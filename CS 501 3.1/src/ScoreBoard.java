
public class ScoreBoard
{
   public static void main(String[] args)
   {
       SinglyLinkedList highscores = new SinglyLinkedList();
       String[] names = { "Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob" };
       int[] scores = { 750, 1105, 590, 740, 510, 660,   720, 400 };
      
       for (int i = 0; i < names.length; i++)
       {
           Score gE = new Score(names[i], scores[i]);
           System.out.println("Adding " + gE);
           highscores.add(gE);
       }
      
       System.out.println("\nTraversing the linked list:");
       SinglyLinkedList.Node node = highscores.getHead();
       while (node != null)
       {
           System.out.printf("%s -> ", node.getElement());
           node = node.getNext();
       }
       System.out.println("null");
      
       System.out.println("\nRemoving " + highscores.remove(3));
      
       System.out.println("\nTraversing the linked list:");
       node = highscores.getHead();
       while (node != null)
       {
           System.out.printf("%s -> ", node.getElement());
           node = node.getNext();
       }
       System.out.println("null");
   }
}

public class Score
{
      private String name;      
      private int score;        
      private Score next;
      private Score prev;
     
      public Score()
      {
            name = " ";
            score = 0;
            next = null;
            prev = null;
      }

      Score(String n,int s,Score pr,Score nt)
      {
            score = s;
            name = n;
            next = nt;
            prev = pr;
      }

      public String getName()
      {
            return name;
      }

      public int getScore()
      {
            return score;
      }

      public String toString()
      {
            return "(" + name + ", " + score + ")";
      }

      public Score getNext()
      {
            return this.next;
      }

      public void setNext(Score obj)
      {
            this.next = obj;
      }

}
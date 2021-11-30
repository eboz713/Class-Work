
public class SinglyLinkedList
{
      Score headScore;

      SinglyLinkedList()
      {
            headScore = null;
      }

      public void addScore(Score e)
      {
            if(headScore == null)
            {
                  headScore = e;
                  e.setNext(null);
            }

            else
            {
                  Score tempScore = headScore;
                  Score prev = headScore;

                  while(tempScore.getNext() != null && tempScore.getScore() >= e.getScore())
                  {
                        prev = tempScore;
                        tempScore = tempScore.getNext();
                  }

                  if(tempScore.getNext() == null)
                  {

                        if(tempScore.getScore() < e.getScore())
                        {

                              if(tempScore == headScore)
                              {
                                    e.setNext(tempScore);
                                    headScore = e;
                              }

                              else
                              {
                                    e.setNext(tempScore);
                                    prev.setNext(e);
                              }
                        }

                        else
                        {
                              tempScore.setNext(e);
                        }
                  }

                  else if(tempScore.getScore() < e.getScore())
                  {
                        if(tempScore == headScore)
                        {
                              e.setNext(tempScore);
                              headScore = e;
                        }
                        else
                        {
                              e.setNext(tempScore);
                              prev.setNext(e);
                        }
                  }
            }
      }

      public void remove(String name,int i)
      {
            Score tempScore = headScore;
            Score prev = headScore;
            
            while(tempScore != null)
            {

                  if(tempScore.getName().equals(name) && tempScore.getScore() == i)
                  {

                        if(i == headScore.getScore() && tempScore.getNext() == null)
                        {
                              headScore=null;
                        }

                        else if(tempScore == headScore && tempScore.getNext() != null)
                        {
                              headScore=tempScore.getNext();
                        }

                        else if(tempScore.getNext() == null)
                        {
                              prev.setNext(null);
                        }

                        else
                        {
                              prev.setNext(tempScore.getNext());
                        }

                        break;
                  }

                  prev = tempScore;
                  tempScore = tempScore.getNext();
            }
      }

      public void displayScores()
      {
            int i=0;
            System.out.println("Leaderboard\n");
            Score tempScore = headScore;

            while(tempScore != null && i++ < 10)
            {
            System.out.println(i + "\t" + tempScore.getName() + "\t" + tempScore.getScore());
                  tempScore=tempScore.getNext();
            }
      }
}
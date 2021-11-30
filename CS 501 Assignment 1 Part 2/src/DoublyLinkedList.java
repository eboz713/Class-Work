
// DoublyLinkedList class implementation
public class DoublyLinkedList
{
   // ---------------- nested Node class ----------------
   public static class Node
   {
       private GameEntry element;
       private Node prev;
       private Node next;

       public Node(GameEntry e, Node p, Node n)
       {
           element = e;
           prev = p;
           next = n;
       }
      
       public GameEntry getElement()
       {
           return element;
       }

       public Node getPrev()
       {
           return prev;
       }

       public Node getNext()
       {
           return next;
       }

       public void setPrev(Node p)
       {
           prev = p;
       }

       public void setNext(Node n)
       {
           next = n;
       }
   } // ----------- end of nested Node class -----------

   // instance variables
   private Node header;
   private Node trailer;
   private int size = 0;
  
   public DoublyLinkedList()
   {
       header = new Node(null, null, null);
       trailer = new Node(null, header, null);
       header.setNext(trailer);
   }
  
   public int size()
   {
       return size;
   }

   public boolean isEmpty()
   {
       return size == 0;
   }

   public Node getHeader()
   {
       return header;
   }

   public Node getTrailer()
   {
       return trailer;
   }

   public GameEntry first()
   {
       if (isEmpty())
           return null;
      
       return header.getNext().getElement();
   }

   public GameEntry last()
   {
       if (isEmpty())
           return null;
      
       return trailer.getPrev().getElement();
   }  
  
   public void addFirst(GameEntry e)
   {
       addBetween(e, header, header.getNext());
   }

   public void addLast(GameEntry e)
   {
       addBetween(e, trailer.getPrev(), trailer);
   }

   public GameEntry removeFirst()
   {
       if (isEmpty())
           return null;
      
       return remove(header.getNext());
   }

   public GameEntry removeLast()
   {
       if (isEmpty())
           return null;
       return remove(trailer.getPrev());
   }
  
   private void addBetween(GameEntry e, Node predecessor, Node successor)
   {
       Node newNode = new Node(e, predecessor, successor);
       predecessor.setNext(newNode);
       successor.setPrev(newNode);
       size++;
   }

   private GameEntry remove(Node node)
   {
       Node predecessor = node.getPrev();
       Node successor = node.getNext();
       predecessor.setNext(successor);
       successor.setPrev(predecessor);
       size--;
       return node.getElement();
   }  

   public String toString()
   {
       StringBuilder sb = new StringBuilder("(");
       Node walk = header.getNext();
       while (walk != trailer)
       {
           sb.append(walk.getElement());
           walk = walk.getNext();
           if (walk != trailer)
               sb.append(", ");
       }
       sb.append(")");
       return sb.toString();
   }
  
   public void add(GameEntry ge)
   {      
       if(size == 10 && ge.getScore() < header.next.element.getScore())
       {
           return;
       }
      
       if (isEmpty())
       {          
           Node newNode = new Node(ge, header, trailer);
           header.next = newNode;
           trailer.prev = newNode;              
       }
       else if(ge.getScore() < header.next.element.getScore())
       {
           Node newNode = new Node(ge, header, header.next);
           header.next = newNode;
           header.next.prev = newNode;          
       }
       else if(ge.getScore() > trailer.prev.element.getScore())
       {
           Node newNode = new Node(ge, trailer.prev, trailer);
           trailer.prev.next = newNode;
           trailer.prev = newNode;
       }
       else
       {
           Node current = header.next;
           Node previous = null;
          
           while(current != trailer && ge.getScore() > current.element.getScore())
           {
               previous = current;
               current = current.next;
           }
          
           Node newNode = new Node(ge, previous, previous.next);
           previous.next = newNode;
           previous.next.prev = newNode;
       }
          
       incrementSize();
      
       if(size > 10)
       {
           header.next = header.next.next;
           decrementSize();
       }
   }

   public GameEntry remove(int i)
           throws IndexOutOfBoundsException
   {
       if (i < 0 || i >= size)
       {
           throw new IndexOutOfBoundsException(
                   "Invalid index: " + i);
       }
      
       int count = 0;
       Node current = header.next;
       Node previous = null;
       while (current != trailer && count < i)
       {
           previous = current;
           current = current.next;
           count++;
       }
       GameEntry result = null;
       if (i == 0)
       {
           result = header.next.element;
           header.next = header.next.next;
       }
       else if (i == size - 1)
       {
           result = trailer.prev.element;
           previous.next = trailer;
           trailer = previous.next;
       }
       else
       {
           result = previous.next.element;
           previous.next = current.next;
           current.next.prev = previous;
       }
       decrementSize();
      
       if (size == 0)
           trailer = null;
      
       return result;
   }

   public void incrementSize()
   {
       size++;
   }
  
   public void decrementSize()
   {
       size--;
   }
  
} // end of DoublyLinkedList class

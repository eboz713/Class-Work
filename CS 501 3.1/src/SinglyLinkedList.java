public class SinglyLinkedList<E>{

   public static class Node<E>{

      private Score element;
      private Node<E> next;

      public Node(Score e, Node<E> n){
         element = e;
         next = n;
      }

      public Score getElement(){
         return element;
      }

      public Node<E> getNext() {
         return next;
      }

      public void setNext(Node<E> n){
         next = n;
      }

   }

   private Node<E> head = null;
   private Node<E> tail = null;
   private int size = 0;
   public SinglyLinkedList() {}
   public int size() {return size; }
   public boolean isEmpty() { return size == 0;}

   public Node<E> getHead() {
      return head;
   }

   public Node<E> getTail() {
      return tail;
   }

   public Score first() {
      if (isEmpty())
         return null;
      return head.getElement();
   }

   public Score last() {
      if (isEmpty())
         return null;
      return tail.getElement();
   }       

   public void addFirst(Score e){
      head = new Node<>(e, head);
      if (size == 0)
         tail = head;
      size++ ;
   }

   public void addLast(Score e) {
      Node<E> newest = new Node<>(e, null);
      if (isEmpty())
         head = newest;
      else
         tail.setNext(newest);
      tail = newest;
      size++;
   }

   public Score removeFirst() {
      if (isEmpty())
         return null;
      Score answer = head.getElement();
      head = head.getNext();
      size--;
      if (size == 0)
         tail = null;
      return answer;
      
   }
   
   public void add(Score e) {
	   
	   if (isEmpty()) {
		   
		   Node newNode = new Node(e, null);
		   
	   }
	   
	   if (size < 10 && e.getScore() < head.element.getScore()) {
		   
		   addFirst(e);
		   
	   }
	   
	   if (size < 10 && e.getScore() > tail.element.getScore()) {
		   
		   addLast(e);
		   
	   }
	   
	   if (size < 10 && e.getScore() > head.element.getScore() && e.getScore() < tail.element.getScore()) {
		   
		   
	   }
	   
	   if (size == 10 && e.getScore() < head.element.getScore()) {
		   
		   return;
		   
	   }
	   
	   if (size == 10 && e.getScore() > head.element.getScore() && e.getScore() < tail.element.getScore()) {
		   
		   removeFirst();
		   addFirst(e);
		   Node current = head;
		   while (e.getScore() > ) {
			   
			   
			   
		   }
		   
	   }
	   
	   if (size == 10 && e.getScore() > tail.element.getScore()) {
		   
		   removeFirst();
		   addLast(e);
		   
	   }
   
		   
   }
   
}
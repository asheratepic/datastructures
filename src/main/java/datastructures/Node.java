package datastructures;

/*
   Node is a core concept in data structures. The idea of a node is that it
   stores a data value (in this case an int value) and it stores a reference to
   another node in the node chain
 */

public class Node {
   private int value;
   private Node next;
   private Node previous;

   public Node(int value) {
      this.value = value;
   }

   public int getValue() {
      return value;
   }

   public void setValue(int v) {
      this.value = v;
   }

   public Node getNext() {
      return next;
   }

   public void setNext(Node n) {
      this.next = n;
   }

   public Node getPrevious() {
      return previous;
   }

   public void setPrevious(Node previous) {
      this.previous = previous;
   }
}

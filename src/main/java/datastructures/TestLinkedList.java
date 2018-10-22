package datastructures;

import org.apache.log4j.Logger;

public class TestLinkedList {
//   protected static Logger log = Logger.getLogger(LinkedList.class);
   static LinkedList list = new LinkedList();

   public static void main(String[] args) {
      Node n1 = list.append(5);
      Node n2 = list.append(7);
      Node n3 = list.append(8);
      Node n4 = list.append(10);

      System.out.println("print a linked list");
      printLinkedList();

      System.out.println("prepend a node");
      Node n5 = list.prepend(2);

      System.out.println("print list again to this time include the prepended node");
      printLinkedList();

      System.out.println("delete a node and reprint the list");
      list.delete(8);
      printLinkedList();

      System.out.println("Reversing the list");
      reverseLinkedList();
      printLinkedList();
   }

   /*
      Purpose: Reverse an existing list using the iterative approach

      - if head is pointing to an empty list then we are done
      - if head is pointing to the only node in list then we just
      print the same node value
      - if there are more than one node in the list then we print out
        the nodes in reverse order

    */
   public static void reverseLinkedList(){
      Node currentNode = list.head;
      Node previous = null;
      Node next;
      //if head is pointing to null then we are done
      if(currentNode == null) {
         return;
      }

      while(currentNode != null) {
         next = currentNode.getNext();
         currentNode.setNext(previous);
         previous = currentNode;
         currentNode = next;
      }
      list.head = previous;
   }

   public static void printLinkedList() {
      Node currentNode = list.getHead();
      if (currentNode == null) {
         System.out.println("list is empty");
         return;
      }
      while (currentNode != null) {
         System.out.println(currentNode.getValue());
         currentNode = currentNode.getNext();
      }
   }
}

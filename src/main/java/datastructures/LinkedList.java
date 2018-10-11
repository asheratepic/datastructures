package datastructures;

/*
   Implementing some code to help understand the linked list data structure.
 */

public class LinkedList {
   Node head;

   /*
     The append method here is to illustrate how we add data to a linked list
    */
   public Node append(int data){
      //if no head then the new node will become the head
      if(head == null){
         head = new Node(data);
         return head;
      }
      //make the head the current node and keep moving
      //over until you hit a null because that is where you will
      //add the new node
      Node current = head;
      while (current.getNext() != null){
            current = current.getNext();
      }
      current.setNext(new Node(data));
      return current.getNext();
   }

   /*
      Add a node at the beginning of our list. That is this new node
      will become the head of the list
    */
   public Node prepend(int data){
      Node newNode = new Node(2);
      newNode.setNext(head);
      head = newNode;
      return head;
   }

   public void printList(Node node){
      System.out.println("Nodes in the list:");
      while(node != null){
         System.out.println(node.getValue());
         node = node.getNext();
      }
   }

   public void printHead(){
      System.out.println("Head of the list:");
      System.out.println(head.getValue());
   }
}

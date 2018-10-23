package datastructures;

/*
   Implementing some code to help understand the linked list data structure.
 */


import org.apache.log4j.Logger;

public class LinkedList {
//   protected static Logger log = Logger.getLogger(LinkedList.class);
   private Node head;

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

   public void delete(int data){
      //usecase 1: there is no head
      if(head ==  null) return;
      //usecase 2: value to be deleted is the head value
      if(head.getValue() == data){
         head = head.getNext();
         return;
      }
      //usecase 3: delete a node with matching data
      Node current = head;
      while(current.getNext() != null){
         if(current.getNext().getValue() == data){
            current.setNext(current.getNext().getNext());
         }
         current = current.getNext();
      }
   }

   public Node getHead(){
      return head;
   }

   public void setHead(Node node) {
      head = node;
   }

}

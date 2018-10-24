package datastructures;

public class StackImpUsingLinkedList {
   private Node top = null;
   private LinkedList list = new LinkedList();

   public void push(int x){
      top = list.prepend(x);
   }

   public int pop(){
      Node temp = top.getNext();
      int valuePoped = top.getValue();
      top = temp;
      return valuePoped;
   }

   public void printStack(){
      Node currentNode = top;
      if(currentNode == null){
         System.out.println("Stack is empty");
         return;
      }
      while(currentNode != null){
         System.out.println(currentNode.getValue());
         currentNode = currentNode.getNext();
      }
   }
}

package datastructures;

public class TestStackImplUsingLinkedList {
   public static void main(String[] args) {

      StackImpUsingLinkedList stack = new StackImpUsingLinkedList();
      stack.push(4);
      stack.push(7);
      stack.push(8);
      stack.push(9);
      stack.printStack();
      stack.pop();
      stack.pop();
      stack.printStack();
   }



}

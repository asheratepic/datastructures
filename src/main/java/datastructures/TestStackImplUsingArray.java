package datastructures;

public class TestStackImplUsingArray {

   public static void main(String[] args) {
      StackImplUsingArray stack = new StackImplUsingArray();
      stack.push(5);
      stack.push(7);
      stack.push(9);
      stack.push(10);
      stack.push(11);
      stack.push(12);
      stack.printStack();
      System.out.println("====================");
      stack.pop();
      stack.pop();
      stack.printStack();
   }

}

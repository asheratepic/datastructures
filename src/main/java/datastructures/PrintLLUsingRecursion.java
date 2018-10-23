package datastructures;

public class PrintLLUsingRecursion {
   public static void main(String[] args) {
      LinkedList l1 = new LinkedList();
      l1.append(5);
      l1.append(8);
      l1.append(10);
      l1.append(12);

      LinkedList l2 = new LinkedList();
      l2.append(3);
      l2.append(7);
      l2.append(9);
      l2.append(11);

      printUsingRecursion(l1);
      System.out.println("=================================");
      reversePrintUsingRecursion(l2);
   }

   public static void printUsingRecursion(LinkedList ll) {
      Node current = ll.getHead();
      //exit condition
      if (current == null) {
         System.out.println("\n");
         return;
      }
      System.out.println(current.getValue());
      ll.getHead().setNext(current.getNext());
      printUsingRecursion(ll);
   }

   public static void reversePrintUsingRecursion(LinkedList ll) {
      Node current = ll.getHead();
      //exit condition
      if (current == null) {
         System.out.println("\n");
         return;
      }
      ll.getHead().setNext(current.getNext());
      reversePrintUsingRecursion(ll);
      System.out.println(current.getValue());
   }
}


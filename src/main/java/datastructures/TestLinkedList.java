package datastructures;

public class TestLinkedList {
   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      Node n1 = list.append(5);
      Node n2 = list.append(7);
      Node n3 = list.append(8);
      Node n4 = list.append(10);

      list.printList(n1);
      list.printHead();

      Node n5 = list.prepend(2);
      System.out.println("After prepending....");


      list.printList(n5);
      list.printHead();
   }
}

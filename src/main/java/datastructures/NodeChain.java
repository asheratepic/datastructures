package datastructures;

public class NodeChain {
   public static void main(String[] args) {
      Node first = new Node(5);
      Node middle = new Node(3);
      Node last = new Node(7);

      //let's chain these nodes
      first.setNext(middle);
      middle.setNext(last);

      //print the chain starting with node first
      printNodeChain(first);
   }

   public static void printNodeChain(Node node) {
      while (node != null) {
         System.out.println(node.getValue());
         node = node.getNext();
      }

   }


}

package datastructures;

public class MyStackImpl {
   //-1 will indicate that the stack is empty
   private int MAX_SIZE = 10;
   private int top = -1;
   private int[] a = new int[MAX_SIZE];

   public void push(int x){
      if(top == MAX_SIZE - 1){
         System.out.println("Overflow Error");
         return;
      }
      a[++top] = x;

   }

   public void pop() {
      if(top == -1 ){
         System.out.println("No element to pop");
      }
      top--;
   }

   public int getTopValue(){
      return a[top];
   }

   public boolean isEmpty() {
      boolean empty = false;
      if(top == -1){
         empty = true;
      }
      return empty;
   }

   public void printStack(){
      for(int i=0; i <= top; i++){
         System.out.println(a[i]);
      }
   }

}
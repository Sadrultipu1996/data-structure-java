import java.util.*;
public class Test{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    Node head = new Node(1,null);
    Node f=head;
    for(int i=1; i<5; i++){
      Node n= new Node(2,null);
      f.next=n;
      f=n;
    }
    for(Node h=head; h!=null; h=h.next){
      int a=sc.nextInt();
      h.element=a;
    }
    for(Node h=head; h!=null; h=h.next){
      System.out.println(h.element);
    }
  }
}
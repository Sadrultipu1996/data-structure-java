public class Node{
  public int data;
  public Node next;
  public Node prev;
  
  public Node(int d,Node n, Node p){
    data=d;
    next=n;
    prev=p;
  }
}
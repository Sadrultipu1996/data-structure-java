public class LinkedList{
  public Node head;
  
  
  public void add(int d){
    Node node = new Node(d,null);
    if(head==null){
      head=node;
    }
    else{
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=node;
    }
  }
  
  public int count(Node temp){
    if(temp==null){
      return 0;
    }
    else{
      return temp.data+count(temp.next);
    }
  }
  
  public Node getHead(){
    return head;
  }
}
      
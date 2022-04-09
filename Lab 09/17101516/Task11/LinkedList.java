public class LinkedList{
  public Node head,tail;
  
  
  public void add(int d){
    if(head==null){
      head=new Node(d,null,null);
      tail=head;
    }
    else{
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      Node node = new Node(d,null,temp);
      temp.next=node;
      tail=node;
    }
  }
  
  
  
  
  
  
  public void sort(Node temp){
    if(temp==null){
      return;
    }
    int flag=temp.data;
    Node j=temp.prev;
    while(j!=null&&j.data>flag){
      j.next.data=j.data;
      j=j.prev;
    }
    if(j==null){
      head.data=flag;
    }
    else{
      j.next.data=flag;
    }
    sort(temp.next);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public Node getHead(){
    return head;
  }
  
  public void print(){
    for(Node n=head;n!=null;n=n.next){
      System.out.print(n.data+" ");
    }
    System.out.println();
  }
  
    public void printrev(){
    for(Node n=tail;n!=null;n=n.prev){
      System.out.print(n.data+" ");
    }
    System.out.println();
  }
}

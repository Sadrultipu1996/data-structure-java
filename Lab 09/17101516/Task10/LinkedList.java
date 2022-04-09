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
  
  public void sort(Node temp){
    if(temp.next==null){
      return;
    }
    Node minLocation=temp;
    for(Node n=temp.next;n!=null;n=n.next){
      if(n.data<minLocation.data){
        minLocation=n;
      }
      int flag=temp.data;
      temp.data=minLocation.data;
      minLocation.data=flag;
      
      sort(temp.next);
    }
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
}
      
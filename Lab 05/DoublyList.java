public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head = new Node(null, null, null);
    Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head; // Making it circular
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int i=0;
    for(Node h=head.next; h!=head; h=h.next){
      i++;
    } 
    return i; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    // TO DO   
    for(Node h=head.next; h!=head; h=h.next){
      System.out.print(h.element+" ");
    }
    System.out.println();
  }
  
  public void backwardprint(){
    for(Node h=head.prev; h!=head; h=h.prev){
      System.out.print(h.element+" ");
    }
    System.out.println();
    // TO DO     
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    if(idx<0){
      return null;
    }else{
      int i=0;
      for(Node h=head.next; h!=head; h=h.next){
        if(i==idx){
          return h;
        }
        i++;
      }
    }
    return null; // please remove this line!
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    int i=0;
    for(Node h=head.next; h!=head; h=h.next){
      if(h.element==elem){
        return i;
      }
      i++;
    }
    
    
    return -1; // please remove this line!
  }
  
  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    if(idx<0){
      System.out.println("Invalid index");
    }else{
      Node n=new Node(elem,null,null);
      if(idx==0){
        head.next.prev=n;
        n.prev=head;
        n.next=head.next;
        head.next=n;
      }else{
        boolean flag=false;
        int i=0;
        for(Node h=head.next; h!=head; h=h.next){
          if(i==idx-1){
            flag=true;
            h.next.prev=n;
            n.prev=h;
            n.next=h.next;
            h.next=n;
          }
          i++;
        }
        if(flag==false){
          System.out.println("Invalid index");
        }
      }
      
    }
  }
  
  
  
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    if(index<0){
      return null;
    }
    Object elem;
    if(index==0){
      Node x=head.next;
      x.next.prev=head;
      head.next=x.next;
      x.next=null;
      x.prev=null;
      elem=x.element;
      x=null;
      return elem;
    }else{
      int i=0;
      for(Node h=head.next; h!=head; h=h.next){
        if(i==index-1){
          Node x=h.next;
          x.next.prev=h;
          h.next=x.next;
          x.next=null;
          x.prev=null;
          elem=x.element;
          x=null;
          return elem;
        }
        i++;
      }
      
      return null;
    }
  }
  
  
  
}
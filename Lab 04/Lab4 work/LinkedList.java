public class LinkedList{
  public Node head;

  public LinkedList(Object [] a){

    head = new Node(a[0],null);
    Node h = head;
    for(int i=1; i<a.length; i++){
      Node n=new Node(a[i],null);
      h.next=n;
      h=h.next;
    }
    
    
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int count=0;
    for(Node h=head; h!=null; h=h.next){
      count++;
    }
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO    
    for(Node h=head; h!=null; h=h.next){
      System.out.print(h.element+" ");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    if(idx<0){
      return null;
    }
    int i=0;
    for(Node h=head; h!=null; h=h.next){
      if(i==idx){
        return h;
      }
      i++;
    }
    return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
    if(idx<0){
      return null;
    }
    int i=0;
    for(Node h=head; h!=null; h=h.next){
      if(i==idx){
        return h.element;
      }
      i++;
    }
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
    if(idx<0){
      return null;
    }
    int i=0; 
    for(Node h=head; h!=null; h=h.next){
      if(i==idx){
        Object oldElem=h.element;
        h.element=elem;
        return oldElem;
      }
      i++;
    }
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    int i=0;
    for(Node h=head; h!=null; h=h.next){
      if(h.element==elem){
        return i;
      }
      i++;
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
    for(Node h=head; h!=null; h=h.next){
      if(h.element==elem){
        return true;
      }
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    Node h=head;
    Node newhead=new Node(h.element,null);
    Node newh=newhead;
    h=h.next; 
    
    for( ; h!=null; h=h.next){
      Node n=new Node(h.element, null);
      newh.next=n;
      newh=newh.next;
    }
    
    return newhead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    Node h=head;
    Node nh=new Node(h.element,null);
    h=h.next;
    for(; h!=null; h=h.next){
      Node n= new Node(h.element, null);
      n.next=nh; 
      nh=n;
    }
    Node nhead=nh;
    return nhead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    if(idx<0||idx>countNode()){
      System.out.println("Invalid index");
    }else{
      Node n=new Node(elem,null);
      if(idx==0){
        n.next=head;
        head=n;
      }else{
        Node pred = nodeAt(idx-1);
        n.next=pred.next;
        pred.next=n;
      }
    }
    
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    if(index<0||index>countNode()){
      return null;
    }else{
      Node remNode= null;
      if(index==0){
        remNode=head;
        head=head.next;
      }else{
        Node pred=nodeAt(index-1);
        remNode=pred.next;
        pred.next=remNode.next;
      }
      return remNode.element;
    } // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
    Node oldHead=head;
    Node tail=nodeAt(countNode()-1);
    head=oldHead.next;
    tail.next=oldHead;
    oldHead.next=null;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
    Node tail=(nodeAt(countNode()-1));
    Node predTail=(nodeAt(countNode()-2));
    tail.next=head;
    predTail.next=null;
    head=tail;
  }
  
}
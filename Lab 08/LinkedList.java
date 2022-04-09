public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    Node[] cur = new Node[a.length];
    head = new Node(a[0], null);
    cur[0]=head;
    int i;
    Node b = null;
    for(i=1;i<a.length;i++)
    {
        b = new Node(a[i], null);
        cur[i-1].next = b;
        cur[i] = b;
    }
    head = cur[0];
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
  }
  public int countNode(){
    Node cur = head;
    int i = 0;
    while(cur != null){
        cur=cur.next;i++;
    }
    
    return i; // please remove this line!
  }
  public void printList(){
    Node cur = head;
    while(cur != null){
        System.out.print(cur.element+" ");
        cur = cur.next;
    }
      System.out.println("");
  }
  
  public void selection_sort()
    {
        Node i = head;
        while(i.next != null)
        {
            Node j = i.next;
            while(j != null)
            {
                int a = (int) j.element;
                int b = (int) i.element;
                if(a<b)
                {
                    Object temp = i.element;
                    i.element=j.element;
                    j.element = temp;
                }
                j = j.next;
            }
            i=i.next;
        }
    }
  void bubbleSort()
    {
        int n=countNode(), i=0, j=0;
        for(i=0;i<n-1;i++)
        {
            Node cur=head;
            for(j=0;j<n-i-1;j++,cur=cur.next)
            {
                if((int) cur.element> (int) cur.next.element)
                {
                    Object tmp = cur.element;
                    cur.element = cur.next.element;
                    cur.next.element = tmp;
                }
            }
        }
    }
  
  public void insertion_sort()
    {
        Node i = head.next;
        while(i != null)
        {
            Object key = i.element;
            Node j;
            for(j=head; j.next!=i; j=j.next);
            while(j!=head && (int) j.element > (int) key)
            {
                j.next.element = j.element;
                for(Node k=head;k.next!=j;k=k.next);
                j=k;
            }
            j.next.element = key;
            i=i.next;
        }
    }
  
}
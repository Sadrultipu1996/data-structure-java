public class DoublyList{
    public Node2 head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node2 that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node2(null, null, null);
        Node2 tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node2 mn = new Node2(a[i], null, null);
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
    public DoublyList(Node2 h){
        head = h;
    }

    public void forwardprint(){
        Node2 cur = head.next;
    while(cur!=head){
        System.out.print(cur.element + " ");
        cur = cur.next;  
    }
        System.out.println("");
    }
    
    public void insertion_sort()
    {
        Node2 i = head.next.next;
        while(i != head)
        {
            Object key = i.element;
            Node2 j = i.prev;
            while(j!=head && (int) j.element > (int) key)
            {
                j.next.element = j.element;
                j=j.prev;
            }
            j.next.element = key;
            i=i.next;
        }
    }
    
    void bubbleSort()
    {
        int n=0, i=0, j=0;
        for(Node2 h=head.next; h!=head; h=h.next){
            n++;
        }
        for(i=0;i<n-1;i++)
        {
            Node2 cur=head;
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
    
    public void selection_sort()
    {
        Node2 i = head.next;
        while(i.next != head)
        {
            Node2 j = i.next;
            while(j != head)
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
    
    
}
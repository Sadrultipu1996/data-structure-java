public class Node {
    public Object element;
    public Node parent;
    public Node left, right;
    
    public Node (Object e) {
        this(e, null);
    }
    
    public Node (Object e, Node p) {
        element = e;
        parent = p;
        left = right = null;
    }
    
    
}
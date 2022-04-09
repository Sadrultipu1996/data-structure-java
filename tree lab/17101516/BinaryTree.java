public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, Object value) {
        if (current == null) {
            return new Node(value);
        }
        if ((int) value < (int) current.item) {
            current.left = addRecursive(current.left, value);
        } else if ((int) value > (int) current.item) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }
    public void add(Object value) {
        root = addRecursive(root, value);
    }

    public static Node leftmost(Node n) {
        if (n.left == null)
            return n;
        else
            return leftmost(n.left);
    }

    public static Node rightmost(Node n) {
        if (n.right == null)
            return n;
        else
            return rightmost(n.right);
    }

    public void preOrderVisit(Node n) {
        if (n != null) {
            visit(n.item);
            preOrderVisit(n.left);
            preOrderVisit(n.right);
        }
    }
    public void inOrderVisit(Node n) {
        if (n != null) {
            inOrderVisit(n.left);
            visit(n.item);
            inOrderVisit(n.right);
        }
    }
    public void postOrderVisit(Node n) {
        if (n != null) {
            postOrderVisit(n.left);
            postOrderVisit(n.right);
            visit(n.item);
        }
    }
    public void visit(Object e){
        System.out.println(e);
    }
    public void print(){
        inOrderVisit(root);
    }
    public void highest(){
        visit(rightmost(root).item);
    }
    public void lowest(){
        visit(leftmost(root).item);
    }
    public boolean findNode(Object key) {

        // Start at the top of the tree

        Node focusNode = root;

        // While we haven't found the Node
        // keep looking

        while ((int)focusNode.item != (int)key) {

            // If we should search to the left

            if ((int)key < (int)focusNode.item) {

                // Shift the focus Node to the left child

                focusNode = focusNode.left;

            } else {

                // Shift the focus Node to the right child

                focusNode = focusNode.right;

            }

            // The node wasn't found

            if (focusNode == null)
                return false;
        }
        return true;
    }
}

package Collections;



public class bTree {
    class Node {
        int value;Node left;Node right;
        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    Node root;

    public void add(int value){
        root = addRecursive(root,value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {return new Node(value);}
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }

    public void traverse(Node node){
        if(node!=null){
            traverse(node.left);
            System.out.println(node.value);
            traverse(node.right);

        }
    }


    public static void main(String[] args) {

        bTree btree = new bTree();
        btree.add(5);
        btree.add(9);
        btree.add(4);
        btree.add(10);
        btree.add(8);

        btree.traverse(btree.root);



    }
}

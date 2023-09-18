package binary.tree;

public class BinarySearchTree  {
    NodeB root;

    public BinarySearchTree() {
        root = null;
    }
    public void add(int value) {
        root = insert(root, value);
    }
 public NodeB insert(NodeB root, int num){
     if (root == null) {
         return new NodeB(num);
     }

     if (num < root.data) {
         root.left = insert(root.left, num);
     } else if (num > root.data) {
         root.right = insert(root.right, num);
     }

     return root;
 }

    void Preorder(NodeB node){
        if (node == null)
            return;
        System.out.print(node.data + " ");
        Preorder(node.left);
        Preorder(node.right);
    }
    void printPreorder() { Preorder(root); }

// 2
 public boolean Contains(int key){
        NodeB current;
    if ( root == null)
     return false;
    current = root;
    int x = 5;
        while (current!=null) {

       if(current.data == key){
//           System.out.println("i'm here"+x);
                return true;
       }

       else if(current.data > key)
                current = current .left;
        else if(current.data < key)
           current = current .right;
        }
    // System.out.println("No luck");
    return false;
 }

 }








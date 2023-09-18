package binary.tree;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class BinaryTree {
    Node root;
    ArrayList<Object> p = new ArrayList<Object>(); // Create an ArrayList object
    ArrayList<Object> q = new ArrayList<Object>();
    BinaryTree(int key) {
        root = new Node(key); }
    BinaryTree() {
        root = null; }

    void Inorder(Node node){
        if (node == null)
            return;
        Inorder(node.left);
        System.out.print(node.data + " ");
        p.add(node.data);
        Inorder(node.right);}
    void Preorder(Node node){
        if (node == null)
            return;
        q.add(node.data);
        System.out.print(node.data + " ");
        Preorder(node.left);
        Preorder(node.right);
    }
    void  Postorder(Node node){
        if (node == null){
            return;
    }
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data + " ");

}

    void printPostorder() { Postorder(root); }
   public ArrayList printInorder() {
        Inorder(root);
    return p;
    }
    public ArrayList printPreorder() {
        Preorder(root);
    return q;
    }



}






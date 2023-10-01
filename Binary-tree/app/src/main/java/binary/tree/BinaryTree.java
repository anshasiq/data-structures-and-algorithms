package binary.tree;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.Objects;

public class BinaryTree {
    Node root;
    int max=0;
    ArrayList<Object> p = new ArrayList<Object>(); // Create an ArrayList object
    ArrayList<Object> q = new ArrayList<Object>();
    Queue<Node> Q = new LinkedList<>();

    BinaryTree(int key) {
        root = new Node(key); }
    BinaryTree() {
        root = null; }

  void reb (Node node){
      if (node == null)
          return;
      if(max<node.data)
          max=node.data;
      reb(node.left);
      reb(node.right);

  }
    public int FindMaximumValue(){
        reb(root);
        return max;
    }


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

    void printPostorder() {
        Postorder(root); }
   public ArrayList printInorder() {
        Inorder(root);
    return p;
    }
    public ArrayList printPreorder() {
        Preorder(root);
    return q;
    }
    ArrayList<Integer> breadth_first = new ArrayList<Integer>();

   public ArrayList breadth_first(Node node){
        Q.add(node);
       while (!Q.isEmpty())
        {
            if(Q.peek().left!=null)
            Q.add(Q.peek().left);
            if(Q.peek().right!=null)
            Q.add(Q.peek().right);
            breadth_first.add(Q.peek().data);
            //System.out.println(Q.peek().data);
            Q.poll();

        }

return  breadth_first;
   }

int sum=0;
    public int oddnum(){
        Rec(root);
        return sum;
    }
void Rec (Node node){
    if (node == null)
        return;

    Rec(node.left);
    Rec(node.right);

    if(node.data%2!=0)
        sum=sum+node.data;

}



}






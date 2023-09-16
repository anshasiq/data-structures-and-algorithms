package binary.tree;

public class BinaryTree <T>{
    Node root;

    BinaryTree(T key) {
        root = new Node(key); }
    BinaryTree() {
        root = null; }

    void Inorder(Node node){
        if (node == null)
            return;
        Inorder(node.left);
        System.out.print(node.data + " ");
        Inorder(node.right);}
    void Preorder(Node node){
        if (node == null)
            return;
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
    void printInorder() { Inorder(root); }
    void printPreorder() { Preorder(root); }



}






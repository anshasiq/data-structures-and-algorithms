package binary.tree;

public class FizzBuzzTree {
   KaryNode root;

    public FizzBuzzTree(KaryNode root) {
        this.root = root;
    }

    public void change(KaryNode node) {
        if (node != null) {
            System.out.println(node.value + " ");
            int data = Integer.parseInt(node.getValue());
//            System.out.println(data);
            if (data % 3 == 0 && data % 5 == 0) {
            node.value="fizzBuss";
            }
            else if (data % 3 == 0) {
                node.value="Fizz";}
            else if (data % 5 == 0) {
                node.value="Buzz";}
//
            for (KaryNode child : node.childrenNodes) {
                change(child);
            }
        }}



    public void preorderTraversal(KaryNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            for (KaryNode child : root.childrenNodes) {
                preorderTraversal(child);
            }
        }}



}
package binary.tree;

public class FizzBuzzTree {
    public static KaryTreeNode fizzBuzzTree(KaryTreeNode root) {
        if (root == null) {
            return null;
        }

        // Calculate the new value based on FizzBuzz rules
        String newValue;
        if (root.value % 3 == 0 && root.value % 5 == 0) {
            newValue = "FizzBuzz";
        } else if (root.value % 3 == 0) {
            newValue = "Fizz";
        } else if (root.value % 5 == 0) {
            newValue = "Buzz";
        } else {
            newValue = Integer.toString(root.value);
        }

        // Create a new node with the new value and recurse on children
        KaryTreeNode newRoot = new KaryTreeNode("newValue");
        for (KaryTreeNode child : root.children) {
            newRoot.children.add(fizzBuzzTree(child));
        }

        return newRoot;
}}

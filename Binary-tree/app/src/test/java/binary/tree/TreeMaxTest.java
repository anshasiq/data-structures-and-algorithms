package binary.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TreeMaxTest {
    @Test

    void maxis5() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        assertEquals(tree.FindMaximumValue(),5);}

   @Test  void maxis23() {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(45);
            tree.root.left = new Node(34);
            tree.root.right = new Node(23);
            tree.root.left.left = new Node(77);
            tree.root.left.right = new Node(54);
            assertEquals(tree.FindMaximumValue(),77);




    }


}

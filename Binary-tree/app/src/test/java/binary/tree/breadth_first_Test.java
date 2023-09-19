package binary.tree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class breadth_first_Test {
    @Test void test(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(1);c.add(2);c.add(3);c.add(4);c.add(5);
        assertEquals(c,tree.breadth_first(tree.root));

    }
}

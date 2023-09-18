package binary.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTest {
    @Test void preorderandInoreder() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(4);
        c.add(2);
        c.add(5);
        c.add(1);
        c.add(3);
        assertEquals(tree.printInorder(),c);
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(5);
        expectedList.add(3);
        assertEquals(tree.printPreorder(),expectedList);

//
    }
}

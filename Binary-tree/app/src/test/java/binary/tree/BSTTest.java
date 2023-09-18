package binary.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BSTTest {
    @Test void BST(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.add(7);
        bt.add(3);
        bt.add(2);
        bt.add(5);
        bt.add(10);
        bt.add(12);
        bt.printPreorder();
        assertTrue( bt.Contains(2));
        assertTrue( bt.Contains(5));
        assertFalse( bt.Contains(23));

    }
}

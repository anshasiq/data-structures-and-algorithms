package hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TreeIntersectionCC32 {
    @Test
    public void Treeintersectionnum1() {

        App main = new App();

        BinaryTree a = new BinaryTree();

        a.root =new Node(150);
        a.root.right = new Node(250);
        a.root.right.left = new Node(200);
        a.root.right.right = new Node(350);
        a.root.right.right.left = new Node(300);
        a.root.right.right.right = new Node(500);
        a.root.left= new Node(100);
        a.root.left.right= new Node(160);
        a.root.left.right.left= new Node(125);
        a.root.left.right.right= new Node(175);
        a.root.left.left= new Node(75);

        BinaryTree B = new BinaryTree();
        B.root=new Node(42);
        B.root.right = new Node(600);
        B.root.right.left = new Node(200);
        B.root.right.right = new Node(350);
        B.root.right.right.left = new Node(4);
        B.root.right.right.right = new Node(500);
        B.root.left= new Node(100);
        B.root.left.right= new Node(160);
        B.root.left.right.left= new Node(125);
        B.root.left.right.right= new Node(175);
        B.root.left.left= new Node(15);
        main.tree_intersection(a.root,B.root);
        int [] as={100, 160, 125, 175, 200, 350, 500};
        ArrayList<Integer> normal =new ArrayList<>() ;
        normal.add(100); normal.add(160); normal.add(125); normal.add(175); normal.add(200); normal.add(350); normal.add(500);
        assertEquals(normal,main.finall);
    }
    @Test
    public void Treeintersectionnum2() {
        App main = new App();
        BinaryTree a = new BinaryTree();
        BinaryTree b = new BinaryTree();

        a.root=new Node(1);
        a.root.right=new Node(3);
        a.root.left=new Node(2);


        b.root=new Node(0);
        b.root.right=new Node(3);
        b.root.left=new Node(2);
        main.tree_intersection(a.root,b.root);
        ArrayList<Integer> normal =new ArrayList<>() ;
        normal.add(2); normal.add(3);
        assertEquals(normal,main.finall);
    }
}

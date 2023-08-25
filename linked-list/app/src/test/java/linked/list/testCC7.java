package linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testCC7 {
    @Test void MainTestForAllFirstThreeUnite(){
        LinkedList Nll = new LinkedList();
        Nll.append(1);
        Nll.append(3);
        Nll.append(8);
        Nll.append(2);

        assertEquals(2, Nll.kthFromEnd(0));
        assertEquals(8, Nll.kthFromEnd(1));
        assertEquals(3,  Nll.kthFromEnd(2));
        assertEquals(1,  Nll.kthFromEnd(3));
        assertEquals(-1,  Nll.kthFromEnd(-3));
        assertEquals(-1,  Nll.kthFromEnd(6));
    }
    @Test void MainTestForAllFirstothers(){
        LinkedList Nll = new LinkedList();
        Nll.append(1);
        assertEquals(1, Nll.kthFromEnd(0));
        assertEquals(-1, Nll.kthFromEnd(2));
        assertEquals(-1, Nll.kthFromEnd(-5));
    }

    @Test void kth_From_End_validInput_ReturnValue(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(5);
        testLinkedList.insert(6);
        testLinkedList.insert(20);  // 20 -> 6 -> 5
        int actual = testLinkedList.kthFromEnd(2);
        assertEquals(20,actual);
    }
    @Test void kth_From_End_NumberIsBigger_ThanTheLinkedList_ReturnIllegalArgumentException(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(20);
        testLinkedList.insert(25);
        testLinkedList.insert(45); // 45 -> 25 -> 20
        assertEquals(-1,testLinkedList.kthFromEnd(45));}
    @Test void kth_From_End_NegativeNumbers_ReturnIllegalArgumentException(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(20);
        testLinkedList.insert(25);
        testLinkedList.insert(45); // 45 -> 25 -> 20
        assertEquals(-1,testLinkedList.kthFromEnd(-120));
    }
    @Test void kth_From_End_LinkedListOfSize1_ReturnValue(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(15);
        assertEquals(15,testLinkedList.kthFromEnd(0));
    }

    @Test void kth_From_End_K_IsTheSameAs_LinkedList_Size_ReturnNullPointerException() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(15);
        assertEquals(-1, testLinkedList.kthFromEnd(1));
    }
    
    

}

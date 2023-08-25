package linked.list;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testCC6 {

    @Test void BeforeAndAfter(){
        LinkedList c6 = new LinkedList();
        c6.append(1);
        c6.append(2);
        c6.append(3);
        c6.insertAfter(3,4);
        c6.insertAfter(4,5);
        c6.insertAfter(2,3);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 3 } -> { 4 } -> { 5 } -> NULL",c6.toString());
        c6.insertBefore(1,0);
        c6.insertBefore(0,-1);
        c6.insertBefore(3,2);
        assertEquals("{ -1 } -> { 0 } -> { 1 } -> { 2 } -> { 2 } -> { 3 } -> { 3 } -> { 4 } -> { 5 } -> NULL",c6.toString());
//        assertEquals();
    }



    @Test void insertAfter_LinkedList_ReturnValueAfter(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(5);
        testLinkedList.insert(9);
        testLinkedList.insertAfter(9,6);
        assertEquals("{ 9 } -> { 6 } -> { 5 } -> NULL",testLinkedList.toString());
    }
    @Test void insertBefore_LinkedList_ReturnValueBefore(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(5);
        testLinkedList.insert(9);
        testLinkedList.insertBefore(5,6);
        assertEquals("{ 9 } -> { 6 } -> { 5 } -> NULL",testLinkedList.toString());
    }
    @Test void appendOnEmpty_LinkedList_ReturnLinkedListWith_Value_HeadNode(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.append(5);
        assertEquals("{ 5 } -> NULL",testLinkedList.toString());
    }

    @Test void appendOnValid_LinkedList_ReturnValueAt_TheEnd(){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);
        testLinkedList.insert(25);
        testLinkedList.append(4);

        assertEquals("{ 25 } -> { 10 } -> { 4 } -> NULL",testLinkedList.toString());
    }
}
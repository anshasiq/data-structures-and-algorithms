package linked.list;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCC8 {
    @Test void FirstOne (){
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.append(1);
        l1.append(3);
        l1.append(2);
        l2.append(5);
        l2.append(9);
        l2.append(4);
        LinkedList F =  l1.ziplists(l1,l2);
        assertEquals(F.toString(),"{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { 4 } -> NULL");
    }
    @Test void SecondOne (){
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.append(1);
        l1.append(3);
        l2.append(2);
        l2.append(5);
        l2.append(9);
        LinkedList F =  l1.ziplists(l1,l2);
        assertEquals(F.toString(),"{ 1 } -> { 2 } -> { 3 } -> { 5 } -> { 9 } -> NULL");


    }


}

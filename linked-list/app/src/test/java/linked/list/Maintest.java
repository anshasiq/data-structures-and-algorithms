package linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maintest {
    @Test void to(){
        LinkedList Nll = new LinkedList();
        Nll.append(1);
        Nll.append(3);
        Nll.append(8);
        Nll.append(2);

        Nll.kthFromEnd(1);
        Nll.kthFromEnd(2);
        Nll.kthFromEnd(3);
        Nll.kthFromEnd(4);
        assertEquals(2, Nll.kthFromEnd(0));
        assertEquals(8, Nll.kthFromEnd(1));
        assertEquals(3,  Nll.kthFromEnd(2));
        assertEquals(-1,  Nll.kthFromEnd(6));




    }

}

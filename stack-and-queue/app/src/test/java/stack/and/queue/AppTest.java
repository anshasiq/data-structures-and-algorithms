package stack.and.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {
    @Test
    public  void catClassTest() {
        App stackExample = new App();
        stackExample.validate_brackets("[}");
        assertEquals(  stackExample.validate_brackets("[}"), false);
        assertEquals(  stackExample.validate_brackets("[]"), true);
        assertEquals(  stackExample.validate_brackets("()[[Extra Characters]]"), true);
        assertEquals(  stackExample.validate_brackets("(]("), false);
        assertEquals(  stackExample.validate_brackets("{(})"), false);
        assertEquals(  stackExample.validate_brackets("{}{Code}[Fellows](())"), true);
        assertEquals(  stackExample.validate_brackets("{}(){}"), true);
    }


}

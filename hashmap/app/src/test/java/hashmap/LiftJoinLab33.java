package hashmap;

import org.junit.jupiter.api.Test;

import static hashmap.App.left_join;
import static org.junit.jupiter.api.Assertions.*;
public class LiftJoinLab33 {
    @Test
    public void test_repeated_word() {
        App app = new App();
        Hashtable<String, String>  a = new Hashtable<>();  Hashtable<String, String>  b = new Hashtable<>();
        a.set("diligent","employed");
        b.set("diligent","idle");
        a.set("fond","enamored");
        b.set("fond","averse");
        a.set("guide","usher");
        b.set("guide","follow");
        a.set("outfit","garb");
        b.set("flow","jam");
        a.set("wrath","anger");
        b.set("wrath","delight");

//        System.out.println();
        assertEquals("[guide, usher, follow], [outfit, garb, null], [diligent, employed, idle], [fond, enamored, averse], [wrath, anger, delight]]",left_join(a,b));
    }}

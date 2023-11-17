package hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static hashmap.App.left_join;
import static org.junit.jupiter.api.Assertions.*;
public class LiftJoinLab33 {
    @Test
    public void test_lift_Join() {
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
        ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("guide", "usher", "follow")),
                new ArrayList<>(Arrays.asList("outfit", "garb", null)),
                new ArrayList<>(Arrays.asList("diligent", "employed", "idle")),
                new ArrayList<>(Arrays.asList("fond", "enamored", "averse")),
                new ArrayList<>(Arrays.asList("wrath", "anger", "delight"))
        ));
//        System.out.println();
        assertEquals(twoDArrayList,left_join(a,b));
    }}

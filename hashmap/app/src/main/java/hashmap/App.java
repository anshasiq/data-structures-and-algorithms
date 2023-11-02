/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Hashtable<String, Integer> h = new Hashtable<>();

        h.set("apple", 5);
        h.set("ap", 8);
        h.set("apas", 344);
        h.set("ap", 8);
        h.set("ahmad", 344);
        h.set("ali", 8);
        h.set("ahmad", 5);
        h.set("mohammed", 8);
        h.set("Qais".toLowerCase(), 344);
        h.set("alaa", 8);
        h.set("haithem", 344);
        h.set("khaled", 8);

        System.out.println(h.has("ap"));
        System.out.println( h.toString());
        System.out.println(h.has("apdf")+" ");
        System.out.println(h.hash("apple"));

//        System.out.println( Entry);
    }
}

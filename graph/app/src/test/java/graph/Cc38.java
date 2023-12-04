package graph;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static graph.App.business_trip;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Cc38 {
    @Test void test1() {
        Graph jordan= new Graph();
        jordan.addVertex("amman");
        jordan.addVertex("Mafraq");
        jordan.addVertex("Zarqa");
        jordan.addVertex("Madaba");
        jordan.addVertex("Aqaba");
        jordan.addVertex("Maan");
        jordan.addEdge("amman","Zarqa",15);
        jordan.addEdge("amman","Madaba",10);
        jordan.addEdge("amman","Maan",35);
        jordan.addEdge("Maan","Aqaba",5);
        jordan.addEdge("Zarqa","Mafraq",33);
        Vertex a = new Vertex("amman");
        ArrayList <String> DFS= new ArrayList<>();
        for(Vertex v:jordan.graph_depth_first(a)){
           DFS.add(v.label);
        }
        ArrayList <String> ans= new ArrayList<>();
        ans.add("amman");
        ans.add("Maan");
        ans.add("Aqaba");
        ans.add("Madaba");
        ans.add("Zarqa");
        ans.add("Mafraq");

        assertEquals(DFS,ans);

    }
    @Test void test2() {
        Graph jordan= new Graph();
        jordan.addVertex("amman");
        jordan.addVertex("Mafraq");
        jordan.addVertex("Madaba");
        jordan.addVertex("Aqaba");
        jordan.addVertex("Maan");
        jordan.addEdge("amman","Mafraq",15);
        jordan.addEdge("amman","Madaba",10);
        jordan.addEdge("amman","Maan",35);
        jordan.addEdge("Maan","Aqaba",5);
//        jordan.addEdge("Zarqa","Mafraq",33);
        Vertex a = new Vertex("amman");
        ArrayList <String> DFS= new ArrayList<>();
        for(Vertex v:jordan.graph_depth_first(a)){
            DFS.add(v.label);
        }
        ArrayList <String> ans= new ArrayList<>();
        ans.add("amman");
        ans.add("Maan");
        ans.add("Aqaba");
        ans.add("Madaba");
        ans.add("Mafraq");
        assertEquals(DFS,ans);

    }
    @Test void test3() {
        Graph jordan= new Graph();
        jordan.addVertex("amman");
        jordan.addVertex("Mafraq");
        jordan.addVertex("Zarqa");
        jordan.addVertex("Madaba");
        jordan.addVertex("Aqaba");
        jordan.addVertex("Maan");
        jordan.addEdge("amman","Zarqa",15);
        jordan.addEdge("amman","Madaba",10);
        jordan.addEdge("amman","Maan",35);
        jordan.addEdge("Maan","Aqaba",5);
        jordan.addEdge("Zarqa","Mafraq",33);
        Vertex a = new Vertex("amman");
        ArrayList <String> DFS= new ArrayList<>();
        for(Vertex v:jordan.graph_depth_first(a)){
            DFS.add(v.label);
        }
        ArrayList <String> ans= new ArrayList<>();
        ans.add("amman");
        ans.add("Maan");
        ans.add("Aqaba");
        ans.add("Madaba");
        ans.add("Zarqa");
        ans.add("Mafraq");

        assertEquals(DFS,ans);

    }
}

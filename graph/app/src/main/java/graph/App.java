/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;


import java.lang.reflect.Array;

import java.util.List;


public class App {

   public static Integer business_trip(Graph graph, String[] city_names){
       if (city_names.length < 2) {
            return null;
        }
        int sum = 0;
      for(int i=0;i<city_names.length-1;++i) {
          Vertex currentCity = new Vertex(city_names[i]);
          Vertex nextCity = new Vertex(city_names[i + 1]);
          List<Vertex> neighbors = graph.getNeighbors(currentCity.label);
          if (neighbors == null || !neighbors.contains(nextCity)) {
              return null;
          } else {
              for (Vertex neighbor : neighbors) {
                  if (neighbor.equals(nextCity)) {
                      sum += neighbor.weight;
                  }
              }}


      }

       return sum;
   }
    public static void main(String[] args) {



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
        String[] trip1 = {"amman", "Zarqa","Mafraq"};
//        System.out.println(business_trip(jordan,trip1));
//////////////////////////////////////////////////////
//        jordan.graph_depth_first(jordan.getVertices());

     Vertex a = new Vertex("amman");
//        System.out.println(jordan.getVertices());
//        System.out.println(jordan.graph_depth_first(a));
        for(Vertex v:jordan.graph_depth_first(a)){
            System.out.println(v.label);
        }
//        System.out.println(jordan.getNeighbors(a.label));
        /////////////////////////////////////////

}

}

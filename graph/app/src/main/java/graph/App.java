/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;


import java.util.List;


public class App {
    public static Integer businessTrip(Graph graph, String[] cities) {
        if (cities.length < 2) {
            return null;
        }
        int totalCost = 0;
        for (int i = 0; i < cities.length - 1; i++) {
            Vertex currentCity = new Vertex(cities[i]);
            Vertex nextCity = new Vertex(cities[i + 1]);
            List<Vertex> neighbors = graph.getNeighbors(currentCity.label);
            if (neighbors == null || !neighbors.contains(nextCity)) {
                return null;
            }
            for (Vertex neighbor : neighbors) {
                if (neighbor.equals(nextCity)) {
                    totalCost += neighbor.weight;
                }
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex A = graph.addVertex("A");
        Vertex B = graph.addVertex("B");
        Vertex C = graph.addVertex("C");
        Vertex D = graph.addVertex("D");

        graph.addEdge(A, B ,2);
        graph.addEdge(C, D,10);
        graph.addEdge(D, B,4);
//        graph.addEdge(vertex2, vertex1);


        graph.addEdge("A","B",7)  ;
//        graph.addEdge("B","A",2);
//        graph.addEdge(vertex2, vertex1);
        System.out.println("Vertices: " + graph.getVertices());
        System.out.println("Neighbors of vertex " + vertex2.label + ": " + graph.getNeighbors("A"));
        System.out.println("Graph size: " + graph.size());
        Graph citiesGraph = new Graph();
        citiesGraph.addVertex("London");
        citiesGraph.addVertex("Paris");
        citiesGraph.addVertex("Berlin");
        citiesGraph.addVertex("Rome");
        citiesGraph.addEdge("London", "Paris", 50);
        citiesGraph.addEdge("Paris", "Berlin", 40);
        citiesGraph.addEdge("Berlin", "Rome", 30);


        String[] trip1 = {"London", "Paris", "Berlin", "Rome"};
        Integer cost1 = businessTrip(citiesGraph, trip1);
        System.out.println(cost1);

        String[] trip2 = {"London", "Rome"};
        Integer cost2 = businessTrip(citiesGraph, trip2);
        System.out.println(cost2);
}

}

package graph;

import java.util.*;

public class Graph {
    private Map<Vertex, LinkedList<Edge>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }


    public List<Vertex> bfs(Vertex start) {
        List<Vertex> visited = new ArrayList<>();
        Queue<Vertex> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();

            System.out.println( current);

            for (Edge edge : adjacencyList.get(current)) {
                Vertex neighbor = edge.vertex;
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return visited;
    }


    public Vertex addVertex(String value) {
        Vertex vertex = new Vertex(value);
        adjacencyList.put(vertex, new LinkedList<>());
        return vertex;
    }

    // Overloaded addEdge method without weight parameter

    public void addEdge(Vertex vertex1, Vertex vertex2) {
        if (!adjacencyList.containsKey(vertex1) || !adjacencyList.containsKey(vertex2)) {
            throw new IllegalArgumentException("Both vertices should already be in the graph");
        }

        adjacencyList.get(vertex1).add(new Edge(vertex2));
        adjacencyList.get(vertex2).add(new Edge(vertex1));
    }


//
    public void addEdge(Vertex vertex1, Vertex vertex2, int weight) {
        if (!adjacencyList.containsKey(vertex1) || !adjacencyList.containsKey(vertex2)) {
            throw new IllegalArgumentException("Both vertices should already be in the graph");
        }

        adjacencyList.get(vertex1).add(new Edge(vertex2, weight));
        adjacencyList.get(vertex2).add(new Edge(vertex1, weight));
    }

    public Collection<Vertex> getVertices() {
        return adjacencyList.keySet();
    }

    public Collection<Edge> getNeighbors(Vertex vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            return Collections.emptyList();
        }

        return adjacencyList.get(vertex);
    }

    public int size() {
        return adjacencyList.size();
    }

    private static class Edge {
        Vertex vertex;
        int weight;

        public Edge(Vertex vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        public Edge(Vertex vertex) {
            this(vertex, 0);
        }
        @Override
        public String toString() {
            return "Edge to " + vertex + " with weight " + weight;
        }
    }}
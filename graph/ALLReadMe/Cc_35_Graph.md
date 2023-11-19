# graph class

**Instance Variables:**

adjacencyList: This is a Map that represents the adjacency list of the graph. The keys are instances of the Vertex class, and the values are linked lists (LinkedList<Edge>) representing the edges associated with each vertex.
Constructor:

The constructor initializes the adjacencyList as an empty HashMap.
   
**addVertex Method:**   

Method Signature: public Vertex addVertex(String value)
This method adds a new vertex to the graph and returns the created Vertex instance. It takes a String parameter representing the value of the vertex.
It creates a new Vertex object with the given value and adds an entry to the adjacencyList with the new vertex and an empty linked list.
   
**addEdge Methods:**   

Method Signature (with weight): public void addEdge(Vertex vertex1, Vertex vertex2, int weight)
Method Signature (without weight): public void addEdge(Vertex vertex1, Vertex vertex2)
These methods add an edge between two vertices in the graph. The first version takes two vertices and a weight, while the second version assumes a default weight of 0.
It checks if both vertices are already in the graph and then adds the corresponding edges to each vertex's linked list in the adjacency list.

**getVertices Method:**

Method Signature: public Collection<Vertex> getVertices()
This method returns a collection of all vertices in the graph by retrieving the key set of the adjacencyList.

**getNeighbors Method:**

Method Signature: public Collection<Edge> getNeighbors(Vertex vertex)
This method returns a collection of edges connected to the given vertex. It checks if the vertex is in the graph and then retrieves the linked list associated with that vertex.
size Method:

Method Signature: public int size()
This method returns the total number of vertices in the graph by querying the size of the adjacencyList.
Edge Class (Nested):

This is a private static nested class representing an edge in the graph.
It has instance variables for the connected vertex (vertex) and the weight of the edge (weight).
There are two constructors: one that takes both vertex and weight, and another that assumes a default weight of 0.
main Method (for Testing):

The main method creates an instance of the Graph class, adds vertices and edges, and prints information about the graph, including vertices, neighbors, and size.


---

# Vertex class
``` equals(Object o) method: ```

This method is used to compare two objects for equality.
In the context of the Vertex class, it is used to check whether two Vertex objects are equal based on their value attribute.
The equals method is commonly used in collections (e.g., HashSet, HashMap) to determine if an object is already present.

``` hashCode() method: ```

This method returns a hash code value for the object. Hash codes are used by hash-based data structures such as HashMap.
The implementation uses the Objects.hash method, which generates a hash code by combining the hash codes of the object's fields. In this case, it's based on the value attribute.

```toString()  method:``` 

This method returns a string representation of the object.
In the context of the Vertex class, it converts the value attribute to a String.
This is useful for debugging and logging, providing a human-readable representation of the object.
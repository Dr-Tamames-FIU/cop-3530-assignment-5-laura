package Graph;

import java.util.ArrayList;
import java.util.List;

public class ExtendedGraph extends AbstractGraph {
    public ExtendedGraph(List vertices, List edges) {
        super(vertices, edges);
    }
 
    /**
     * Return list of edges around vertex
     * @param v the vertex to get edges from
     */
    // ** TO DO **
    public List<Edge> incidentEdges(Vertex v) {
        // Returns the edges around vertex v
        List<Edge> incidentEdges = new ArrayList<>();

    for (Edge edge : edges) {
        // Check if the edge is incident to the given vertex
        if (edge.vertex1.equals(v)) {
            // If incident, add the edge to the list
            incidentEdges.add(edge);
        }
    }
         // Return the list of incident edges
         return incidentEdges;
    }
    
    public Vertex getVertex (int id) {
        //return the vertex with especific id
      for (Vertex vertex : vertices) {
        if (vertex.equals(new Vertex(String.valueOf(id)))) {
            return vertex;
        }
      }
    return null;
    }
    
     public List<Vertex> getVertices() {
        return this.vertices;
    }
}

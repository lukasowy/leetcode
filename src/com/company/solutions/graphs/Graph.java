package com.company.solutions.graphs;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Graph {

    private final boolean isWeighted;
    private final boolean isDirected;
    private final ArrayList<Vertex> vertices;

    public Graph(boolean isWeighted, boolean isDirected) {
        this.vertices = new ArrayList<>();
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public static void main(String[] args) {
        Graph busNetwork = new Graph(true, true);
        Vertex cliftonStation = busNetwork.addVertex("Clifton");
        Vertex capeMayStation = busNetwork.addVertex("Cape May Station");
        Vertex cracowStation = busNetwork.addVertex("Cracow Station");

        busNetwork.addEdge(cliftonStation, capeMayStation, 123);
        busNetwork.addEdge(cliftonStation, cracowStation, 2277);

        busNetwork.print();

    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }
        vertex1.addEdge(vertex2, weight);
        if (!this.isDirected) {
            vertex2.addEdge(vertex1, weight);
        }
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeEdge(vertex2);
        if (!this.isDirected) {
            vertex2.removeEdge(vertex1);
        }
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public Vertex getVertexByValue(String value) {
        for (Vertex v : this.vertices) {
            if (v.getData().equals(value)) {
                return v;
            }
        }
        return null;
    }

    public void print() {
        for (Vertex v : vertices) {
            v.print(isWeighted);
        }
    }

    public Vertex addVertex(String data) {
        Vertex vertex = new Vertex(data);
        this.vertices.add(vertex);
        return vertex;
    }
}

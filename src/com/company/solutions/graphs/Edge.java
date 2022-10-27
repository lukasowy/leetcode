package com.company.solutions.graphs;

import lombok.Getter;

@Getter
public class Edge {

    private final Vertex start;
    private final Vertex end;
    private final Integer weight;

    public Edge(Vertex start, Vertex end, Integer weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}

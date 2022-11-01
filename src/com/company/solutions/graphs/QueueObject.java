package com.company.solutions.graphs;

import lombok.Getter;

@Getter
public class QueueObject implements Comparable<QueueObject> {
    private Vertex vertex;
    private int priority;

    public QueueObject(Vertex v, int p) {
        this.vertex = v;
        this.priority = p;
    }

    @Override
    public int compareTo(QueueObject o) {
        return Integer.compare(this.priority, o.priority);
    }
}

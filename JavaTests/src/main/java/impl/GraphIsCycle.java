package impl;

/**
 * Given a directed graph consisting of N vertices, numbered from 1 to N, and N edges.
 * The graph is considered by two arrays, A and B, both of length N. A pair A[k],B[K] (for K from 0 to N-1) describes a directed edge from vertex A[K] to vertex B[K].
 * Note that the graph might contain self-loops(edge where A[K]=B[K]) and/or multiple edges between the same pair of vertices.
 *
 * Your task is to check the given graph is a cycle.
 * A graph is cycle if it is possible to start at some vertex and by following the provided edges, visit all the other vertices and return to the starting point.
 *
 * Examples
 *      in ([1, 2, 3, 4], [2, 1, 4, 3]) -> out (false)
 *      in ([3, 1, 2], [2, 3, 1]) -> out (true)
 */

import java.util.*;

public class GraphIsCycle {
    public boolean solution(int[] A, int[] B) {
        Set<Integer> tempSetA = new HashSet<>();
        for (int ia : A) {
            if (!tempSetA.add(ia)) {
                return false;
            }
        }

        Set<Integer> tempSetB = new HashSet<>();
        for (int ib : B) {
            if (!tempSetB.add(ib)) {
                return false;
            }
        }

        final Map<Integer, Integer> line = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                return false;
            }

            line.put(A[i], B[i]);
        }


        int nextPoint = A[0];
        for (int i = 0; i < A.length; i++) {
            nextPoint = line.get(nextPoint);

            if (nextPoint == A[0] && i < A.length - 1) {
                return false;
            }
        }


        return nextPoint == A[0];
    }


}

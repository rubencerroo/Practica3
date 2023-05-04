package tres;

import java.util.*;

public class Graph<V> {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<Integer>();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2);
    
        try {
            Set<Integer> adjacents = graph.obtainAdjacents(1);
            System.out.println(adjacents);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v) {
        if (adjacencyList.containsKey(v)) {
            return false;
        }
        adjacencyList.put(v, new HashSet<V>());
        return true;
    }

    public boolean addEdge(V v1, V v2) {
        if (!adjacencyList.containsKey(v1)) {
            adjacencyList.put(v1, new HashSet<V>());
        }
        if (!adjacencyList.containsKey(v2)) {
            adjacencyList.put(v2, new HashSet<V>());
        }
        return adjacencyList.get(v1).add(v2);
    }

    public Set<V> obtainAdjacents(V v) throws Exception {
        if (!adjacencyList.containsKey(v)) {
            throw new Exception("Vertex not found in graph");
        }
        return adjacencyList.get(v);
    }

    public boolean containsVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (V v : adjacencyList.keySet()) {
            sb.append(v.toString()).append(": ");
            for (V adj : adjacencyList.get(v)) {
                sb.append(adj.toString()).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public List<V> onePath(V v1, V v2) {
        Map<V, V> trace = new HashMap<>();
        Deque<V> open = new ArrayDeque<>();
        open.push(v1);
        trace.put(v1, null);
        boolean found = false;
        while (!open.isEmpty() && !found) {
            V v = open.pop();
            found = v.equals(v2);
            if (!found) {
                for (V s : adjacencyList.get(v)) {
                    if (!trace.containsKey(s)) {
                        open.push(s);
                        trace.put(s, v);
                    }
                }
            }
        }
        if (found) {
            List<V> path = new ArrayList<>();
            V v = v2;
            while (v != null) {
                path.add(v);
                v = trace.get(v);
            }
            Collections.reverse(path);
            return path;
        } else {
            return null;
        }
    }
}

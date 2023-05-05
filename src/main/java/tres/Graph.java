package tres;

import java.util.*;

/***********************
* Practica 3 -
* @author rubencerroo 
* @version 1.0
************************/
public class Graph<V> {
    /* Metod Main (Opcional) */
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

    // Lista de adyacencia.
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    /******************************************************************
     * Añade el vértice ‘v‘ al grafo.
     *
     * @param v vértice a añadir.
     * @return ‘true‘ si no estaba anteriormente y ‘false‘ en caso
     *         contrario.
     ******************************************************************/
    public boolean addVertex(V v) {
        if (adjacencyList.containsKey(v)) {
            return false;
        }
        adjacencyList.put(v, new HashSet<V>());
        return true;
    }

    /******************************************************************
     * Añade un arco entre los vértices ‘v1‘ y ‘v2‘ al grafo. En
     * caso de que no exista alguno de los vértices, lo añade
     * también.
     *
     * @param v1 el origen del arco.
     * @param v2 el destino del arco.
     * @return ‘true‘ si no existía el arco y ‘false‘ en caso
     *         contrario.
     ******************************************************************/

    public boolean addEdge(V v1, V v2) {
        if (!adjacencyList.containsKey(v1)) {
            adjacencyList.put(v1, new HashSet<V>());
        }
        if (!adjacencyList.containsKey(v2)) {
            adjacencyList.put(v2, new HashSet<V>());
        }
        return adjacencyList.get(v1).add(v2);
    }

    /******************************************************************
     * Obtiene el conjunto de vértices adyacentes a ‘v‘.
     *
     * @param v vértice del que se obtienen los adyacentes.
     * @return conjunto de vértices adyacentes.
     ******************************************************************/
    public Set<V> obtainAdjacents(V v) throws Exception {
        if (!adjacencyList.containsKey(v)) {
            throw new Exception("Vertex not found in graph");
        }
        return adjacencyList.get(v);
    }

    /******************************************************************
     * Comprueba si el grafo contiene el vértice dado.
     *
     * @param v vértice para el que se realiza la comprobación.
     * @return ‘true‘ si ‘v‘ es un vértice del grafo.
     ******************************************************************/
    public boolean containsVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    /******************************************************************
     * Método ‘toString()‘ reescrito para la clase ‘Grafo.java‘.
     * 
     * @return una cadena de caracteres con la lista de
     *         adyacencia.
     ******************************************************************/
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

    /*********************************************************
     * Obtiene, en caso de que exista, un camino entre ‘v1‘ y
     * ‘v2‘. En caso contrario, devuelve ‘null‘.
     *
     * @param v1 el vértice origen.
     * @param v2 el vértice destino.
     * @return lista con la secuencia de vértices desde ‘v1‘ hasta
     *         ‘v2‘ * pasando por arcos del grafo.
     *********************************************************/

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

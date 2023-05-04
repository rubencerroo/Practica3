Práctica 3: Implementación de Grafos
Este repositorio contiene la implementación de una clase para grafos no dirigidos en Java utilizando la estructura de datos Map. Además, se incluye una clase de prueba utilizando JUnit.

Contenido del repositorio
El repositorio contiene los siguientes archivos:

Graph.java: Implementación de la clase Graph.
GraphTest.java: Clase de prueba utilizando JUnit para la clase Graph.
README.md: Este archivo con información sobre el repositorio.
UML_Diagram.png: Diagrama UML de la implementación del Graph.

Uso del programa
La clase Graph proporciona los siguientes métodos para manipular grafos:

addVertex(V v): añade un vértice v al grafo.
addEdge(V v1, V v2): añade una arista entre los vértices v1 y v2.
obtainAdjacents(V v): devuelve un conjunto con los vértices adyacentes a v.
containsVertex(V v): devuelve verdadero si el grafo contiene el vértice v.
onePath(V v1, V v2): encuentra un camino entre los vértices v1 y v2 utilizando el algoritmo de búsqueda en anchura.
Para utilizar la clase Graph, simplemente hay que crear una instancia de la misma y llamar a los métodos apropiados.

Análisis de complejidad
A continuación, se muestra el análisis de complejidad de los métodos implementados en la clase Graph.

addVertex(V v): tiene una complejidad de O(1) en el peor caso.
addEdge(V v1, V v2): tiene una complejidad de O(1) en el peor caso.
obtainAdjacents(V v): tiene una complejidad de O(1) en el peor caso.
containsVertex(V v): tiene una complejidad de O(1) en el peor caso.
onePath(V v1, V v2): utiliza el algoritmo de búsqueda en anchura, el cual tiene una complejidad de O(|V| + |E|) en el peor caso, donde |V| es el número de vértices y |E| es el número de aristas del grafo.

Testing

Esta implementación ha sido probada usando JUnit. Para ejecutar las pruebas, simplemente ejecute el siguiente comando:

mvn test

Diagrama UML

![DiagramUML](https://user-images.githubusercontent.com/119308526/236158780-53826a98-5947-4570-b9b6-37b0fc54bca3.png)




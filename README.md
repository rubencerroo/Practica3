

# Práctica 3: Implementación de Grafos

![enter image description here](https://www.uspceu.com/Portals/_default/skins/uspceu-multi//assets/img/logos/logo-CEU.svg)

Este repositorio contiene la implementación de una clase para grafos no dirigidos en Java utilizando la estructura de datos Map. Además, se incluye una clase de prueba utilizando JUnit.

## ***Contenido del repositorio:***

 - **Graph.java**: Implementación de la clase Graph.
-  **GraphTest.java**: Clase de prueba utilizando JUnit para la clase Graph.
- **README.md**: Este archivo con información sobre el repositorio.
- **DiagramUML.png**: Diagrama UML de la implementación del Graph.

## ***Uso del programa:***

La clase Graph proporciona los siguientes métodos para manipular grafos:

- **addVertex(V v)**: añade un vértice v al grafo.
- **addEdge(V v1, V v2)**: añade una arista entre los vértices v1 y v2.
- **obtainAdjacents(V v)**: devuelve un conjunto con los vértices adyacentes a v.
- **containsVertex(V v)**: devuelve verdadero si el grafo contiene el vértice v.
- **onePath(V v1, V v2)**: encuentra un camino entre los vértices v1 y v2 utilizando el algoritmo de búsqueda en anchura.

Para utilizar la clase Graph, simplemente hay que crear una instancia de la misma y llamar a los métodos apropiados.

## *Testing*

Esta implementación ha sido probada usando JUnit. Para ejecutar las pruebas, simplemente ejecute el siguiente comando:

    mvn test

## *Diagrama UML*

![DiagramUML](https://user-images.githubusercontent.com/119308526/236158780-53826a98-5947-4570-b9b6-37b0fc54bca3.png)

<sub>
Copyright (c) <2023> rubencerroo.
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
</sub>

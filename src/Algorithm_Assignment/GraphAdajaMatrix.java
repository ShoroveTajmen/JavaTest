package Algorithm_Assignment;
public class GraphAdajaMatrix {

    int vertex;
    int matrix[][]; //2D array variable declare;

    public GraphAdajaMatrix(int vertex) {  // using constructor
        this.vertex = vertex;
        matrix = new int[vertex][vertex];  //dynamically allocate 2D array.
    }
    public void addEdge(int source, int destination) {  //method for adding edges
        matrix[source][destination]=1;
        matrix[destination][source] = 1;
    }
    public void printGraph() {                            //method for print a graph.
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {                 //using for loop for row.
            for (int j = 0; j <vertex ; j++) {             //using for loop for column.
                System.out.print(matrix[i][j]+ " ");       //print a graph.
            }
            System.out.println();
        }
        for (int i = 0; i < vertex; i++) {                           //using for row
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 0; j <vertex ; j++) {                      //using column
                if(matrix[i][j]==1){                                //using condition for check if row & column are equal '1'
                                                                     //it means they are connected
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphAdajaMatrix graph = new GraphAdajaMatrix(5);  //crating object of class GraphAdjaMtrix
        graph.addEdge(0, 1);                   //add edge between vertex.
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();                                    //call printGraph function for printing .
    }
}

//space complexity O(V+E)
//Time complexity O(N^2)
//In graph theory and computer science, an adjacency matrix is a square matrix used to
// represent a finite graph. The elements of the matrix indicate whether pairs of vertices are adjacent or not in the graph.

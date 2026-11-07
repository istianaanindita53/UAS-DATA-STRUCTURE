// Graph.java

public class Graph {
    int[][] adjacencyList;
    int[] neighborCount;

    public Graph(int vertexCount) {
        adjacencyList = new int[vertexCount][];
        neighborCount = new int[vertexCount];

        // Setiap vertex memiliki kapasitas awal 2 tetangga
        for (int i = 0; i < vertexCount; i++) {
            adjacencyList[i] = new int[2];
        }
    }

    // Menambahkankan satu tetangga ke vertex tujuan
    public void addNeighbor(int source, int neighbor) {
        // Apabila kapasitas neighbor nya telah penuh, perlu memperbesar jumlah array
        if (neighborCount[source] == adjacencyList[source].length) {
            int[] newArray = new int[adjacencyList[source].length * 2];
            
            for (int i = 0; i < neighborCount[source]; i++) {
                newArray[i] = adjacencyList[source][i];
            }

            adjacencyList[source] = newArray;
        }

        // Menambahkan hubungan neighbor ke vertex tujuan dan memperbaharui daftar tetangga baru
        adjacencyList[source][neighborCount[source]] = neighbor;
        neighborCount[source]++;
    }

    // Menambahkan jalan dua arah (undirected graph)
    public void addEdge(int a, int b) {
        addNeighbor(a, b);
        addNeighbor(b, a);
    }
}

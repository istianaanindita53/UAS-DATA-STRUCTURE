// Bfs.java

public class Bfs {
    Graph graph;

    int[] distance;
    int[] route;

    public Bfs(Graph graph) {
        this.graph = graph;
    }

    public int bfsCariTerdekat(int source, boolean[] isDriver) {
        int vertexCount = graph.adjacencyList.length;

        if (source < 0 || source >= vertexCount ||
                isDriver == null || isDriver.length != vertexCount) {
            throw new IllegalArgumentException("Input tidak valid");
        }

        boolean[] visited = new boolean[vertexCount];
        int[] queue = new int[vertexCount];

        distance = new int[vertexCount];
        route = new int[vertexCount];

        // Inisialisasi jarak dan route
        for (int i = 0; i < vertexCount; i++) {
            distance[i] = -1;
            route[i] = -1;
        }

        int front = 0;
        int rear = 0;

        // Memulai BFS dari lokasi penumpang
        queue[rear] = source;
        rear++;
        visited[source] = true;
        distance[source] = 0;

        // Penelusuran BFS menggunakan FIFO
        while (front < rear) {
            int current = queue[front];
            front++;

            // Jika driver ditemukan, pencarian dihentikan dan mengembalikan posisi driver
            // Penumpang A (posisi 0) mendapatkan driver terdekat G (posisi 6)
            // Penumpang E (posisi 0) mendapatkan driver terdekat I (posisi 8)
            if (isDriver[current]) {
                return current;
            }

            // Memeriksa seluruh tetangga current
            for (int i = 0; i < graph.neighborCount[current]; i++) {
                int neighbor = graph.adjacencyList[current][i];

                if (!visited[neighbor]) {
                    // Menandai vertex agar tidak dikunjungi ulang
                    visited[neighbor] = true;

                    // Menyimpan jarak dan vertex sebelumnya
                    distance[neighbor] = distance[current] + 1;
                    route[neighbor] = current;

                    // Memasukkan tetangga ke belakang queue
                    queue[rear] = neighbor;
                    rear++;
                }
            }
        }

        // Tidak ada driver yang dapat dijangkau
        return -1;
    }

    // Mengambil jumlah hop menuju driver yang ditemukan
    public int getDistance(int vertex) {
        return distance[vertex];
    }

    // Membuat rute terdekat dari penumpang menuju driver
    public String getRoute(int destination) {
        int[] ruteDriver = new int[route.length];
        int count = 0;
        int current = destination;

        // Menelusuri rute dari driver
        while (current != -1) {
            ruteDriver[count] = current;
            count++;
            current = route[current];
        }

        String route = "";

        // Rute penumpang ke Driver terdekat
        for (int i = count - 1; i >= 0; i--) {
            route += (char) ('A' + ruteDriver[i]);

            if (i > 0) {
                route = route + ", ";
            }
        }

        return route;
    }
}

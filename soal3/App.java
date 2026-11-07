// App.java

public class App {

    public static void main(String[] args) {
        // Membuat graph dengan 10 vertex (simpul)
        Graph graph = new Graph(10);

        // Menambahkan hubungan jalan antarvertex (persimpangan)
        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 2); // A-C
        graph.addEdge(1, 3); // B-D
        graph.addEdge(2, 4); // C-E
        graph.addEdge(2, 5); // C-F
        graph.addEdge(3, 6); // D-G
        graph.addEdge(5, 7); // F-H
        graph.addEdge(5, 8); // F-I
        graph.addEdge(7, 9); // H-J
        Bfs bfs = new Bfs(graph);

        // Lokasi driver
        boolean[] isDriver = new boolean[10];
        isDriver[6] = true; // Driver di G
        isDriver[8] = true; // Driver di I
        isDriver[9] = true; // Driver di J

        // Hasil pencarian driver oleh penumpang pertama
        int penumpang1 = 0; // Penumpang di A
        int driver1 = bfs.bfsCariTerdekat(penumpang1, isDriver);
        // Menampilkan lokasi graph angka driver menjadi huruf
        System.out.println("Penumpang: " + (char) ('A' + penumpang1));
        System.out.println("Driver Terdekat: " + (char) ('A' + driver1));
        System.out.println("Jarak: " + bfs.getDistance(driver1));
        System.out.println("Rute/Jalan Terdekat: " + bfs.getRoute(driver1));

        System.out.println();
        // Hasil pencarian driver oleh penumpang kedua
        int penumpang2 = 4; // Penumpang di E
        int driver2 = bfs.bfsCariTerdekat(penumpang2, isDriver);
        // Menampilkan lokasi graph angka driver menjadi huruf
        System.out.println("Penumpang: " + (char) ('A' + penumpang2));
        System.out.println("Driver Terdekat: " + (char) ('A' + driver2));
        System.out.println("Jarak: " + bfs.getDistance(driver2));
        System.out.println("Rute/Jalan Terdekat: " + bfs.getRoute(driver2));
    }
}

package PERTEMUAN12.QueueStatis;

public class MainQueue {
    public static void main(String[] args) {
        // Membuat instance dari Queue dengan ukuran default
        Queue queue = new Queue();

        // Menambah elemen ke dalam queue
        System.out.println("Enqueue A: " + queue.enqueue("A")); // Output: true
        System.out.println("Enqueue B: " + queue.enqueue("B")); // Output: true
        System.out.println("Enqueue C: " + queue.enqueue("C")); // Output: true

        // Menampilkan ukuran queue
        System.out.println("Ukuran queue: " + queue.size()); // Output: 3

        // Menghapus elemen dari queue
        System.out.println("Dequeue: " + queue.dequeue()); // Output: A
        System.out.println("Dequeue: " + queue.dequeue()); // Output: B

        // Menampilkan ukuran queue setelah dequeue
        System.out.println("Ukuran queue setelah dequeue: " + queue.size()); // Output: 1

        // Memeriksa apakah queue kosong
        System.out.println("Apakah queue kosong? " + queue.isEmpty()); // Output: false

        // Menghapus elemen terakhir dari queue
        System.out.println("Dequeue: " + queue.dequeue()); // Output: C

        // Memeriksa apakah queue kosong setelah semua elemen di-dequeue
        System.out.println("Apakah queue kosong setelah semua elemen di-dequeue? " + queue.isEmpty()); // Output: true
    }
}

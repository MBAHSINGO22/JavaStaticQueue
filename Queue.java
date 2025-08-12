package PERTEMUAN12.QueueStatis;

public class Queue {
    private Object[] elemen;
    private int front;
    private int rear;
    private int size;

    // Konstruktor untuk membuat queue dengan ukuran default 10
    public Queue() {
        this(10);
    }

    // Konstruktor untuk membuat queue dengan ukuran tertentu
    public Queue(int ukuran) {
        elemen = new Object[ukuran];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Metode untuk menambahkan item ke dalam queue
    public boolean enqueue(Object item) {
        // Jika queue penuh, kembalikan false
        if (size == elemen.length) {
            return false;
        }
        // Geser rear dan tambahkan item ke rear
        rear = (rear + 1) % elemen.length;
        elemen[rear] = item;
        size++;
        return true;
    }

    // Metode untuk menghapus dan mengembalikan item dari depan queue
    public Object dequeue() {
        // Jika queue kosong, kembalikan null
        if (isEmpty()) {
            return null;
        }
        // Ambil item dari front, hapus referensinya, dan geser front
        Object item = elemen[front];
        elemen[front] = null; // Menghindari memory leak
        front = (front + 1) % elemen.length;
        size--;
        return item;
    }

    // Metode untuk mengembalikan ukuran queue
    public int size() {
        return size;
    }

    // Metode untuk memeriksa apakah queue kosong
    public boolean isEmpty() {
        return size == 0;
    }
}

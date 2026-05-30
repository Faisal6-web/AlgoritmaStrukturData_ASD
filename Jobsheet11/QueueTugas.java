public class QueueTugas {
    node front;
    node rear;
    int size;
    int maxKapasitas;

    public QueueTugas(int max) {
        front = null;
        rear = null;
        size = 0;
        maxKapasitas = max;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == maxKapasitas;
    }

    public void clear() {
        front = null;
        rear = null;size = 0;
        System.out.println("Antrean telah dikosongkan");
    }

    public void enqueue(mahasiswaTugas mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh! " + mhs.nama + " tidak bisa masuk");
            return;
        }

        node newNode = new node(mhs, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke dalam antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong. tidak ada yang bisa dipanggil");
            return;
        }

        System.out.println("Memanggil antrian atas nama: ");
        front.data.tampilData();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFrontAndRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("--- Antrian Terdepan ---");
        front.data.tampilData();
        System.out.println("--- Antrian Paling Akhir ---");
        rear.data.tampilData();
    }

    public void printSize() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size + " orang");
    }
}

public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProsesKRS;
    final int MAX_DPA = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahProsesKRS = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty() ) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        }else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Maksimal " + max + " antrian pada satu waktu");
            return;
        }
        if (jumlahProsesKRS + size >= MAX_DPA) {
            System.out.println("Gagal mendaftar! Kuota DPA sebanyak 30 mahasiswa sudah penuh");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk ke antrian");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang bisa dipanggil");
            return;
        }

        System.out.println("=== Memanggil Mahasiswa untuk KRS ===");
        int maxPanggilan = 2;
        int sisaKuota = MAX_DPA - jumlahProsesKRS;
        int jumlahPanggilan = Math.min(maxPanggilan, Math.min(size, sisaKuota));

        for (int i = 0; i < jumlahPanggilan; i++) {
            Mahasiswa mhs = data[front];
            System.out.print("Panggilan " + (i + 1) + ": ");
            mhs.tampilkanData();

            front = (front + 1) % max;
            size--;
            jumlahProsesKRS++;
        }

        if (jumlahProsesKRS >= MAX_DPA) {
            System.out.println("\n[INFO] Kuota Maksimal DPA untuk 30 Mahasiswa telah tercapai!");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("=== Daftar Semua Antrian ===");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        }
        System.out.println("=== 2 Antrian Terdepan ===");
        int limit = Math.min(2, size);
        for (int i = 0; i < limit; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        }
        System.out.println("=== Antrian Paling Akhir ===");
        data[rear].tampilkanData();
    }

    public void infoStatistik() {
        System.out.println("=== Informasi Antrian & DPA ===");
        System.out.println("Jumlah mahasiswa di antrian saat ini   : " + size);
        System.out.println("Jumlah mahasiswa sudah proses KRS      :  " + jumlahProsesKRS);
        System.out.println("Jumlah mahasiswa belum proses KRS      : " + (MAX_DPA - jumlahProsesKRS));
    }
}

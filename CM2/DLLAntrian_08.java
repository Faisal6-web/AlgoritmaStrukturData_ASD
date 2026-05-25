public class DLLAntrian_08 {
    NodeAntrian_08 head, tail;
    int currentNoAntrian_08 = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli_08 p) {
        if (isEmpty()) {
            head = tail = new NodeAntrian_08(null, p, currentNoAntrian_08, null);
        }else {
            NodeAntrian_08 newNode = new NodeAntrian_08(tail, p, currentNoAntrian_08, null);
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambah dengan nomor: " + currentNoAntrian_08);
        currentNoAntrian_08++;
    }


    public NodeAntrian_08 panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrean Kosong!");
            return null;
        }
        NodeAntrian_08 dipanggil = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }else {
            tail = null;
        }
        return dipanggil;
    }


    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrean pembeli saat ini.");
            return;
        }
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-12s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        NodeAntrian_08 current = head;
        while (current != null) {
            System.out.printf("%-12d %-20s %-15s\n", current.noAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }
}

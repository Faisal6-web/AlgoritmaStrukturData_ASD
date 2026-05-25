public class DLLPesanan_08 {
    NodePesanan_08 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan_08 p) {
        if (isEmpty()) {
            head = tail = new NodePesanan_08(null, p, null);
        }else {
            NodePesanan_08 newNode = new NodePesanan_08(tail, p, null);
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void urutkanPesanan() {
        if (isEmpty() || head.next == null) return;

        boolean ditukar;
        do {
            ditukar = false;
            NodePesanan_08 current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan_08 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    ditukar = true;
                }
                current = current.next;
            }
        }while (ditukar);
    }


    public void cetakLaporan() {
        if (isEmpty()) {
            System.out.println("Beum ada data pesanan masuk");
            return;
        }

        urutkanPesanan();

        System.out.println("====================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN");
        System.out.println("====================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan_08 current = head;
        int totalPendapatan = 0;

        while (current != null) {
            System.out.printf("-%15d %-20s %-10d\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga );
            totalPendapatan += current.pesanan.harga;
            current = current.next;
        }
        System.out.println("-----------------------------------");
        System.out.println("TOTAL PENDAPATAN : Rp " + totalPendapatan);
    }
}

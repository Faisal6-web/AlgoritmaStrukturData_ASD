public class NodePesanan_08 {
    Pesanan_08 pesanan;
    NodePesanan_08 prev, next;

    public NodePesanan_08(NodePesanan_08 prev, Pesanan_08 pesanan, NodePesanan_08 next) {
        this.prev = prev;
        this.pesanan = pesanan;
        this.next = next;
    }
    
}

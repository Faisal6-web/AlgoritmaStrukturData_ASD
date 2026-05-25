public class NodeAntrian_08 {
    Pembeli_08 pembeli;
    int noAntrian;
    NodeAntrian_08 prev, next;

    public NodeAntrian_08 (NodeAntrian_08 prev, Pembeli_08 pembeli, int noAntrian, NodeAntrian_08 next) {
        this.prev = prev;
        this.pembeli = pembeli;
        this.noAntrian = noAntrian;
        this.next = next;
    }
}

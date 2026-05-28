public class SLLMain08 {
    public static void main(String[] args) {
        SingleLinkedList08 sll = new SingleLinkedList08();

        Mahasiswa8 mhs1 = new Mahasiswa8("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa8 mhs2 = new Mahasiswa8("23212201", "Bimon", "2B", 3.8);
        Mahasiswa8 mhs3 = new Mahasiswa8("22212202", "Cintia", "3C", 3.5);
        Mahasiswa8 mhs4 = new Mahasiswa8("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}

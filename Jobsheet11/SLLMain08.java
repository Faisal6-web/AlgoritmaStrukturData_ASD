import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkedList08 sll = new SingleLinkedList08();

        System.out.println("=== Tambah Data Mahasiswa ===");
        System.out.print("Masukkan NIM     : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama    : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas    : ");
        String kelas = sc.nextLine();
        System.out.println("Masukkan IPK    : ");
        double ipk = sc.nextDouble();

        Mahasiswa8 mhs = new Mahasiswa8(nim, nama, kelas, ipk);

        sll.addFirst(mhs);
        sll.print();

        sc.close();
    }
}

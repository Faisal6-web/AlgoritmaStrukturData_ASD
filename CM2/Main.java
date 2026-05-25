import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrian_08 antrianList = new DLLAntrian_08();
        DLLPesanan_08 pesananList = new DLLPesanan_08();

        antrianList.tambahAntrian(new Pembeli_08("Ainra", "08224500000"));
        antrianList.tambahAntrian(new Pembeli_08("Danra", "08224511111"));
        antrianList.tambahAntrian(new Pembeli_08("Sanri", "08224522222"));
        System.out.println("Data awal berhasil di-load!\n");

        int menu;
        do { 
            System.out.println("============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No Hp        : ");
                    String noHp = sc.nextLine();
                    Pembeli_08 pembeliBaru = new Pembeli_08(nama, noHp);
                    antrianList.tambahAntrian(pembeliBaru);
                    break;

                case 2:
                    antrianList.cetakAntrian();
                    break;

                case 3:
                    NodeAntrian_08 dipanggil = antrianList.panggilAntrian();
                    if (dipanggil != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPsn = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();

                        Pesanan_08 pesananBaru = new Pesanan_08(kode, namaPsn, harga);
                        pesananList.tambahPesanan(pesananBaru);

                        System.out.println(dipanggil.pembeli.namaPembeli + " telah memesan " + namaPsn);
                    }
                    break;

                case 4:
                    pesananList.cetakLaporan();
                    break;

                case 0:
                    System.out.println("Sistem ditutup");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
            System.out.println();
        } while (menu != 0);

        sc.close();
    }
}

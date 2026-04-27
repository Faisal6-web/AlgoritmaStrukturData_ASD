import java.util.Scanner;

public class CM1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa_08 [] daftarMhs = new Mahasiswa_08[3];
        Buku_08 [] daftarBuku = new Buku_08[4];
        Peminjaman_08 [] daftarPinjam = new Peminjaman_08[5];

        daftarMhs [0] = new Mahasiswa_08("2201","Andi","Teknik Informatika");
        daftarMhs [1] = new Mahasiswa_08("2202", "Budi", "Teknik Informatika");
        daftarMhs [2] = new Mahasiswa_08("2203", "Citra", "Sistem Informasi Bisnis");

        daftarBuku [0] = new Buku_08("B001", "Algoritma", 2020);
        daftarBuku [1] = new Buku_08("B002", "Basis Data", 2019);
        daftarBuku [2] = new Buku_08("B003", "Pemrograman", 2021);
        daftarBuku [3] = new Buku_08("B004", "Fisika", 2024);

        daftarPinjam [0] = new Peminjaman_08(daftarMhs[0], daftarBuku[0], 7);
        daftarPinjam [1] = new Peminjaman_08(daftarMhs[1], daftarBuku[1], 3);
        daftarPinjam [2] = new Peminjaman_08(daftarMhs[2], daftarBuku[2], 10);
        daftarPinjam [3] = new Peminjaman_08(daftarMhs[2], daftarBuku[3], 6);
        daftarPinjam [4] = new Peminjaman_08(daftarMhs[0], daftarBuku[1], 4);

        
        int menu;
        do { 
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu (1-5 & 0 untuk keluar)");
            menu = sc.nextInt();
            sc.nextLine();
            
            switch (menu) {
                case 1:
                    System.out.println("\n--- Daftar Mahasiswa ---");
                    for (int i = 0; i < daftarMhs.length; i++ ) {
                        daftarMhs[i].tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Daftar buku ---");
                    for (int i = 0; i < daftarBuku.length; i++ ) {
                        daftarBuku[i].tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("\n--- Daftar peminjaman ---");
                    for (int i = 0; i < daftarPinjam.length; i++ ) {
                        daftarPinjam[i].hitungDenda();
                        daftarPinjam[i].tampilPeminjaman();
                    }
                    break;

                case 4:
                    System.out.println("Setelah diurutkan (denda terbesar)");

                    for (int i = 0; i < daftarPinjam.length; i++) {
                        daftarPinjam[i].hitungDenda();
                    }

                    for (int i = 0; i < daftarPinjam.length - 1; i++) {
                        for (int j = 0; j < daftarPinjam.length - 1; i++ ) {
                            if (daftarPinjam[j].denda < daftarPinjam[j+1].denda) {
                                Peminjaman_08 temp = daftarPinjam[j];
                                daftarPinjam[j] = daftarPinjam[j+1];
                                daftarPinjam[j+1] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < daftarPinjam.length; i++) {
                        daftarPinjam[i].tampilPeminjaman();
                    }

                case 5:
                    System.out.println("Masukkan NIM: ");
                    String cariNim = sc.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < daftarPinjam.length; i++) {
                        if (daftarPinjam[i].mhs.nim.equalsIgnoreCase(cariNim)) {
                            daftarPinjam[i].hitungDenda();
                            daftarPinjam[i].tampilPeminjaman();
                            ditemukan = true;
                        }
                    }

                    if ( ditemukan == false){
                        System.out.println("NIM "+ cariNim + "tidak ditemukan");
                    }

                case 0:
                    System.out.println("Keluar");
                    break;
            
                default:
                    break;
                    
            }
        

        } while (menu!=0);

        
    }
}

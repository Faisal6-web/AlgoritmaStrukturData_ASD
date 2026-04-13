
import java.util.Scanner;

public class dosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        dataDosen09 list = new dataDosen09();
        int menu;

        do { 
            System.out.println("\n=== MENU MANAJEMEN DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Seluruh Dosen");
            System.out.println("3. Sorting ASC Usia (Bubble Sort)");
            System.out.println("4. Sorting DSC Usia (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();

                    System.out.println("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (L untuk Laki-laki, P untuk Perempuan): ");
                    String inputJK = sc.nextLine();
                    Boolean jk = inputJK.equalsIgnoreCase("L");
                   
                    System.out.println("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen09 dsnBaru = new Dosen09(kode, nama, jk, usia);
                    list.tambah(dsnBaru);
                    System.out.println("Berhasil! Data Dosen ditambahkan.");
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR DOSEN ---");
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("Sorting Berhasil! Data diurutkan dari yang Termuda.");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Sorting Berhasil! Data diurutkan dari yang Tertua.");
                    break;

                case 5:
                    System.out.println("Program selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (menu != 5);

        sc.close();
    }
}

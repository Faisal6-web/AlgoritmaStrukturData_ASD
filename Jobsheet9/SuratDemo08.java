import java.util.Scanner;

public class SuratDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Tentukan kapasitas maksimal tumpukan surat prodi: ");
    int kapasitas = sc.nextInt();
    StackSurat08 stackSurat = new StackSurat08(kapasitas);

    int menu;
    do {
        System.out.println("  SISTEM SURAT IZIN PRODI   ");
        System.out.println("==================================");
        System.out.println("1. Terima Surat Izin");
        System.out.println("2. Proses Surat Izin");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat (berdasarkan Nama)");
        System.out.println("5. Keluar Program");
        System.out.println("Pilih Menu (1-5): ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                System.out.println("\n--- Masukkan Data Surat ---");
                System.out.print("ID Surat: ");
                String id = sc.nextLine();
                System.out.print("Nama Mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("Jenis Izin (S: Sakit / I: Izin Lain): ");
                char jenis = sc.nextLine().charAt(0);
                System.out.print("Durasi: ");
                int durasi = sc.nextInt();
                sc.nextLine();

                Surat08 suratBaru = new Surat08(id, nama, kelas, jenis, durasi);
                stackSurat.push(suratBaru);
                break;
            
            case 2:
                System.out.println("\n--- Proses Surat Izin ---");
                Surat08 diProses = stackSurat.pop();
                if (diProses != null) {
                    System.out.println("Berhasil memvalidasi surat dari: " + diProses.namaMahasiswa);
                    System.out.println("Detail: ID " + diProses.idSurat);
                }
                break;

            case 3:
                System.out.println("\n--- Info Surat Teratas ---");
                Surat08 teratas = stackSurat.peek();
                if (teratas != null) {
                    System.out.println("Surat paling atas siap diproses adalah milik:");
                    System.out.println("Nama : " + teratas.namaMahasiswa);
                    System.out.println("Kelas: " + teratas.kelas);
                }
                break;

            case 4:
                System.out.println("\n--- Cari Surat Izin ---");
                System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                String cariNama = sc.nextLine();
                stackSurat.cariSurat(cariNama);
                break;

            case 5:
                System.out.println("Terima kasih. Sistem diakhiri.");
                break;
            default:
                System.out.println("Pilihan tidak valid! Silahkan pilih 1-5.");
        }
    } while (menu != 5);
    sc.close();
    }
}

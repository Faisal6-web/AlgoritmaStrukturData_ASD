import java.util.Scanner;
public class MainTugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimal antrian: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();

        QueueTugas antrian = new QueueTugas(kapasitas);
        int menu;

        do { 
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambahkan Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();

                    mahasiswaTugas mhsBaru = new mahasiswaTugas(nim, nama);
                    antrian.enqueue(mhsBaru);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.peekFrontAndRear();
                    break;

                case 4:
                    antrian.printSize();
                     break;

                case 5:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (menu != 0);

        sc.close();
    }    
}

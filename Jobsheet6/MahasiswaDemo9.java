import java.util.Scanner;

public class MahasiswaDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi9 list = new MahasiswaBerprestasi9();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- " + (i+1));
            System.out.print("Masukkan NIM: ");
            String NIM = sc.nextLine();
            System.out.print("Masukkan Nama: ");
            String Nama = sc.nextLine();
            System.out.print("Masukkan Kelas: ");
            String Kelas = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc. nextDouble();

            sc.nextLine();

            Mahasiswa09 m = new Mahasiswa09(NIM, Nama, Kelas, ipk);

            list.tambah(m);
        }

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.InsertionSort();
        list.tampil();
    }
}

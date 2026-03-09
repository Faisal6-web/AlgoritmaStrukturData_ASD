import java.util.Scanner;
public class MahasiswaDemo9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa9 [] arrayofMahasiswa9s = new Mahasiswa9[3];
        String dummy;

       for (int i=0; i < 3; i++) {
        arrayofMahasiswa9s[i] = new Mahasiswa9();

        System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
        System.out.print("NIM   : ");
        arrayofMahasiswa9s[i].nim = sc.nextLine();
        System.out.print("Nama  : ");
        arrayofMahasiswa9s[i].nama = sc.nextLine();
        System.out.print("Kelas : ");
        arrayofMahasiswa9s[i].kelas = sc.nextLine();
        System.out.print("IPK   : ");
        dummy = sc.nextLine();
        arrayofMahasiswa9s[i].ipk = Float.parseFloat(dummy);
        System.out.println("-------------------------------");
       }


       for (int i=0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke-"+ (i + 1));
        System.out.println("NIM     : "+ arrayofMahasiswa9s[i].nim);
        System.out.println("Nama    : "+arrayofMahasiswa9s[i].nama);
        System.out.println("Kelas   : "+ arrayofMahasiswa9s[i].kelas);
        System.out.println("IPK     : "+ arrayofMahasiswa9s[i].ipk);
        System.out.println("--------------------------------------");
       }

    }
}

import java.util.Scanner;

public class MataKuliahDemo9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    MataKuliah9 [] arrayOfMataKuliah9s = new MataKuliah9[3];
    String kode, nama, dummy;
    int sks, jumlahJam;

     for (int i =0; i < 3; i++) {
        System.out.println("Masukkan Data MataKuliah ke-"+ (i + 1));
        System.out.print("Kode            : ");
        kode = sc.nextLine();
        System.out.print("Nama            : ");
        nama = sc.nextLine();
        System.out.print("SKS             : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam      : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("-------------------------------");

        arrayOfMataKuliah9s[i] = new MataKuliah9(kode, nama, sks, jumlahJam);
    }
    
    for (int i =0; i < 3; i++) {
        System.out.println("Data MataKuliah ke-"+ (i + 1));
       System.out.println("Kode             : "+arrayOfMataKuliah9s[i].kode);
       System.out.println("Nama             : "+arrayOfMataKuliah9s[i].nama);
       System.out.println("SKS              : "+arrayOfMataKuliah9s[i].sks);
       System.out.println("Jumlah Jam       : "+ arrayOfMataKuliah9s[i].jumlahJam);
       System.out.println("-------------------------------------------------------");
    }
}    
}

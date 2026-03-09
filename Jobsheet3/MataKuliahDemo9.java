import java.util.Scanner;

public class MataKuliahDemo9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan Jumlah Matkul yang diinginkan: ");
    int jumlahMatkul = Integer.parseInt(sc.nextLine());

    MataKuliah9[] arrayofMataKuliah9s = new MataKuliah9[jumlahMatkul];

     for (int i =0; i < arrayofMataKuliah9s.length; i++) {
    System.out.println("Masukkan Data Matkul ke-"+ (i+1));

        arrayofMataKuliah9s[i] = new MataKuliah9 ("BD", "BASIS DATA", 4, 6);
        arrayofMataKuliah9s[i].tambahData("ALJABAR LINEAR");
        arrayofMataKuliah9s[i].cetakInfo();
    }
}    
}

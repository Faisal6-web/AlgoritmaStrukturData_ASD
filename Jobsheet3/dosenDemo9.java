import java.util.Scanner;
public class dosenDemo9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    dosen9 [] dataDosen9s = new dosen9[3];
    String kode, nama,jenisKelaminStr, dummy;
    boolean jenisKelamin;
    int usia;

   for (int i = 0; i < 3; i++) {
    System.out.println("Masukkan Data Dosen ke-"+ (i+1));

    System.out.print("Kode              : ");
    kode = sc.nextLine();

    System.out.print("Nama              : ");
    nama = sc.nextLine();

    System.out.print("Jenis Kelamin : ");
    jenisKelaminStr = sc.nextLine();
    if (jenisKelaminStr.equalsIgnoreCase ("Pria")) {
        jenisKelamin = true;
    }else {
        jenisKelamin = false;
    }
    

    System.out.print("Usia              : ");
    dummy = sc.nextLine();
    usia = Integer.parseInt(dummy);
            
    System.out.println("-----------------------------------");

    dataDosen9s[i] = new dosen9(kode, nama, jenisKelamin, usia);
   }

   System.out.println("\n==================================");
   System.out.println("             HASIL DATA DOSEN            ");
   System.out.println("====================================");

   int counter = 1;
        for (dosen9 dosen : dataDosen9s) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            
            
            String cetakKelamin;
            if (dosen.jenisKelamin == true) {
                cetakKelamin = "Pria";
            } else {
                cetakKelamin = "Wanita";
            }
            System.out.println("Jenis Kelamin : " + cetakKelamin);
            
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-----------------------------------");
            counter++;
        }

        System.out.println("\n\n=======================================");
        System.out.println("            PENGUJIAN CLASS DATA DOSEN          ");
        System.out.println("===========================================");
        
        DataDosen9 data = new DataDosen9 ();

        data.dataSemuaDosen(dataDosen9s);
        data.jumlahDosenPerJenisKelamin(dataDosen9s);
        data.rerataUsiaDosenPerJenisKelamin(dataDosen9s);
        data.infoDosenPalingTua(dataDosen9s);
        data.infoDosenPalingMuda(dataDosen9s);
        sc.close();
}
}

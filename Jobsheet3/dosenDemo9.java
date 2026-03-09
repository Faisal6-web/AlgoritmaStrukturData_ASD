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
        
        sc.close();
}
}

import java.util.Scanner;

public class MainNilaiMhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int n = input.nextInt();
        input.nextLine();

        NilaiMhs[] mhsArray = new NilaiMhs[n];

    for (int i = 0; i < n; i++){
        System.out.println("\nMasukkan data Mahasiswa ke-"+ (i+1));
        System.out.print("Nama          : ");
        String nama = input.nextLine();
        System.out.print("NIM           : ");
        String nim = input.nextLine();
        System.out.print("Tahun Masuk   : ");
        int tahunMasuk = input.nextInt();
        System.out.print("Nilai UTS     : ");
        int nilaiUTS = input.nextInt();
        System.out.print("Nilai UAS     : ");
        int nilaiUAS = input.nextInt();
        input.nextLine();

        mhsArray[i] = new NilaiMhs(nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);
    }
    NilaiMhs help = new NilaiMhs();

    System.out.println("============================    HASIL AKHIR     =============================");

    int tertinggi = help.nilaiMaxUTSDC(mhsArray, 0, n-1);
    System.out.println("Nilai UTS Tertinggi DC : "+ tertinggi);

    int terendah = help.nilaiMinUTSDC(mhsArray, 0, n-1);
    System.out.println("Nilai UTS Terendah DC : "+ terendah);

    double rata = help.nilaiRataUASBF(mhsArray);
    System.out.println("Rata-rata Nilai UAS BF : "+ rata);

    input.close();
    }
}

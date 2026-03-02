public class MataKuliahMain9 {
    public static void main(String[] args) {
        MataKuliah9 matKul1 = new MataKuliah9 ();
        matKul1.Nama = "Algoritma Struktur Data";
        matKul1.kodeMK = "ASD";
        matKul1.sks = 7;
        matKul1.jumlahJam = 4;

        matKul1.tampilkanInformasi();
        matKul1.ubahSks( 10);
        matKul1.tambahJam(2);
        matKul1.kurangiJam(2);

        MataKuliah9 matkul2 = new MataKuliah9 ("Basis Data", "BD",19, 8 );
        matkul2.ubahSks(15);
        matkul2.tampilkanInformasi();
    }
}

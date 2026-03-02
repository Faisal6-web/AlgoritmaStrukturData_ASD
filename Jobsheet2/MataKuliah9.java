public class MataKuliah9 {
    
    String kodeMK;
    String Nama;
    int sks;
    int jumlahJam;

    public MataKuliah9 () {
    }

    public MataKuliah9 (String Nama, String kodeMK, int sks, int jumlahJam){
        this.Nama = Nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        this.kodeMK = kodeMK;
    }
    void tampilkanInformasi () {
        System.out.println("Nama: " + Nama);
        System.out.println("KodeMatkul: " + kodeMK);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: "+ jumlahJam);
    }

    void ubahSks (int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam (int jamTambahan) {
        jumlahJam = jumlahJam + jamTambahan;
    }

    void  kurangiJam (int jam) {
        if (jumlahJam >= jam) {
            jumlahJam = jumlahJam - jam;
            System.out.println("Pengurangan jumlah jam berhasil. Sisa Jam: " + jumlahJam);
        }else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam awal tidak mencukupi");
        }
    }
}

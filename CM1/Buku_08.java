public class Buku_08 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku_08(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku(){
        System.out.println("Kode Buku               : "+ kodeBuku);
        System.out.println("Judul Buku              : "+ judul);
        System.out.println("Tahun Terbit Buku       : "+ tahunTerbit);
        System.out.println("-----------------------------------------");
    }
    
}

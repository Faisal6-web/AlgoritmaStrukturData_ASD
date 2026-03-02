public class Dosen9 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen9 () {
    }

    public Dosen9 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama=nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    void tampilkanInformasi () {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: "+ nama);
        System.out.println("Status Aktif Dosen: " + statusAktif);
        System.out.println("Tahun Bergabung Dosen: " + tahunBergabung);
        System.out.println("Bidang Keahlian Dosen: " + bidangKeahlian);
    }

    void setStatusAktif (boolean status) {
       statusAktif = status;
    }
    
    int hitungMasaKerja (int thnSkrng) {
        return  thnSkrng - tahunBergabung;
    }

    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
    }
}

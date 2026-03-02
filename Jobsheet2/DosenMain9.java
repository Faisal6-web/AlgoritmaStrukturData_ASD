public class DosenMain9 {
    public static void main(String[] args) {
        Dosen9 dosen1 = new Dosen9 () ;
        dosen1.nama = "Agung";
        dosen1.idDosen = "12345678";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2024;
        dosen1.bidangKeahlian = "UI/UX";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(true);
        System.out.println ("Masa Kerja Dosen:" + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("BasisData");

        Dosen9 dosen2 = new Dosen9("12345678", "Satrio", true, 2024, "Fisika") ;
        dosen2.ubahKeahlian("Bahasa Inggris");
        dosen2.tampilkanInformasi();
    }
}

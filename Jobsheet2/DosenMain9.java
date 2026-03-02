public class DosenMain9 {
    public static void main(String[] args) {
        Dosen9 Dosen1 = new Dosen9 () ;
        Dosen1.nama = "Agung";
        Dosen1.idDosen = "12345678";
        Dosen1.statusAktif = true;
        Dosen1.tahunBergabung = 2024;
        Dosen1.bidangKeahlian = "UI/UX";

        Dosen1.tampilkanInformasi();
        Dosen1.setStatusAktif(true);
        Dosen1.hitungMasaKerja(2025);
        Dosen1.ubahKeahlian("BasisData");

        Dosen9 Dosen2 = new Dosen9("12345678", "Satrio", true, 2024, "Fisika") ;
        Dosen2.ubahKeahlian("Bahasa Inggris");
        Dosen2.tampilkanInformasi();
    }
}

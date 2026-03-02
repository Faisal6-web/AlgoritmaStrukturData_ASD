public class MahasiswaMain9 {
    public static void main(String[] args) {
        Mahasiswa9 mhsl = new Mahasiswa9 ();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa9 mhs2 = new Mahasiswa9 ("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa9 mhs3 = new Mahasiswa9 ( "Faisal Rizky", "254107020224",3.20,  "TI 1H");
        mhs3.updateIpk(3.90);
        mhs3.tampilkanInformasi();
    }
}

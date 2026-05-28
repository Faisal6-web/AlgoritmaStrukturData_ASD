public class Mahasiswa8 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa8() {
    }

    public Mahasiswa8(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}

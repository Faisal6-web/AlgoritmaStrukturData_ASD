public class mahasiswaTugas {
    String nim;
    String nama;

    public mahasiswaTugas(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama);
    }
}

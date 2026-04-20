public class Mahasiswa_08 {

    String nim;
    String nama;
    String prodi;

    Mahasiswa_08(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM Mahasiswa        : " + nim);
        System.out.println("Nama Mahasiswa     : "+ nama);
        System.out.println("Prodi Mahasiswa     : " + prodi);
        System.out.println("----------------------------------");
    }


}
public class Peminjaman_08 {
    Mahasiswa_08 mhs;
    Buku_08 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman_08(Mahasiswa_08 mhs,Buku_08 buku,int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }


    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
        terlambat =  lamaPinjam - batasPinjam;
        denda = terlambat * 2000;
        System.out.println("Terkena Biaya denda = 2000/hari" + denda);
        }else {
            terlambat = 0;
            denda = 0;
            System.out.println("Tidak terkena denda");
        }
        
    }


    void tampilPeminjaman() {
        System.out.println("Nama Peminjam Buku              : "+mhs.nama);
        System.out.println("Judul Buku yang diPinjam        : "+ buku.judul);
        System.out.println("Lama Peminjaman Buku          : "+ lamaPinjam + " Hari");
        System.out.println("-------------------------------------------------------");
    }
}

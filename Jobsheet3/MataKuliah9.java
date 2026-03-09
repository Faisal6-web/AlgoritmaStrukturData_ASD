public class MataKuliah9 {
     public String kode;
     public String nama;
     public int sks;
     public int jumlahJam;

    public MataKuliah9 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

     void cetakInfo () {
        System.out.println("Kode            : "+ kode);
        System.out.println("Nama Matkul     : "+ nama);
        System.out.println("Sks             : "+ sks);
        System.out.println("Jumlah Jam      : "+jumlahJam);
     }
    

    void tambahData (String matkulTambahan) {
        nama = nama + matkulTambahan ;
    }


    }


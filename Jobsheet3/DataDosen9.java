public class DataDosen9 {
    public void dataSemuaDosen(dosen9[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        int counter = 1;

        for (dosen9 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-"+ counter);
            System.out.println("Kode            : "+ dosen.kode);
            System.out.println("Nama            : "+dosen.nama);

            String kelamin = dosen.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Jenis Kelamin   : "+kelamin);

            System.out.println("Usia            :"+ dosen.usia);
            System.out.println("---------------------------------");
            counter++;
        }
        
    }

    public void jumlahDosenPerJenisKelamin(dosen9[] arrayOfdosen) {
        int pria = 0, wanita = 0;

        for (dosen9 dosen : arrayOfdosen) {
            if (dosen.jenisKelamin == true) {
                pria++;
            }else {
                wanita++;
            }
        }

        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Dosen Pria      : "+ pria);
        System.out.println("Dosen Wanita    : "+ wanita);
    }


    public void rerataUsiaDosenPerJenisKelamin(dosen9[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (dosen9 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                totalUsiaPria += dosen.usia;
                jmlPria++;
            }else {
                totalUsiaWanita += dosen.usia;
                jmlWanita++;
            }
        }


        System.out.println("\n=== RERATA USIA DOSEN PER JENIS KELAMIN ===");
        
        if (jmlPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria   : "+ ((double) totalUsiaPria / jmlPria));
        }
        if (jmlWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : "+ ((double) totalUsiaWanita / jmlWanita));
        }
    }

    public void infoDosenPalingTua(dosen9[] arrayOfDosen) {
        dosen9 dosenTua = arrayOfDosen[0];

        for (dosen9 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }

        System.out.println("\n=== INFO DOSEN PALING TUA ===");
        System.out.println("Nama        : "+dosenTua.nama);
        System.out.println("Usia        : "+ dosenTua.usia);
    }

    public void infoDosenPalingMuda(dosen9[] arrayOfDosen) {
        dosen9 dosenMuda = arrayOfDosen[0];

        for (dosen9 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }


        System.out.println("\n=== INFO DOSEN PALING MUDA ===");
        System.out.println("Nama        : "+dosenMuda.nama);
        System.out.println("Usia        : "+ dosenMuda.usia);
    }
}

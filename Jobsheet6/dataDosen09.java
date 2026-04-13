public class dataDosen09 {
    Dosen09 [] dataDosen = new Dosen09[10];
    int idx = 0;

    void tambah (Dosen09 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }else {
            System.out.println("Maaf, Kapasitas data sudah penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx-1; i++) {
            for(int j = 1; j < idx-i; j++) {
                if (dataDosen[j-1].usia > dataDosen[j].usia) {
                    Dosen09 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen09 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen09 temp = dataDosen[i];
            int j = i;
            while ( j > 0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}

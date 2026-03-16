public class NilaiMhs {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

public NilaiMhs(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
    this.nama = nama;
    this.nim = nim;
    this.tahunMasuk = tahunMasuk;
    this.nilaiUTS = nilaiUTS;
    this.nilaiUAS = nilaiUAS;
}

public NilaiMhs() {

}

int nilaiMaxUTSDC (NilaiMhs[] mhs, int l, int r) {
    if (l == r) {
        return mhs[l].nilaiUTS;
    }
    int mid = (l + r) / 2;
    int lmax = nilaiMaxUTSDC(mhs, l, mid);
    int rmax = nilaiMaxUTSDC(mhs, mid +1, r);

    if (lmax > rmax) {
        return lmax;
    }else {
        return rmax;
    }
}

int nilaiMinUTSDC (NilaiMhs[] mhs, int l, int r) {
    if (l == r) {
        return mhs [l].nilaiUTS;
    }
    int mid = (l + r) / 2;
    int lmin = nilaiMinUTSDC(mhs, l, mid);
    int rmin = nilaiMinUTSDC(mhs, mid + 1, r);

    if (lmin < rmin) {
        return lmin;
    }else {
        return rmin;
    }
}

double nilaiRataUASBF (NilaiMhs[] mhs) {
    double total = 0;

    for (int i = 0; i < mhs.length; i++) {
        total = total + mhs[i].nilaiUAS;
    }
    return total / mhs.length;
}
}

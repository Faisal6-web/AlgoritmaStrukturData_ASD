public class StackSurat08 {
    
Surat08[] stack;
int top;
int size;

public StackSurat08(int size) {
    this.size = size;
    stack = new Surat08[size];
    top = -1;
}

public boolean isEmpty() {
    return top == -1;
}

public boolean isFull() {
    return top == size - 1;
}

public void push(Surat08 srt) {
    if (!isFull()) {
        top++;
        stack[top] = srt;
        System.out.println("Menerima surat izin dari: " + srt.namaMahasiswa);
    }else {
        System.out.println("Stack penuh! Tidak dapat menerima surat baru.");
    }
}

public Surat08 pop() {
    if (!isEmpty()) {
        Surat08 srt = stack[top];
        top--;
        return srt;
    }else {
        System.out.println("Stack kosong! Tidak ada surat untuk divalidasi.");
        return null;
    }
}

public Surat08 peek() {
    if (!isEmpty()) {
        return stack[top];
    }else {
        System.out.println("Stack Kosong! Tidak ada tumpukan surat.");
        return null;
    }
}

public void cariSurat(String nama) {
    boolean ditemukan = false;
    if (!isEmpty()) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("\n--- Surat Ditemukan ---");
                System.out.println("Berada di tumpukan ke-" + (top - i + 1) + " dari atas.");
                System.out.println("ID Surat    : " + stack[i].idSurat);
                System.out.println("Nama        : " + stack[i].namaMahasiswa);
                System.out.println("Kelas       : " + stack[i].kelas);
                String ketIzin = (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's') ? "Sakit" : "Izin Keperluan Lain";
                System.out.println("Keterangan  : " + ketIzin);
                System.out.println("Durasi      : " + stack[i].durasi);
                ditemukan = true;
                break;
            }
        }
    }

    if (!ditemukan) {
        System.out.println("Surat izin atas nama \"" + nama +  "\" tidak ditemukan di tumpukan");
    }
}


}

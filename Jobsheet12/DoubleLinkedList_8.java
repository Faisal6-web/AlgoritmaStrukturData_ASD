public class DoubleLinkedList_8 {
    Node_8 head;
    Node_8 tail;

    public DoubleLinkedList_8() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa_8 data) {
        Node_8 newNode = new Node_8(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode; 
        }
    }

    public void addLast(Mahasiswa_8 data)  {
         Node_8 newNode = new Node_8(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; 
        }
    }

    public void insertAfter(String keyNim, Mahasiswa_8 data) {
        Node_8 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }
        Node_8 newNode = new Node_8(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node_8 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong masih kosong, tidak dapat dihapus");
            return;
        }
        Mahasiswa_8 deleteData = head.data;

        if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data mahasiswa berikut berhasil dihapus dari awal list:");
        deleteData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong masih kosong, tidak dapat dihapus");
            return;
        }
        Mahasiswa_8 deleteData = tail.data;

        if (head == tail) {
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data mahasiswa berikut berhasil dihapus dari akhir list:");
        deleteData.tampil();
    }

    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong");
        return;
    }
    
    Node_8 current = tail;
    System.out.println("Cetak Data Terbalik (Tail ke Head):");
    while (current != null) {
        current.data.tampil();
        current = current.prev;
    }
}
}

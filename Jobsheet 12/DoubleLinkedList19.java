public class DoubleLinkedList19 {
    Node19 head;
    Node19 tail;
    int size = 0; 

    public DoubleLinkedList19() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa19 data) {
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa19 data) {
        Node19 newNode = new Node19(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa19 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node19 newNode = new Node19(data);
            Node19 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa19 data) {
        Node19 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node19 newNode = new Node19(data);
        if(current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    public void removeAfter(String keyNim) {
        Node19 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan atau tidak ada.");
            return;
        }
        Node19 toDelete = current.next;
        if (toDelete == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
        System.out.print("Data setelah NIM " + keyNim + " sudah dihapus. Data yang dihapus: ");
        toDelete.data.tampil();
        size--;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau list kosong!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node19 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.print("Data pada indeks " + index + " sudah dihapus. Data yang dihapus: ");
            current.data.tampil();
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Warning!: List masih kosong");
            return;
        }
        Node19 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    } 

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang dihapus.");
        } else {
            Node19 temp = head;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
            temp.data.tampil();
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
            tail.data.tampil();
            head = tail = null;
        } else {
            System.out.print("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
            tail.data.tampil();
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public Node19 search(String nim) {
        Node19 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.print("Data pada head: ");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.print("Data pada tail: ");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau list kosong!");
            return;
        }
        Node19 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.print("Data pada indeks " + index + ": ");
        current.data.tampil();
    }

    public int getSize() {
        return size;
    }
}

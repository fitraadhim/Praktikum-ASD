public class QueueLinkList {
    NodeQueue19 front, rear;
    int size = 0;
    int max = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(MhsQueue19 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeQueue19 newNode = new NodeQueue19(mhs, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    public MhsQueue19 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        MhsQueue19 mhs = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        System.out.println("Mahasiswa keluar dari antrian.");
        return mhs;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        NodeQueue19 temp = front;
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
    }

    public void printFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilInformasi();
        }
    }

    public void printRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Mahasiswa paling akhir: ");
            rear.data.tampilInformasi();
        }
    }

    public int getSize() {
        return size;
    }
}

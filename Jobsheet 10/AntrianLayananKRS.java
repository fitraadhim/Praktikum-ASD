public class AntrianLayananKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProses;
    
    public AntrianLayananKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil ditambahkan ke antrian");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\nMemproses 2 mahasiswa:");
        for (int i = 0; i < 2 && !isEmpty(); i++) {
            Mahasiswa mhs = data[front];
            mhs.sudahProses = true;
            System.out.println("\nMahasiswa ke-" + (i+1) + ":");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahProses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\nDaftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Depan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\n2 Antrian Terdepan:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < 2 && i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\nAntrian Terakhir:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }

    public void getJumlahAntrian() {
        System.out.println("\nJumlah dalam antrian: " + size);
        System.out.println("Jumlah sudah diproses: " + jumlahProses);
        System.out.println("Jumlah belum diproses: " + (size));
    }
}
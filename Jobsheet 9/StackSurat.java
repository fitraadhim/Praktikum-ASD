public class StackSurat {
    private Surat19[] data;
    private int size;
    private int top;

    public StackSurat(int size) {
        this.size = size;
        data = new Surat19[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat19 srt) {
        if (!isFull()) {
            top++;
            data[top] = srt;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat19 pop() {
        if (!isEmpty()) {
            Surat19 temp = data[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat19 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println("ID Surat19: " + data[i].idSurat);
                System.out.println("Nama: " + data[i].namaMahasiswa);
                System.out.println("Kelas: " + data[i].kelas);
                System.out.println("Jenis Izin: " + data[i].jenisIzin);
                System.out.println("Durasi: " + data[i].durasi);
                System.out.println("-------------------------");
            }
        } else {
            System.out.println("Stack kosong!");
        }
    }

    public Surat19 cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return data[i];
            }
        }
        return null;
    }
}
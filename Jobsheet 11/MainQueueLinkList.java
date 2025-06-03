import java.util.Scanner;

public class MainQueueLinkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkList queue = new QueueLinkList();
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Lihat Mahasiswa Terdepan");
            System.out.println("6. Lihat Mahasiswa Paling Akhir");
            System.out.println("7. Lihat Jumlah Mahasiswa dalam Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    MhsQueue19 mhs = new MhsQueue19(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.clear();
                    break;
                case 5:
                    queue.printFront();
                    break;
                case 6:
                    queue.printRear();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.getSize());
                    break;
                case 8:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}

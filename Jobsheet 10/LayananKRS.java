import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayananKRS antrian = new AntrianLayananKRS(5);
        int pilihan;
        
        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi  : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas  : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                    
                case 2:
                    antrian.prosesKRS();
                    break;
                    
                case 3:
                    antrian.tampilkanSemua();
                    break;
                    
                case 4:
                    antrian.tampilkan2Depan();
                    break;
                    
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                    
                case 6:
                    antrian.getJumlahAntrian();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}
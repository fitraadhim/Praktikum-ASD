import java.util.Scanner;

public class MainSurat19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);
        int pilih;

        do {
            System.out.println("\nMenu Aplikasi Surat Izin");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat19: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    
                    Surat19 srtBaru = new Surat19(id, nama, kelas, jenisIzin, durasi);
                    stack.push(srtBaru);
                    break;

                case 2:
                    Surat19 srtProses = stack.pop();
                    if (srtProses != null) {
                        System.out.println("Memproses surat dari: " + srtProses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat19 srtAtas = stack.peek();
                    if (srtAtas != null) {
                        System.out.println("Surat19 terakhir dari: " + srtAtas.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    Surat19 hasilCari = stack.cariSurat(cariNama);
                    if (hasilCari != null) {
                        System.out.println("Surat ditemukan:");
                        System.out.println("ID: " + hasilCari.idSurat);
                        System.out.println("Nama: " + hasilCari.namaMahasiswa);
                        System.out.println("Kelas: " + hasilCari.kelas);
                        System.out.println("Jenis Izin: " + hasilCari.jenisIzin);
                        System.out.println("Durasi: " + hasilCari.durasi);
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}
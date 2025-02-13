import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double sisi;
        do {
            System.out.println("PROGRAM HITUNG KUBUS");
            System.out.println("====================");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1-4): ");
            pilihan = sc.nextInt();

            if (pilihan !=4) {
                System.out.print("Masukkan  Panjang sisi Kubus: ");
                sisi = sc.nextDouble();

                switch (pilihan) {
                    case 1:
                        volume(sisi);
                        break;
                    case 2:
                        luasPermukaan(sisi);
                        break;
                    case 3:
                        keliling(sisi);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                }
            }
        } while (pilihan != 4);
            System.out.println("Program Selesai");
    }
    public static void volume(double sisi) {
        double volume = sisi * sisi * sisi;
        System.out.println("\nHASIL PERHITUNGAN VOLUME KUBUS");
        System.out.println("==============================");
        System.out.printf("Panjang sisi: %.2f%n", sisi);
        System.out.printf("Volume kubus: %.2f%n", volume);
    }
    public static void luasPermukaan(double sisi) {
        double luasP = 6 * sisi * sisi;
        System.out.println("\nHASIL PERHITUNGAN LUAS PERMUKAAN KUBUS");
        System.out.println("=====================================");
        System.out.printf("Panjang sisi: %.2f%n", sisi);
        System.out.printf("Luas permukaan kubus: %.2f%n", luasP);
    }
    public static void keliling(double sisi) {
        double k = 12 * sisi;
        System.out.println("\nHASIL PERHITUNGAN KELILING KUBUS");
        System.out.println("===============================");
        System.out.printf("Panjang sisi: %.2f%n", sisi);
        System.out.printf("Keliling kubus: %.2f%n", k);
    }
}

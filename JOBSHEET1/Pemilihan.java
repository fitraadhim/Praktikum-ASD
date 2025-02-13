import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, kuis, uts, uas, total;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextFloat();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextFloat();
        System.out.print("Masukkkan Nilai uas: ");
        uas = sc.nextFloat();
        System.out.println("==============================");

        if (nilaiTugas <= 0 || nilaiTugas >= 100 || kuis <= 0 || kuis >= 100 || uts <= 0 || uts >= 100 || uas <= 0 || uas >= 100) {
            System.out.println("Nilai tidak Valid");
            return;
        }
            total = (nilaiTugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            System.out.println("==============================");
            System.out.println("Nilai Akhir: " + total);
            
        if (total >= 80) {
            System.out.println("Nilai Huruf: A");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (total >= 73) {
            System.out.println("Nilai Huruf: B+" );
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (total >= 65) {
            System.out.println("Nilai Huruf: B");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (total >= 60) {
            System.out.println("Nilai Huruf: C+");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (total >= 50) {
            System.out.println("Nilai Huruf: C");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        } else if (total >= 39) {
            System.out.println("Nilai Huruf : D");
            System.out.println("==============================");
            System.out.println("MAAF ANDA TIDAK LULUS");
        } else 
            System.out.println("Nilai Huruf: E");
            System.out.println("==============================");
            System.out.println("MAAF ANDA TIDAK LULUS");
        

    }
}

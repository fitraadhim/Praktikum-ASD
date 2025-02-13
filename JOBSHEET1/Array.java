import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        double[] nilaiAngka = new double[7];
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester\n");
        System.out.println("==============================");
        for(int i = 0; i < namaMK.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }
        double[] bobotNilai = new double[7];
        String[] nilaiHuruf = new String[7];
        System.out.println("==============================");
        System.out.println("\nhasil Konversi Nilai");
        System.out.println("==============================");                 
        System.out.println("\nMK                                     Nilai Angka    Nilai Huruf    Bobot Nilai");
        double totalBobotKali = 0;
        double totalSKS = 0;
        
        for(int i = 0; i < namaMK.length; i++) {
            if(nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if(nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if(nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if(nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if(nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if(nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
            System.out.printf("%-40s %-14.2f %-14s %.2f%n", 
                namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            
            totalBobotKali += bobotNilai[i];
            totalSKS += 1;
        }
        
        double ip = totalBobotKali / totalSKS;
        System.out.println("==============================");
        System.out.printf("IP : %.2f%n", ip);
        System.out.println("==============================");
    }
}

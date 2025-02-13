import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMtkl = new String[n];
        int[] sks = new int[n];
        int[] smt = new int[n];
        String[] hari = new String[n];

        System.out.println("Input data mata kuliah");
        for(int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah ke-" + (i+1));
            System.out.print("Nama Mata Kuliah: ");
            namaMtkl[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            smt[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari: ");
            hari[i] = sc.nextLine();
    }
    int pilihan;
    do {
            System.out.println("MENU PROGRAM JADWAL KULIAH");
            System.out.println("==========================");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

        pilihan = sc.nextInt();
        sc.nextLine();

            switch (pilihan) {
                case 1:
                    semuaJadwal(namaMtkl, sks, smt, hari);
                    break;
                case 2: 
                    System.out.print("Masukkan hari: ");
                    String hariApa = sc.nextLine();
                    jadwalHari(namaMtkl, sks, smt, hari, hariApa);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semesterBrp = sc.nextInt();
                    jadwalSmt(namaMtkl, sks, smt, hari, semesterBrp);
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String MtKlApa = sc.nextLine();
                    MatKul(namaMtkl, sks, smt, hari, MtKlApa);
                    break;
                case 5:
                    System.out.println("Program Selesai");
                    break;
                default:
                System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (pilihan != 5);
    }
    public static void semuaJadwal(String[] namaMtKl, int[] sks, int[] smt, String[] hari) {
        System.out.println("JADWAL KULIAH KESELURUHAN");
        System.out.println("=========================");
        tampilkanHeader();
        for(int i = 0; i < namaMtKl.length; i++) {
            tampilkanBaris(namaMtKl[i], sks[i], smt[i], hari[i]);
        }
    }
    public static void jadwalHari(String[] namaMtKl, int[] sks, int[] smt, String[] hari, String hariCari) {
        System.out.println("JADWAL KULIAH HARI " + hariCari.toUpperCase());
        System.out.println("=========================");
        tampilkanHeader();
        for(int i = 0; i < namaMtKl.length; i++) {
            if(hari[i].equalsIgnoreCase(hariCari)) {
                tampilkanBaris(namaMtKl[i], sks[i], smt[i], hari[i]);
            }
        }
    }
    public static void jadwalSmt(String[] namaMtKl, int[] sks, int[] smt, String[] hari, int semesterBrp) {
        System.out.println("JADWAL KULIAH SEMESTER " + semesterBrp);
        System.out.println("=========================");
        tampilkanHeader();
        for(int i = 0; i < namaMtKl.length; i++) {
            if(smt[i] == semesterBrp) {
                tampilkanBaris(namaMtKl[i], sks[i], smt[i], hari[i]);
            }
        }
    }
    public static void  MatKul(String[] namaMtKl, int[] sks, int[] smt, String[] hari, String MtKlApa) {
        boolean ditemukan = false;
        System.out.println("HASIL PENCARIAN MATA KULIAH");
        System.out.println("=========================");
        tampilkanHeader();
        for(int i = 0; i < namaMtKl.length; i++) {
            if(namaMtKl[i].toLowerCase().contains(MtKlApa.toLowerCase())) {
                tampilkanBaris(namaMtKl[i], sks[i], smt[i], hari[i]);
                ditemukan = true;
            }
        }
        if(!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan!");
        }
    }
    public static void tampilkanHeader() {
        System.out.printf("%-40s %-6s %-10s %-15s%n", 
            "Nama Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("---------------------------------------------------------------");
    }
    public static void tampilkanBaris(String nama, int sks, int sem, String hari) {
        System.out.printf("%-40s %-6d %-10d %-15s%n", 
            nama, sks, sem, hari);
    }
}
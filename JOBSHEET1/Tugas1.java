import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] plat = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
        while (true) {
            System.out.print("Masukkan Kode Plat Nomer(0 untuk keluar): ");
            char kode = sc.next().toUpperCase().charAt(0);
                if (kode == '0') {
                    break;
                }
            int j = -1;
            for(int i = 0; i < plat.length;i++) {
                if (plat[i] == kode) {
                    j = i;
                    break;
                }
            }
            if (j != -1) {
                System.out.print("Nama Kota: ");
                for(int i = 0; i < kota[j].length;i++) {
                    if (kota[j][i] != ' ') {
                        System.out.print(kota[j][i]);
                    }
                }
                System.out.println();
            } else {
                System.out.println("Kode plat nomer tidak ditemukan");
            }
        }
        System.out.println("Program Selesai");
    }
}

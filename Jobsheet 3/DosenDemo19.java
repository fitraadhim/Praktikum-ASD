import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen : ");
        int jmlhDosen = sc.nextInt();
        sc.nextLine();

        Dosen19[] arrayOfDosen = new Dosen19[jmlhDosen];

        for (int i = 0; i < jmlhDosen; i++) {
            System.out.println("Tambah Data Dosen ke-" + (i + 1));
            arrayOfDosen[i] = new Dosen19("", "", false, 0);
            arrayOfDosen[i].tambahData(sc);
        }
        for (Dosen19 dosen19 : arrayOfDosen) {
            System.out.println("Data Dosen");
            dosen19.tampilan();
        }
        DataDosen19 dataDosen19 = new DataDosen19();
        dataDosen19.dataSemuaDosen(arrayOfDosen);
        dataDosen19.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen19.rataRataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen19.dosenPalingTua(arrayOfDosen);
        dataDosen19.dosenPalingMuda(arrayOfDosen);
    }
}
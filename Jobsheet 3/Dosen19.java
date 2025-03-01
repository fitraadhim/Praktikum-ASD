import java.util.Scanner;
public class Dosen19 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen19(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void tampilan() {
        System.out.println("Kode          : " + this.kode);
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + (this.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + this.usia);
        System.out.println("--------------------------------");
    }
    public void tambahData(Scanner sc) {
        System.out.print("Kode : ");
        this.kode = sc.nextLine();
        System.out.print("Nama : ");
        this.nama = sc.nextLine();
        System.out.print("Jenis Kelamin (Pria/Wanita): ");
        String jenisKelaminStr = sc.nextLine();
        this.jenisKelamin = jenisKelaminStr.equalsIgnoreCase("Pria");
        System.out.print("Usia : ");
        this.usia = sc.nextInt();
        sc.nextLine();
    }
}

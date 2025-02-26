package Jobsheet2;

public class Dosen19 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID DOSEN : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        System.out.println("Status Aktif : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    int hitungMasaKerja(int thnSkr) {
        if (thnSkr >= tahunBergabung) {
            thnSkr = thnSkr - tahunBergabung;
            System.out.println("Masa Kerja : " + thnSkr + " Tahun");
        } else {
            System.out.println("tahun tidak valid");
        } 
        return thnSkr;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen19() {

    }
    public Dosen19(String idDosen, String nama, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}

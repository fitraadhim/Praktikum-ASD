package Jobsheet2;

public class DosenMain19 {
    public static void main(String[] args) {
        Dosen19 dsn1 = new Dosen19();
        dsn1.idDosen = "D01";
        dsn1.nama = "Yohanes Nira";
        dsn1.tahunBergabung = 1980;
        dsn1.bidangKeahlian = "Agama";
        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(false);

        dsn1.ubahKeahlian("Biologi");
        dsn1.tampilkanInformasi();

        Dosen19 dsn2 = new Dosen19("D02", "Saputra Anwar", 1945, "Teknik Elektro");
        dsn2.hitungMasaKerja(2025);
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(false);
    }
}

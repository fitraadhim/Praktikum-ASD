package Jobsheet2;

public class MataKuliahMain19 {
    public static void main(String[] args) {
        MataKuliah19 mk1 = new MataKuliah19(null, null, 0, 0);
        mk1.kodeMK = "MK001";
        mk1.nama = "Algoritma Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(8);
        mk1.kurangiJam(0);

        MataKuliah19 mk2 = new MataKuliah19("Mk002", "Agama", 2, 2);
        mk2.tampilInformasi();
    }
}

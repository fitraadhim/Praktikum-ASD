package Jobsheet2;

public class MataKuliah19 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah " + jumlahJam + "jam");

    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan menjadi " + jumlahJam + " jam");
    }
    
    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah Jam telah berhasil dikurangi " + jumlahJam + "Jam");
        } else {
            System.out.println("maaf jam tidak dapat dikurangi");
        }
    }

    public MataKuliah19(String mk, String nm, int sks, int jamm) {
        kodeMK = mk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jamm;
    }
}

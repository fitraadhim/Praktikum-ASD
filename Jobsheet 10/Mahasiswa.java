public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;
    boolean sudahProses;
    
    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        this.sudahProses = false;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
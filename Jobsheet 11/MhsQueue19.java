public class MhsQueue19 {
    String nim, nama, kelas;
    double ipk;

    public MhsQueue19(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + " - " + nim + " - " + kelas + " - " + ipk);
    }
}


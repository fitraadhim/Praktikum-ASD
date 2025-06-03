public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    Mahasiswa19()  {

    }
    public Mahasiswa19(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    public void tampilInformasi() {
        System.out.println(nama + " - " + nim + " - " + kelas + " - " + ipk);
    }
}

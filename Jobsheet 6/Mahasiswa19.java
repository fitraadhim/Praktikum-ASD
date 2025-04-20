public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    //konstruktor default
    Mahasiswa19(){

    }
    //konstruktor berparameter (dibuat ada yang nama vaar parameter inputnya sama ada yang tidak)
    Mahasiswa19(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    void tampilInformasi() {
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas);
        System.out.println("IPK: "+ ipk);
    }
}

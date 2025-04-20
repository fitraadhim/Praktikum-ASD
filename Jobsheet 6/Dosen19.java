public class Dosen19 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int umur;

    Dosen19() {

    }

    Dosen19(String k, String nm, boolean jnsklmn, int u) {
        kode = k;
        nama = nm;
        jenisKelamin = jnsklmn;
        umur = u;
    }

    void tampil(){
        System.out.println("kode dosen: " +kode);
        System.out.println("nama dosen: " +nama);
        if(jenisKelamin==true){
            System.out.println("jenis kelamin dosen: Perempuan");
        }else{
            System.out.println("jenis kelamin dosen: Laki-laki");
        }
        System.out.println("umur dosen: " + umur);

    }
}

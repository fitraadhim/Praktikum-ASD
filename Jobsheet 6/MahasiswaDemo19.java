public class MahasiswaDemo19 {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Mahasiswa19 m1 = new Mahasiswa19("123","Zidan","2A",3.2);
        Mahasiswa19 m2 = new Mahasiswa19("124","Ayu","2A",3.5);
        Mahasiswa19 m3 = new Mahasiswa19("125","Sofi","2A",3.1);
        Mahasiswa19 m4 = new Mahasiswa19("126","Sita","2A",3.9);
        Mahasiswa19 m5 = new Mahasiswa19("127","Miki","2A",3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        //System.out.println("Data mahasiswa sebelum sorting: ");
        //list.tampil();

        list.input();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC : )");
        list.bubbleSort();
        list.tampil();

        System.out.println("data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
    }
}
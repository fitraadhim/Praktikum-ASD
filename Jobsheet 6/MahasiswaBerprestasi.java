import java.util.Scanner;

public class MahasiswaBerprestasi {
    Scanner sc = new Scanner(System.in);
    Mahasiswa19 [] listMhs= new Mahasiswa19 [5];
    int idx;

    void tambah(Mahasiswa19 m) {
        if (idx<listMhs.length) {
        listMhs[idx]=m;
            idx++;
        } else {
                System.out.println("data sudah penuh");
        }
    }
    void input(){
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            listMhs[i] = new Mahasiswa19();
            System.out.print("NIM: ");
            listMhs[i].nim = sc.next();
            System.out.print("Nama: ");
            listMhs[i].nama = sc.next();
            System.out.print("kelas: ");
            listMhs[i].kelas = sc.next();
            System.out.print("IPK: ");
            listMhs[i].ipk = sc.nextDouble();
        }
    }
    void tampil(){
        for (Mahasiswa19 m:listMhs){
            m.tampilInformasi();
            System.out.println("------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa19 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i=0; i<listMhs.length-1; i++){
            int idxMin=i;
            for (int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin=j;
                }
            }
            Mahasiswa19 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionSort(){
        for(int i=1; i<listMhs.length;i++){
            Mahasiswa19 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk){
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
}

public class DataDosen19 {
    Dosen19 [] DataDosen19 = new Dosen19[10];
    int idx;

    void tambah(Dosen19 dsn){  
        if (idx < DataDosen19.length) {
            DataDosen19[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    
    void tampil() {
        for (int i = 0; i < idx; i++) {
            DataDosen19[i].tampil();
        }
    }

    void SortingASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (DataDosen19[j].umur > DataDosen19[j + 1].umur) {
                    Dosen19 temp = DataDosen19[j];
                    DataDosen19[j] = DataDosen19[j + 1];
                    DataDosen19[j + 1] = temp;
                }
            }
        }
    }
    void SortingDSC() { 
        for (int i = 1; i < idx; i++) {
            Dosen19 temp = DataDosen19[i];
            int j = i;
            while (j > 0 && DataDosen19[j - 1].umur < temp.umur) {
                DataDosen19[j] = DataDosen19[j - 1];
                j--;
            }
            DataDosen19[j] = temp;
        }
    }
}
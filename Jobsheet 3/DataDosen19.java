public class DataDosen19 {
    public void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println("\n DATA SEMUA DOSEN ");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].tampilan();
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("\n JUMLAH DOSEN PER JENIS KELAMIN ");
        System.out.println("Jumlah dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah dosen Wanita : " + jumlahWanita);
    }
    public void rataRataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        double rataDosenPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rataDosenWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;
        System.out.println("\n RATA-RATA USIA DOSEN PER JENIS KELAMIN ");
        System.out.println("Rata-rata usia dosen Pria   : " + rataDosenPria);
        System.out.println("Rata-rata usia dosen Wanita : " + rataDosenWanita);
    }
    public void dosenPalingTua(Dosen19[] arrayOfDosen) {
        Dosen19 dosenTertua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTertua.usia) {
                dosenTertua = arrayOfDosen[i];
            }
        }
        System.out.println("\n DOSEN PALING TUA ");
        dosenTertua.tampilan();
    }
    public void dosenPalingMuda(Dosen19[] arrayOfDosen) {
        Dosen19 dosenTertua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenTertua.usia) {
                dosenTertua = arrayOfDosen[i];
            }
        }
        System.out.println("\n DOSEN PALING MUDA ");
        dosenTertua.tampilan();
    }
}


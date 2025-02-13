public class Fungsi {
    public static void main(String[] args) {
        int[][] stokbunga = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] pengurangan = {1,2,0,5};
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual");
        hitungPendapatanPerCabang(stokbunga, hargaBunga);
        System.out.println("Jumlah stok cabang RoyalGarden 4 setelah pengurangan");
        royalGarden4(stokbunga[3], pengurangan);

    }
    public static void hitungPendapatanPerCabang(int[][] stok, int[] harga) {
        for(int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for(int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.printf("RoyalGarden %d: Rp %,d%n", (i + 1), pendapatan);
        }
    }
    public static void royalGarden4(int[] stokcabang4, int[] pengurangan) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.println("Stok awal:");
        for(int i = 0; i < stokcabang4.length; i++) {
            System.out.printf("%s: %d%n", namaBunga[i], stokcabang4[i]);
        }
        System.out.println("Stok setelah pengurangan");
        for(int i = 0; i < stokcabang4.length; i++) {
            int stokBaru = stokcabang4[i] - pengurangan[i];
            System.out.printf("%s: %d%n", namaBunga[i], stokBaru);
        }
    }
}

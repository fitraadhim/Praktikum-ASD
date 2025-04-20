public class SortingMain19 {

    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting19 dataurut1 = new Sorting19(a, a.length);
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        Sorting19 dataurut2 = new Sorting19(b, b.length);
        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        int c[] = {40, 10, 4, 9, 3};
        Sorting19 dataurut3 = new Sorting19(c, c.length);
        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.InstertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();

    }
}
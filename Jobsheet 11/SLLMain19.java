public class SLLMain19 {
    public static void main(String[] args) {
        SingleLinkedList19 sll = new SingleLinkedList19();
        Mahasiswa19 mhs1 = new Mahasiswa19("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa19 mhs2 = new Mahasiswa19("23212201", "Bimon", "2B", 3.8);
        Mahasiswa19 mhs3 = new Mahasiswa19("22212202", "Cintia", "3C", 3.5);
        Mahasiswa19 mhs4 = new Mahasiswa19("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();


    }   
}

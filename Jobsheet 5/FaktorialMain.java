import java.util.Scanner;

public class FaktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();
        
        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial "+ nilai + "menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+ nilai + "menggunakan DC: " + fk.faktorialDC(nilai));
    }    
}

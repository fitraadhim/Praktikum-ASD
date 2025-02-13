import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim;
        int n;

        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("=================");
        
        n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n = n + 10;
        }

        for(int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print("* ");
            }
            else {
                System.out.print(i+ " ");
            }
        }
    }
}

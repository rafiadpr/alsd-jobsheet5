
import java.util.Scanner;

public class MainSum23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum23 sm = new Sum23(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai keuntungan elemen ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan dengan Brute Force: " + sm.hitungKeuntunganBF());
        System.out.println("Total keuntungan dengan Divide and Conquer: " + sm.hitungKeuntunganDC(sm.keuntungan, 0, elemen - 1));
    }
}


import java.util.Scanner;

public class PangkatMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int n = input.nextInt();

        Pangkat23[] p = new Pangkat23[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();
            p[i] = new Pangkat23(basis, pangkat);
        }

        System.out.println("Hasil pangkat dengan Brute Force:");
        for (Pangkat23 pangkat23 : p) {
            System.out.println(pangkat23.nilai + " ^ " + pangkat23.pangkat + " = " + pangkat23.pangkatBF(pangkat23.nilai, pangkat23.pangkat));    
        }

        System.out.println("Hasil pangkat dengan Divide and Conquer:");
        for (Pangkat23 pangkat23 : p) {
            System.out.println(pangkat23.nilai + " ^ " + pangkat23.pangkat + " = " + pangkat23.pangkatDC(pangkat23.nilai, pangkat23.pangkat));    
        }
    }
}

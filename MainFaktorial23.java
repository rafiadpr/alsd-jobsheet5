
import java.util.Scanner;

public class MainFaktorial23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Faktorial23 f = new Faktorial23();
        
        System.out.print("Masukkan nilai n: ");
        f.nilai = input.nextInt();
        
        System.out.println("Hasil faktorial dengan Brute Force: " + f.faktorialBF(f.nilai));
        System.out.println("Hasil faktorial dengan Divide and Conquer: " + f.faktorialDC(f.nilai));
    }
}

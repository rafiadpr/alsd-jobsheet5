public class Faktorial23 {
    public int nilai;

    //Brute Force
    public int faktorialBF(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    //Divide and Conquer
    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
    
}

public class Faktorial23 {
    public int nilai;

    //Brute Force dengan while
    int faktorialBF(int n) {
        int hasil = 1, i = 1;
        while (i <= n) {
            hasil *= i;
            i++;
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

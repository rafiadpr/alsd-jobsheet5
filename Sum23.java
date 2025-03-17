public class Sum23 {

    double keuntungan[];

    Sum23(int el) {
        keuntungan = new double[el];
    }

    double hitungKeuntunganBF() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    double hitungKeuntunganDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = hitungKeuntunganDC(arr, l, mid);
        double rsum = hitungKeuntunganDC(arr, mid + 1, r);
        return lsum + rsum;
    }
}

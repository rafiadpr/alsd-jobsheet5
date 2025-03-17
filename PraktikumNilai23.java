public class PraktikumNilai23 {
    
    PraktikumData23[] dataMahasiswa;

    public PraktikumNilai23(PraktikumData23[] dataMahasiswa) {
        this.dataMahasiswa = dataMahasiswa;
    }

    //Mencari Nilai UTS Tertinggi dengan divide and conquer
    public int nilaiUTSMax (PraktikumData23[] dataMahasiswa, int l, int r) {
        if (l == r) {
            return dataMahasiswa[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lsum = nilaiUTSMax(dataMahasiswa, l, mid);
        int rsum = nilaiUTSMax(dataMahasiswa, mid + 1, r);
        return Math.max(lsum, rsum);
    }

    //Mencari Nilai UTS Terendah dengan divide and conquer
    public int nilaiUTSMin (PraktikumData23[] dataMahasiswa, int l, int r) {
        if (l == r) {
            return dataMahasiswa[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lsum = nilaiUTSMin(dataMahasiswa, l, mid);
        int rsum = nilaiUTSMin(dataMahasiswa, mid + 1, r);
        return Math.min(lsum, rsum);
    }

    //Menghitung Nilai UAS Rata-rata dengan Brute Force
    public double nilaiUASAvg (PraktikumData23[] dataMahasiswa) {
        double total = 0;
        for (int i = 0; i < dataMahasiswa.length; i++) {
            total += dataMahasiswa[i].nilaiUAS;
        }
        return total / dataMahasiswa.length;
    }
}

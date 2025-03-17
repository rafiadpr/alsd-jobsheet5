
import java.util.Scanner;

public class PraktikumMain23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();
        PraktikumData23[] DataMahasiswa = new PraktikumData23[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = input.next();
            System.out.print("Masukkan NIM: ");
            String nim = input.next();
            System.out.print("Masukkan tahun masuk: ");
            int tahunMasuk = input.nextInt();
            System.out.print("Masukkan nilai UTS: ");
            int nilaiUTS = input.nextInt();
            System.out.print("Masukkan nilai UAS: ");
            int nilaiUAS = input.nextInt();
            input.nextLine();
            
            DataMahasiswa[i] = new PraktikumData23(nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);
        }

        PraktikumNilai23 nilai = new PraktikumNilai23(DataMahasiswa);

        System.out.println("Nilai UTS Tertinggi: " + nilai.nilaiUTSMax(DataMahasiswa, 0, jumlahMahasiswa - 1));
        System.out.println("Nilai UTS Terendah: " + nilai.nilaiUTSMin(DataMahasiswa, 0, jumlahMahasiswa - 1));
        System.out.println("Nilai UAS Rata-rata: " + nilai.nilaiUASAvg(DataMahasiswa));
    }
}

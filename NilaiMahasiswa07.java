import java.util.Scanner;

public class NilaiMahasiswa07 {
    public static void isianArray  (int [] nilaiMahasiswa, Scanner sc) {
        for (int i = 1; i <= nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : " );
            nilaiMahasiswa[i - 1] = sc.nextInt();
        }
    }
        public static void tampilArray (int nilaiMahasiswa[]) {
            for (int j = 1; j <= nilaiMahasiswa.length; j++) {
                System.out.println("Nilai mahasiswa ke-" + j + " : " + nilaiMahasiswa[j - 1]);
        }
    }
    public static int hitTot (int nilaiMahasiswa[]) {
        int totalNilaiMahasiswa = 0;
        for (int i = 1; i <= nilaiMahasiswa.length; i++) {
            totalNilaiMahasiswa += nilaiMahasiswa[i - 1];
        }
        return totalNilaiMahasiswa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMahasiswa = new int [jumlahMahasiswa];

        isianArray(nilaiMahasiswa, sc);
        tampilArray(nilaiMahasiswa);
        int jumlahNilaiMahasiswa = hitTot(nilaiMahasiswa);
        System.out.println("Jumlah nilai " + jumlahMahasiswa + "mahasiswa adalah : " + jumlahNilaiMahasiswa);
    }
}
    


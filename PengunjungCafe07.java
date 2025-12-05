public class PengunjungCafe07 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
      //for(int i = 0; i < namaPengunjung.length; i++){
        //  System.out.println("- " +namaPengunjung[i]);
        for (String nama : namaPengunjung) {
        System.out.println("- " + nama);

        }
    }
         public static void main(String[] args) {
            daftarPengunjung("Ali", "Budi", "Citra");
            daftarPengunjung("Andi");
            daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
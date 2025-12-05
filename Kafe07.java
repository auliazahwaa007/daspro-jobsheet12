import java.util.Scanner;

public class Kafe07 {
    public static void Menu() {

        System.out.println("======= MENU RESTO KAFE =======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng  - 18,000");
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
         if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo: Diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }
        
        System.out.println("======= MENU RESTO KAFE =======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng  - 18,000");
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    //public static void main(String[] args) {
      //  Menu("Budi", true, "Diskon30");
    //}
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        
        if (kodePromo.equals("DISKON50")) {
            int diskon = hargaTotal / 2;
            hargaTotal -= diskon;
            
        } else if (kodePromo.equals("DISKON30")) {
            double diskon = hargaTotal * 0.30;
            hargaTotal -= diskon;
            
        } else {
            System.out.println("Kode promo invalid tidak ada pengurangan total harga.");
        }
        
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String kodePromo = "DISKON30";
        Menu("Budi", true, "DISKON30");
        
        int totalPesanan = 0;
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break; 
            }
            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            int banyakItem = sc.nextInt();
            
            int totalHargaMenu = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalPesanan+= totalHargaMenu;
            
          //System.out.println("Total harga sebelum diskon: Rp " + hargaTotal);
            System.out.println("Total untuk menu ini: Rp " + totalHargaMenu);
        }
        
        System.out.println("\n===============================");
        System.out.println("Total keseluruhan pesanan: Rp " + totalPesanan);
        System.out.println("===============================");
}
       // int pilihanMenu = 1;
        //int banyakItem = 2;
       // int totalBayar = hitungTotalHarga(pilihanMenu, banyakItem);
        //System.out.println("Total harga: Rp " + totalBayar);
        
       //ystem.out.print("\n Masukkan nomor menu yang ingin Anda pesan: ");
      //int pilihanMenu = sc.nextInt();
      //System.out.print("Masukkan jumlah item yang ingin dipesan: ");
      //int banyakItem = sc.nextInt();

     // int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

     //System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
//}

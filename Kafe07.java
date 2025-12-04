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
            System.out.println("Kode promo: DISKON50 → Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo: DISKON30 → Diskon 30%");
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
    public static void main(String[] args) {
        Menu("Budi", true, "Diskon30");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}

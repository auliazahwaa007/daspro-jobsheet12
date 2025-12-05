import java.util.Scanner;

public class RekapPenjualanCafe07 {
    
    static String[] menu = {"Kopi", "Teh", "Es kelapa muda", "Roti bakar", "Gorengan"};

    static int[][] penjualan = new int[5][7];

    static Scanner input = new Scanner(System.in);

    static void inputData() {
        System.out.println("=== Input Data Penjualan ===");

        for (int i = 0; i < 5; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }
    static void tampilkanTabel() {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.printf("%-15s", "Menu");

        for (int h = 1; h <= 7; h++) {
            System.out.printf("Hari %d ", h);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%7d ", penjualan[i][j]);
            }
            System.out.println();
        }
    }
    static void menuTertinggi() {
        int maxTotal = -1;
        String menuTerlaris = "";

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menuTerlaris);
        System.out.println("Total Penjualan: " + maxTotal);
    }

    static void rataRata() {
        System.out.println("\n=== RATA - RATA PENJUALAN SETIAP MENU ===");

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = total / 7.0;

            System.out.printf("%-15s : %.2f\n", menu[i], rata);
        }
    }
        public static void main(String[] args) {

        inputData();
        tampilkanTabel();
        menuTertinggi();
        rataRata();
    }
}

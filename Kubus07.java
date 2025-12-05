import java.util.Scanner;

public class Kubus07 {
    public static int hitungVolumeKubus (int a) {
        int volume = a * a * a;
        return volume;
    }
    
    public static int hitungLuasPermukaanKubus (int b) {
        int hitungLuasPermukaanKubus = hitungVolumeKubus(b) * 6;
        return hitungLuasPermukaanKubus;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus : ");
        int angka = sc.nextInt();

        int VolumeKubus = hitungVolumeKubus(angka);
        System.out.println("Volume kubus adalah : " + VolumeKubus);

        int LuasPermukaanKubus = hitungLuasPermukaanKubus(angka);
        System.out.println("Luas permukaan kubus adalah : " + LuasPermukaanKubus);

        sc.close();
    }
}

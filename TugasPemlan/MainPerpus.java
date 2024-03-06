package TugasPemlan;
import java.util.Scanner;

public class MainPerpus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();

        while (true) {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.println("8. Total buku yang ada di perpustakaan");
            System.out.println("9. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    perpus.showType(perpus.Teknologi, "Teknologi");
                    break;
                case 2:
                    perpus.showType(perpus.Filsafat, "Filsafat");
                    break;
                case 3:
                    perpus.showType(perpus.Sejarah, "Sejarah");
                    break;
                case 4:
                    perpus.showType(perpus.Agama, "Agama");
                    break;
                case 5:
                    perpus.showType(perpus.Psikologi, "Psikologi");
                    break;
                case 6:
                    perpus.showType(perpus.Politik, "Politik");
                    break;
                case 7:
                    perpus.showType(perpus.Fiksi, "Fiksi");
                    break;
                case 8:
                    System.out.println("Total buku yang ada di perpustakaan ini adalah 35 buku.");
                    break;
                case 9:
                    System.out.println("Terima kasih! Sampai jumpa lagi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak ada. Silakan masukkan pilihan yang tersedia.");
            }
        }
    }
}

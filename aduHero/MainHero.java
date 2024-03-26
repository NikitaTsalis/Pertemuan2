package aduHero;
import java.util.Scanner;

public class MainHero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Permainan adu hero");
        System.out.println("Player 1: Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("====================================================");
        Heroo hero1 = inputHero(scanner);

        System.out.println("Permainan adu hero");
        System.out.println("Player 2: Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("====================================================");
        Heroo hero2 = inputHero(scanner);

        System.out.println("====================================================");
        System.out.println("====================================================");

        int ronde = 1;
        while (hero1.getHealthPoints() > 0 && hero2.getHealthPoints() > 0) {
            if (hero2.getHealthPoints() <= 0) {
                System.out.println("Pertarungan telah selesai!");
                System.out.println(hero1.getNama() + " telah kalah!");
                System.out.println("======================================================");
                System.out.println(hero2.getNama() + " adalah pemenangnya!");
                break;
            } else if (hero1.getHealthPoints() <= 0) {
                System.out.println("Pertarungan telah selesai!");
                System.out.println(hero2.getNama() + " telah kalah!");
                System.out.println("======================================================");
                System.out.println(hero1.getNama() + " adalah pemenangnya!");
                break;
            }
            attackHero(hero1, hero2);
            attackHero(hero2, hero1);
            ronde++;
        }
    }

    public static Heroo inputHero(Scanner scanner) {
        Heroo hero = new Heroo();
        System.out.print("Nama Hero : ");
        hero.setNama(scanner.nextLine());

        System.out.print("Health Point : ");
        hero.setHealthPoints(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Attack : ");
        hero.setAttack(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Defense : ");
        hero.setDefense(scanner.nextDouble());
        scanner.nextLine();

        return hero;
    }

    public static void attackHero(Heroo penyerang, Heroo bertahan) {
        penyerang.attack(bertahan);
        if (bertahan.getHealthPoints() > 0) {
            System.out.println(penyerang.getNama() + " menyerang " + bertahan.getNama());
            double damage = penyerang.getAttack() - bertahan.getDefense();
            if (damage > 0) {
                bertahan.setHealthPoints(bertahan.getHealthPoints() - damage);
                System.out.println(penyerang.getNama() + " menyerang sebesar " + penyerang.getAttack());
                System.out.println(bertahan.getNama() + " memiliki pertahanan sebesar " + bertahan.getDefense());
                System.out.println("Health " + bertahan.getNama() + " saat ini " + bertahan.getHealthPoints());
            } else {
                System.out.println(penyerang.getNama() + " gagal menyebabkan kerusakan kepada " + bertahan.getNama() + ".");
            }
        }
        System.out.println("===============================================");
        System.out.println("===============================================");
    }
}
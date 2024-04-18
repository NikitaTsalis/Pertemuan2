package UBFilkom;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia Abdul = new Manusia("Abdul", "357111", true, true);
        System.out.println(Abdul + "\n");

        Manusia Naura = new Manusia("Naura", "357222", false, true);
        System.out.println(Naura + "\n");

        Manusia Grace = new Manusia("Grace", "357333", false, false);
        System.out.println(Grace + "\n");

        MahasiswaFilkom Ali = new MahasiswaFilkom("225150200111100", 2.8, "ALi", "357444", true, false);
        System.out.println(Ali + "\n");

        MahasiswaFilkom Bica = new MahasiswaFilkom("235150700222200", 3.2, "Bica", "357555", true, false);
        System.out.println(Bica + "\n");

        MahasiswaFilkom Nikitaa = new MahasiswaFilkom("235150401111041", 3.7, "Nikitaa", "3576660000004", false, false);
        System.out.println(Nikitaa + "\n");

        Pekerja Budi = new Pekerja(2000, LocalDate.of(2022, 9, 10), 2, "Budi", "357777", true, true);
        System.out.println(Budi + "\n");

        Pekerja Fadli = new Pekerja(3000, LocalDate.of(2015, 4, 21), 0, "Fadli", "357888", true, true);
        System.out.println(Fadli + "\n");

        Pekerja Ismail = new Pekerja(4000, LocalDate.of(2004, 5, 23), 10, "Ismail", "357999", true, true);
        System.out.println(Ismail + "\n");

        Manager Niki = new Manager("HRD", 7500, LocalDate.of(2009, 9, 2), 0, "Niki", "3571010", false, true);
        System.out.println(Niki + "\n");
    }
}
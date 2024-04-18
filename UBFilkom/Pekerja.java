package UBFilkom;
import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        LocalDate now = LocalDate.now();
        int years = now.getYear() - tahunMasuk.getYear();
        if (years >= 0 && years <= 5) {
            return gaji * 0.05;
        } else if (years > 5 && years <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    public double getPendapatan() { //@Override
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }

    public String toString() { //@Override
        return super.toString() + "\ntahun masuk : " + tahunMasuk + "\njumlah anak : " + jumlahAnak + "\ngaji : " + gaji;
    }
}
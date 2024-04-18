package UBFilkom;
import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getPendapatan() { //@Override
        return super.getPendapatan() + (super.getGaji() * 0.1);
    }

    public String toString() { //@Override
        return super.toString() + "\ndepartemen : " + departemen;
    }
}
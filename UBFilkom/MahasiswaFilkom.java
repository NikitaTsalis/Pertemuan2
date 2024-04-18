package UBFilkom;

public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2)) + 2000;
        int prodiDigit = Integer.parseInt(nim.substring(6, 7));
        String prodi = "";
        switch (prodiDigit) {
            case 2:
                prodi = "Teknik Informatika";
                break;
            case 3:
                prodi = "Teknik Komputer";
                break;
            case 4:
                prodi = "Sistem Informasi";
                break;
            case 6:
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi tidak valid";
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3 && ipk <= 3.5) {
            return 50;
        } else if (ipk > 3.5 && ipk <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    public String toString() { //@Override
        return super.toString() + "\nnim : " + nim + "\nipk : " + ipk + "\nstatus : " + getStatus();
    }
}
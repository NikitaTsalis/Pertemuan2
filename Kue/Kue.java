package Kue;

public abstract class Kue {
    String nama;
    double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();
    
    public abstract String getJenis(); 

    @Override
    public String toString() {
        return "Nama Kue: " + nama + "\nHarga: Rp " + String.format("%,.2f", harga).replace(",", ".") + "\nJenis Kue: " + getJenis() + "\n";
    }
}

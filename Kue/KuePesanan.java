package Kue;

public class KuePesanan extends Kue {
    double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return harga * berat;
    }

    @Override
    public String getJenis() {
        return "Kue Pesanan"; 
    }
}

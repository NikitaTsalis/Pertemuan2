package Kue;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("Bolu Kukus", 24000.0, 660.0);
        kueArray[1] = new KueJadi("Kue Cucur", 10000.0, 15);
        kueArray[2] = new KuePesanan("Brownies", 112000.0, 500.0);
        kueArray[3] = new KueJadi("Kue Lumpur", 30000.0, 23);
        kueArray[4] = new KuePesanan("Lapis Legit", 110000.0, 1000.0);
        kueArray[5] = new KueJadi("Kue Sus", 34000.0, 30);
        kueArray[6] = new KuePesanan("Kue Keju", 20000.0, 800.0);
        kueArray[7] = new KueJadi("Kue Lemper", 12000.0, 30);
        kueArray[8] = new KuePesanan("Kue Pandan", 18000.0, 600.0);
        kueArray[9] = new KueJadi("Kue Kering", 45000.0, 45);
        kueArray[10] = new KuePesanan("Kue Tiramisu", 56000.0, 900.0);
        kueArray[11] = new KueJadi("Kue Leker", 46000.0, 45);
        kueArray[12] = new KuePesanan("Kue Red Velvet", 67000.0, 700.0);
        kueArray[13] = new KueJadi("Kue Lapis", 90000.0, 35);
        kueArray[14] = new KuePesanan("Kue Roll", 45000.0, 750.0);
        kueArray[15] = new KueJadi("Kue Onde-onde", 33000.0, 50);
        kueArray[16] = new KuePesanan("Kue Risol", 32000.0, 850.0);
        kueArray[17] = new KueJadi("Kue Putu", 35000.0, 30);
        kueArray[18] = new KuePesanan("Kue Cheesecake", 90000.0, 1000.0);
        kueArray[19] = new KueJadi("Kue Klepon", 45000.0, 40);

        for (Kue kue : kueArray) {
            if (kue != null) {
                System.out.println(kue);
            }
        }

        double totalHargaSemuaKue = 0;
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        double hargaTertinggi = 0;
        String jenisKueTertinggi = "";

        for (Kue kue : kueArray) {
            if (kue != null) {
                totalHargaSemuaKue += kue.hitungHarga();
                if (kue.getJenis().equals("Kue Pesanan")) {
                    totalHargaKuePesanan += kue.hitungHarga();
                    totalBeratKuePesanan += ((KuePesanan) kue).berat;
                } else if (kue.getJenis().equals("Kue Jadi")) {
                    totalHargaKueJadi += kue.hitungHarga();
                    totalJumlahKueJadi += ((KueJadi) kue).jumlah;
                }

                if (kue.hitungHarga() > hargaTertinggi) {
                    hargaTertinggi = kue.hitungHarga();
                    jenisKueTertinggi = kue.getJenis();
                }
            }
        }

        System.out.println("==============[STATS]==============");
        System.out.println("TOTAL HARGA SEMUA KUE: Rp " + String.format("%,.2f", totalHargaSemuaKue));
        System.out.println("TOTAL HARGA KUE PESANAN: Rp " + String.format("%,.2f", totalHargaKuePesanan));
        System.out.println("TOTAL BERAT KUE PESANAN: " + totalBeratKuePesanan + " gram");
        System.out.println("TOTAL HARGA KUE JADI: Rp " + String.format("%,.2f", totalHargaKueJadi));
        System.out.println("TOTAL JUMLAH KUE JADI: " + totalJumlahKueJadi + " buah");

        System.out.println("\nKUE DENGAN HARGA TERTINGGI:");
        System.out.println("Berdasarkan Jenis: " + jenisKueTertinggi);
        for (Kue kue : kueArray) {
            if (kue != null && kue.hitungHarga() == hargaTertinggi) {
                System.out.println("Berdasarkan Nama Kue: " + kue.nama);
                break;
            }
        }
    }
}

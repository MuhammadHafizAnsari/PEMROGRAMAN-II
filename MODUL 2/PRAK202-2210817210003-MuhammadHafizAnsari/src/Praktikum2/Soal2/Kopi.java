package Praktikum2.Soal2;
class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }
    public String getPembeli() {
        return this.pembeli;
    }
    public double getPajak() {
        // Pajak dari tiap pembelian adalah 11%
        double Pajak = 0.11 * harga;
        return Pajak;
    }
    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
}
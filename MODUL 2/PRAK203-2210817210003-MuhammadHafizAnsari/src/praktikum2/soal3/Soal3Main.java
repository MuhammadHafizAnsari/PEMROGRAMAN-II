package praktikum2.soal3;
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // Memanggil nilai atribut 'umur' yang memiliki angka 17.
        p1.umur = 17;
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        // Menambahkan kata 'tahun' saat mencetak nilai umur agar sesuai dengan output yang diminta.
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun ");
    }
}
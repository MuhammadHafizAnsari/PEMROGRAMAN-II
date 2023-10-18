package praktikum2.soal3;
// Ubahlah nama kelas menjadi 'Pegawai' karena jika nama kelasnya 'employee', maka program tidak dapat dijalankan karena bersifat case sensitive.
// public class Employee {
public class Pegawai {
    public String nama;
    // Gantilah tipe data 'char' menjadi 'String' untuk variabel 'asal' karena kita ingin menyimpan string seperti 'Kingdom of Orvel'.
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    // Perbaiki metode 'setJabatan' dengan menambahkan parameter 'j' dalam bentuk string.
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
    // Tambahkan metode 'getUmur' untuk mendapatkan informasi umur.
    public int getUmur() {
        return umur;
    }
}
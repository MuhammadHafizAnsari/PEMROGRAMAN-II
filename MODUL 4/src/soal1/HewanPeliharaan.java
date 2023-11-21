package soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    private String nama, Ras;
    public HewanPeliharaan(String n, String R) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan : ");
        n = scanner.nextLine();
        this.nama = n ;
        System.out.print("Ras : ");
        R = scanner.nextLine();
        this.Ras = R ;
    }
    public void display() {
        System.out.println("\nDetail Hewan Peliharaan :");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + Ras);
    }
}
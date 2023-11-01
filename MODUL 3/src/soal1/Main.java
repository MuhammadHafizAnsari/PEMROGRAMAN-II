package soal1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dadu = new Dadu();
        int masukkan = input.nextInt();
        dadu.setInput(masukkan);
        dadu.acakNilai();
    }
}
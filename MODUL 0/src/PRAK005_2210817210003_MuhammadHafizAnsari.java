import java.util.Scanner;
public class PRAK105_2210817210003_MuhammadHafizAnsari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit: ");
        String makananFavorit = scanner.nextLine();
        System.out.print("Masukan Hobi: ");
        String hobi = scanner.nextLine();
        System.out.println("Aku Suka Makan " + makananFavorit + ", dan Hobiku " + hobi);
        scanner.close();
    }
}

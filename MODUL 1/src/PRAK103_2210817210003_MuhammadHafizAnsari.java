import java.util.Scanner;
public class PRAK103_2210817210003_MuhammadHafizAnsari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int input = scanner.nextInt();
        System.out.print("");
        int bilanganAwal = scanner.nextInt();
        int count = 0;
        int currentNumber = bilanganAwal;
        System.out.print(" ");
        do {
            if (currentNumber % 2 != 0) {
                System.out.print(currentNumber);
                count++;
                if (count < input) {
                    System.out.print(", ");
                }
            }
            currentNumber++;
        } while (count < input);
        System.out.println();
    }
}

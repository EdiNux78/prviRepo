package Product;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int w = 10;
        int h = 20;

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (j == h - 1 || j == 0 || i == w - 1 || i == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Koji sam broj zamislio?");
            Random random = new Random();
            int zamisljeni_broj = random.nextInt(7);
         while (true) {
             System.out.println("Unesi broj:");
             int uneseniBroj = scanner.nextInt();
             if (uneseniBroj== zamisljeni_broj) {
                 System.out.println("Jeste");
                 break;
             } else System.out.println("Nije");
         }
        }
    }
}


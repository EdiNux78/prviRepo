import java.util.Scanner;

public class ProvjeraParnogBroja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Uneseni broj je "+ x);
        System.out.println("Broj je paran "+ (x%2==0));

    }
}

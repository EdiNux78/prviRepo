import java.util.Scanner;

public class NIvoPristupa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nivoPristupa  = scanner.nextInt();
        //System.out.println("User level is: "+ nivoPristupa);
       // int nivoPristupa = 2;
        //System.out.println("User level is: " + nivoPristupa);
        int regular = 1;
        int admin = 2;
        int superadmin = 4;
        System.out.println("Regular level is : " + (nivoPristupa==regular));
        System.out.println("Admin level is : " + (nivoPristupa== admin));
        System.out.println("Superadmin level is : " + (nivoPristupa==superadmin));


    }

}

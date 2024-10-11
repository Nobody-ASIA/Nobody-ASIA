import java.util.Scanner;

public class identification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id;
        String pin;

        System.out.println("Identification\n\t\t");
        System.out.println("Username");
        id = scan.nextLine();

        if (id.equals("Gio Lopez")) {
            System.out.println("Password");
            pin = scan.nextLine();

            if (pin.equals("1234")) {
                System.out.println("Welcome");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

        scan.close();
    }
}
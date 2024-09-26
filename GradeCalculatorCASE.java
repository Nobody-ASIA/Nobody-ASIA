import java.util.Scanner;
/* Saldua, Gio Brix R.
 * CC2-B
 * Laboratory  Drills
 * Challenge:
 */
public class GradeCalculatorCASE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER YOUR SCORE: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");
        } else {

            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("Your grade is: A");
                    break;
                case 8:
                    System.out.println("Your grade is: B");
                    break;
                case 7:
                    System.out.println("Your grade is: C");
                    break;
                case 6:
                    System.out.println("Your grade is: D");
                    break;
                default:
                    System.out.println("Your grade is: F");
                    break;
            }
        }

        scanner.close();
    }
}

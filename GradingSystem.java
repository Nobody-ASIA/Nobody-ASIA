import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args){
    Scanner scnr = new Scanner (System.in);
    int score;
    System.out.print("ENTER YOUR SCORE:");
    score = scnr.nextInt();
    if (score >= 90){
        System.out.println("A " + score);
    } else if (score >= 80){
        System.out.println("B " + score);
    } else if (score >= 70){
        System.out.println("C " + score);
    } else if (score >= 60){
        System.out.println("D " + score);
    } else {
        System.out.println("F " + score);
    }
    scnr.close();

    }
}

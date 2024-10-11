import java.util.Scanner;
public class MainIF {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int fnum;
        int snum;
        int tnum;
        System.out.println("Enter First Number:");
        fnum = scnr.nextInt();
        System.out.println("Enter Second Number:");
        snum = scnr.nextInt();
        System.out.println("Enter third Number:");
        tnum = scnr.nextInt();
        System.out.println("Result:");
        if(fnum > snum && fnum > tnum){
            System.out.println(fnum + " is larger than " + snum + " and " + tnum);
        } else if (snum > fnum && snum > tnum){
            System.err.println(snum + " is larger than " + fnum + " and " + tnum);
        } else {
            System.out.println(tnum + " is larger than " + fnum + " and " + snum);
        }
        scnr.close();


    }
    
}

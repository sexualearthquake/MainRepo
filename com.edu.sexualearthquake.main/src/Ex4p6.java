import java.util.Scanner;

/**
 * Created by D on 27.10.2015.
 */
public class Ex4p6 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter õ:");
        double x = scr.nextInt();

        double d = 1 + x;
        double sqrt = Math.sqrt(d);

        System.out.println(sqrt);


    }
}
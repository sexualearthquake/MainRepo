/**
 * Created by D on 27.10.2015.
 */
public class Ex4p2 {
    public static void main(String[] args) {

        double x = 2;
        double result = 1;
        double numerator = 1;
        long fact = 1;

        for (int n = 1; n < 20; n++) {
            numerator = numerator * x;
            fact = fact * n;
            result += numerator / fact;
        }

        System.out.println(result);
        System.out.printf(
                "%.30f",
                result - Math.pow(Math.E, x)
        );

    }
}
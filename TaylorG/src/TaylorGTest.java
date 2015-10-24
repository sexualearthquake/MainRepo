/**
 * Created by D on 15.10.2015.
 */
public class TaylorGTest {


    public static void main(String[] args) {

        double precision = 0.0001;

        double x = 0.75;
        double sum = 0;

        double prevX = 1;

        while (true) {
            prevX = prevX * x;
         if (Math.abs(prevX) <= precision) ;
            break;
        }

        System.out.println(sum);

    }

}

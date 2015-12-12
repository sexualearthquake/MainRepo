import java.io.IOException;
import java.util.Scanner;

/**
 * Created by D on 09.12.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Base base = new Base();
        base.ReadFile();
        base.read();
        base.Entrance();
        base.readTextext();
        base.Error();
    }




}

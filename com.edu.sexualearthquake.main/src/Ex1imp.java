import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by D on 27.10.2015.
 */
public class Ex1imp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(101);
        int a;

        System.out.println("Загадай число (від 1 до 100), і запиши його. А я вгадаю!");
        a = scanner.nextInt();

        while (true) {

            if (a > randomNumber) {
                System.out.println(randomNumber + " Ні, число менше");
                randomNumber = new Random(randomNumber).nextInt(101);

            } else if (a < randomNumber) {
                System.out.println(randomNumber + " Ні, число більше");
                randomNumber = new Random().nextInt(randomNumber);
            } else if (a == randomNumber) {
                System.out.println(randomNumber + " Вгадав!");
                return;
            }
        }
    }

}
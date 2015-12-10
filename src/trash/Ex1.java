package trash;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by D on 24.10.2015.
 */
public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = new Random().nextInt(100);

        int response;

        System.out.println("Гра - відгадай число від 0 до 100!");

        while (true) {
            response = Integer.parseInt(scanner.nextLine());

            if (response == number) {
                System.out.println("Ви вгадали!");
                break;
            } else if (response < number) {
                System.out.println("Число менше");
            } else {
                System.out.println("Число більше");
            }
        }

    }
}


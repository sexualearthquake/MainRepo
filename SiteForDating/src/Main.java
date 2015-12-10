import java.util.Scanner;

/**
 * Created by D on 09.12.2015.
 */
public class Main {
    Scanner sc = new Scanner(System.in);
    Base base = new Base();


    void Account (String t, int p){

        String name;
        int location;
        int gender;
        int age;

        name = t;
        location = p;

        String open = (name + "\n" + location);

    }

    public void Entrance(){
        System.out.println("                                                               ");
        System.out.println("            |Вітаємо вас на сайті знайомств!|                  ");
        System.out.println("                                                               ");
        System.out.println("                     |Меню сайту|                              ");
        System.out.println("                                                               ");
        System.out.println("***ПОШУК: <пошук>" + "\n" +
                "*** ЩОБ ДОДАТИ НОВУ АНКЕТУ ВВЕДІТЬ <додати> " + "\n" +
                "*** ЩОБ ВИДАЛИТИ ВАШУ АНКЕТУ ВВЕДІТЬ <видалити>" + "\n" +
                "*** ЩОБ РЕДАГУВАТИ АНКЕТУ <редагувати>" + "\n" +
                "*** ЩОБ ВИЙТИ З САЙТУ ВВЕДІТЬ <вийти>");
    }void Add (){
        System.out.println("Введіть ім'я, місто та пол");
        String acc = sc.next();
        System.out.println("місто");
        int location = sc.nextInt();



    }

}

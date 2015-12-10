import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by D on 09.12.2015.
 */
public class Base {

    public static void main(String[] args) throws IOException {
        Map<String , Object> newKoliction = new HashMap<>();



        Scanner sc = new Scanner(System.in);}




        void ReadFile () throws IOException {
            Map<String, String> account = new HashMap<>();
            account.put("Роберт ДеНіро, Нью-Йорк, М", "44 роки");
            account.put("Аліна Кравченко, Ужгород, Ж", "19 років");
            account.put("Сергій Гук, Краснодар, М", "26 років");
            account.put("Вова Лембак, Ужгород, М", "17 років");
            account.put("Тони Кавана, Лос-Анжелес, М", "38 років");
            account.put("Елісон ДіЛоурентіс, Пенсільванія, Ж", "24 роки");
            account.put("Люсі Хейл, Лос-Анжелес, Ж", "26 років");
            account.put("Ешлі Мерін, Альбукерке, Ж", "45 років");
            account.put("Йоши Йамамото, Токіо, М", "54 роки");
            account.put("Каріна Лафлеур, Кіото, Ж", "19 років");
            account.put("Віктор Прошин, Москва, М", "33 роки");
            account.put("Шей Мітчелл, Лос-Анжелес, Ж", "25 років");


        PrintWriter writer = new PrintWriter(new FileWriter("src/Resources/data.txt"));
        writer.println(account.size());
        for (Map.Entry<String, String> entry : account.entrySet()) {
            writer.println(entry.getKey());
            writer.println(entry.getValue());

        }
        writer.close();
    }


    void read() throws FileNotFoundException {

        Map<String, String> savedAccount = new HashMap<>();
        Scanner scanner = new Scanner(new File("src/Resources/data.txt"));
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            String name = scanner.nextLine();
            String age = scanner.nextLine();
            savedAccount.put(name, age);

        }
    }
//
//        System.out.printf("Щоб додати новий аккаунт введіть додати (додати)");
//        String otvet = sc.nextLine();
//        if (otvet.equals("додати")){
//            System.out.println("Введіть ім'я, місто, пол");
//            String name = sc.nextLine();
//            System.out.println("Введіть вік");
//            int age = sc.nextInt()  ;
//
//        }
//        PrintWriter writer1 = new PrintWriter(new FileWriter("src/Resources/data.txt"));
//        writer.println(account.size());
//        for (Map.Entry<String, String> entry : account.entrySet()) {
//            writer.println(entry.getKey());
//            writer.println(entry.getValue());
//
//        }
//        writer.close();
//
//        for (Map.Entry<String, String> entry : savedAccount.entrySet())
//            System.out.println(entry.getKey() + "-" + entry.getValue());


}


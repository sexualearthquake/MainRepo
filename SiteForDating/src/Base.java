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
            account.put("������ ��ͳ��, ���-����, �", "44 ����");
            account.put("���� ���������, �������, �", "19 ����");
            account.put("����� ���, ���������, �", "26 ����");
            account.put("���� ������, �������, �", "17 ����");
            account.put("���� ������, ���-�������, �", "38 ����");
            account.put("����� ĳ��������, ����������, �", "24 ����");
            account.put("��� ����, ���-�������, �", "26 ����");
            account.put("��� ����, ����������, �", "45 ����");
            account.put("���� ��������, ����, �", "54 ����");
            account.put("����� �������, ʳ���, �", "19 ����");
            account.put("³���� ������, ������, �", "33 ����");
            account.put("��� ̳�����, ���-�������, �", "25 ����");


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
//        System.out.printf("��� ������ ����� ������� ������ ������ (������)");
//        String otvet = sc.nextLine();
//        if (otvet.equals("������")){
//            System.out.println("������ ��'�, ����, ���");
//            String name = sc.nextLine();
//            System.out.println("������ ��");
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


/**
 * Created by D on 24.10.2015.
 */
public class Ex5p1 {
    
    public static void main(String[] args) {

        Dish[] dishes = new Dish[7];
        dishes[0] = new Dish(15, 322, "Cheeseburger");
        dishes[1] = new Dish(13, 301, "Hamburger");
        dishes[2] = new Dish(7, 225, "Coke");
        dishes[3] = new Dish(42, 897, "Pizza");
        dishes[4] = new Dish(25, 567, "Fish and Chips");
        dishes[5] = new Dish(16, 187, "Mnt.Dew");
        dishes[6] = new Dish(31, 488, "Spaghetti");

        for (int i = 0; i < dishes.length; i++) {
            System.out.println(dishes[i]);
        }

    }

}

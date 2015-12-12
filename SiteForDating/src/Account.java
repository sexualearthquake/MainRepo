/**
 * Created by D on 09.12.2015.
 */
public class Account {

    private String name;
    private int age;
    private int location;
    private String gender;
    private String city;
    private String category;


    public Account(String name, int location, String gender, String category) {
        this.name = name;
        this.location = location;
        this.gender = gender;

    }



    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getLocation() {

        return location;
    }

    public void setLocation(int location) {

        this.location = location;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}




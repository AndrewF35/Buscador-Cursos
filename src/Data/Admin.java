package Data;

public class Admin extends User {

    public Admin() {
    }

    public Admin(String name, int age, String user, String password) {
        super.name = name;
        super.age = age;
        super.password = password;
        super.user = user;
    }

    public Admin(String user, String password) {
        super.password = password;
        super.user = user;
    }
    public Admin(String name, String user, String password) {
        super.name = name;
        super.password = password;
        super.user = user;
    }

}

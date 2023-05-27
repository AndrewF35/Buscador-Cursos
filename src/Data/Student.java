package Data;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private Major majorCurrent;
    //private ArrayList<Subject> Schedule = new ArrayList<>();
   // private Stack<Subject> DoneSubjects;
    //private Deque<Subject> remainingSubjects;
    private String password;
    private String user;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Student() {
    }

    public Student(String nombre, int edad, Major majorCurrent) {
        this.name = nombre;
        this.age = edad;
        this.majorCurrent = majorCurrent;
    }

    public Student(String name, int age, Major majorCurrent, String password, String user) {
        this.name = name;
        this.age = age;
        this.majorCurrent = majorCurrent;
        this.password = password;
        this.user = user;
    }

   @Override
    public int compareTo(Student anotherStudent) {
        // comparar por major
        int comparacionMajor = this.majorCurrent.getNameMajor().compareTo(anotherStudent.majorCurrent.getNameMajor());
        if (comparacionMajor != 0) {
            return comparacionMajor;
        }
        // Comparar por user
        int comparacionUser = this.user.compareTo(anotherStudent.user);
        if (comparacionUser != 0) {
            return comparacionUser;
        }
        // Comparar por password
        int comparacionPassword = this.password.compareTo(anotherStudent.password);
        if (comparacionPassword != 0) {
            return comparacionPassword;
        }
        // Comparar por name
        int comparacionNombre = this.name.compareTo(anotherStudent.name);
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }
        // Comparar por edad
        return Integer.compare(this.age, anotherStudent.age);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Major getMajorCurrent() {
        return majorCurrent;
    }

    public void setMajorCurrent(Major majorCurrent) {
        this.majorCurrent = majorCurrent;
    }

}

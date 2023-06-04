package Data;

import java.util.ArrayList;
import java.util.Stack;

public class Student extends User implements Comparable<Student> {

    private Major majorCurrent;
    private ArrayList<Subject> Schedule;
    private Stack<Subject> DoneSubjects;
    private Stack<Subject> remainingSubjects;

    
    public Stack<Subject> getDoneSubjects() {
        return DoneSubjects;
    }

    public void setDoneSubjects(Stack<Subject> DoneSubjects) {
        this.DoneSubjects = DoneSubjects;
    }

    public Stack<Subject> getRemainingSubjects() {
        return remainingSubjects;
    }

    public void setRemainingSubjects(Stack<Subject> remainingSubjects) {
        this.remainingSubjects = remainingSubjects;
    }

    public Major getMajorCurrent() {
        return majorCurrent;
    }

    public void setMajorCurrent(Major majorCurrent) {
        this.majorCurrent = majorCurrent;
    }

//-----metodos Horario ----------
    public ArrayList<Subject> getSchedule() {
        return Schedule;
    }

    public void setSchedule(ArrayList<Subject> Schedule) {
        this.Schedule = Schedule;
    }

    public void addSubjectToSchedule(Subject subjectToAdd) {
        this.Schedule.add(subjectToAdd);
    }

//-------------- ----------
    public Student() {
    }
    
    public Student(String name, int age, String password, String user) {
        super.name = name;
        super.age = age;
        super.password = password;
        super.user = user;
    }
    
    public Student(String nombre, int edad, Major majorCurrent) {
        super.name = nombre;
        super.age = edad;
        this.majorCurrent = majorCurrent;
    }

    public Student(String name, int age, Major majorCurrent, String password, String user) {
        super.name = name;
        super.age = age;
        this.majorCurrent = majorCurrent;
        super.password = password;
        super.user = user;
    }

    public Student(String name, int age, Major majorCurrent, String password, String user, ArrayList<Subject> Schedule) {
        super.name = name;
        super.age = age;
        this.majorCurrent = majorCurrent;
        super.password = password;
        super.user = user;
        this.Schedule = Schedule;
    }

    public Student(String name, int age, Major majorCurrent, String password, String user, ArrayList<Subject> schedule, Stack<Subject> doneSubjects, Stack<Subject> remainingSubjects) {
        super.name = name;
        super.age = age;
        this.majorCurrent = majorCurrent;
        super.password = password;
        super.user = user;
        this.Schedule = new ArrayList<>();
        this.DoneSubjects = new Stack<>();
        this.remainingSubjects = new Stack<>();
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

}

package Data;

import java.util.ArrayList;

public class Teacher extends User implements Comparable<Teacher> {
    
    private ArrayList<Subject> currentSubjects;

    public ArrayList<Subject> getCurrentSubjects() {
        return currentSubjects;
    }

    public void setCurrentSubjects(ArrayList<Subject> currentSubjects) {
        this.currentSubjects = currentSubjects;
    }

    public void addSubjectToCurrentSubjects(Subject subjectToAdd){
        this.currentSubjects.add(subjectToAdd);
    }

    public Teacher(ArrayList<Subject> currentSubjects) {
        this.currentSubjects = currentSubjects;
    }

    public Teacher() {
    }
    
    public Teacher(String nombre, int edad,String user,String password, ArrayList<Subject> currentSubjects) {
        super.name = nombre;
        super.age = edad;
        super.user = user;
        super.password = password;
        this.currentSubjects = currentSubjects;
    }
    
    @Override
    public int compareTo(Teacher anotherTeacher) {
        // Comparar por user
        int comparacionUser = this.user.compareTo(anotherTeacher.user);
        if (comparacionUser != 0) {
            return comparacionUser;
        }
        // Comparar por password
        int comparacionPassword = this.password.compareTo(anotherTeacher.password);
        if (comparacionPassword != 0) {
            return comparacionPassword;
        }
        // Comparar por name
        int comparacionNombre = this.name.compareTo(anotherTeacher.name);
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }
        // Comparar por edad
        return Integer.compare(this.age, anotherTeacher.age);
    }
    
    
}

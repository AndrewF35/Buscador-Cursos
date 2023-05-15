package Data;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class Student {

    private String nombre;
    private int edad;
    private Major majorCurrent;
    private ArrayList<Subject> Schedule = new ArrayList<>();
    private Stack<Subject> DoneSubjects;
    private Deque<Subject> remainingSubjects;


    public void addSubjectToDoneSubjects(Subject subjectToAdd) {
        DoneSubjects.push(subjectToAdd);
    }

    public void addSubjectToremainingSubjects(Subject subjectToAdd) {
        remainingSubjects.add(subjectToAdd);
    }
    
    public void addSubjectToSchedule(Subject subjectToAdd) {
        Schedule.add(subjectToAdd);
    }

    public void printSchedule() {
        for(int i=0;i<Schedule.size();i++){
            System.out.println(Schedule.get(i).getNameSubject());

        }
    }

    public void deleteSubjectFromSchedule(Subject subjectToDelete) {
        Schedule.remove(subjectToDelete);
    }

    public Student() {
    }

    public Student(String nombre, int edad, Major majorCurrent, ArrayList<Subject> Schedules, Stack<Subject> DoneSubjects, Deque<Subject> remainingSubjects) {
        this.nombre = nombre;
        this.edad = edad;
        this.majorCurrent = majorCurrent;
        this.Schedule = Schedules;
        this.DoneSubjects = DoneSubjects;
        this.remainingSubjects = remainingSubjects;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", majorCurrent=" + majorCurrent + ", Schedules=" + Schedule + ", DoneSubjects=" + DoneSubjects + ", remainingSubjects=" + remainingSubjects + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Major getMajorCurrent() {
        return majorCurrent;
    }

    public void setMajorCurrent(Major majorCurrent) {
        this.majorCurrent = majorCurrent;
    }

    public ArrayList<Subject> getSchedule() {
        return Schedule;
    }

    public void setSchedule(ArrayList<Subject> Schedule) {
        this.Schedule = Schedule;
    }

    public Stack<Subject> getDoneSubjects() {
        return DoneSubjects;
    }

    public void setDoneSubjects(Stack<Subject> DoneSubjects) {
        this.DoneSubjects = DoneSubjects;
    }

    public Deque<Subject> getRemainingSubjects() {
        return remainingSubjects;
    }

    public void setRemainingSubjects(Deque<Subject> remainingSubjects) {
        this.remainingSubjects = remainingSubjects;
    }

}

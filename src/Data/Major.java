package Data;

import java.util.ArrayList;
import java.util.LinkedList;

public class Major {

    private String nameMajor;//ciencias de la computacion
    private ArrayList<Subject> subjects = new ArrayList<>();//introduccion, mates,poo

    public void addSubjectToMajor(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjectsFromMajor() {
        return subjects;
    }
    public LinkedList<String> readAllByName() {
        LinkedList<String> subjectList = new LinkedList<>();
        for (Subject curso : subjects) {
            subjectList.add(curso.getNameSubject());
        }

        return subjectList;
    }

    public Subject getSubjectsFromMajorByIndex(int index) {
        return subjects.get(index);
    }

    public Subject getSubjectsFromMajorByName(String nameSubject) {
        for(Subject subject : subjects){
            if(subject.getNameSubject().equals(nameSubject)){
                return subject;
            }
        }
        return null;
    }
    public Subject getSubjectsFromMajorByCredits(int credits) {
        for(Subject subject : subjects){
            if(subject.getCreditsSubject()==(credits)){
                return subject;
            }
        }
        return null;
    }
    public Subject readByCode(int codeSubject) {
        return subjects.get(codeSubject-1000);
    }
    public String deleteByCode(int codeSubject){
        String nameSubjectDeleted = readByCode(codeSubject).getNameSubject();
        if (nameSubjectDeleted != null) {
            subjects.remove(codeSubject-1000);
            return nameSubjectDeleted;
        }
        return null;
    }
    public void addSubjectToMajor(String courseName, int courseCode, int creditSubject,int quotesSubject) {
        Subject subject = new Subject(courseName, courseCode, creditSubject, quotesSubject);
        subjects.add(subject);
    }

    public String getNameMajor() {
        return nameMajor;
    }

    public void setNameMajor(String nameMajor) {
        this.nameMajor = nameMajor;
    }

    private static Major timeSubjects = new Major();

    public static void measureMethods() {
        int[] inputSizes = {10000, 100000, 1000000, 10000000};
        for (int size : inputSizes) {
            System.out.println("Testing with " + size + " courses:");
            long startTime, endTime, elapsedTime;

            // Add subjects
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                timeSubjects.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for addSubjectToMajor(): " + elapsedTime / 1_000_000 + " ms");

            // Read subjects by code
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                timeSubjects.readByCode(i + 1000);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for readByCode(): " + elapsedTime / 1_000_000 + " ms");

            // Delete subjects by code
            startTime = System.nanoTime();
            for (int i = size; i > 0; i--) {
                timeSubjects.deleteByCode(i + 999);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for deleteByCode(): " + elapsedTime / 1_000_000 + " ms");

            //TODO: Añadir la medición de la implementación del Árbol
        }
    }


}

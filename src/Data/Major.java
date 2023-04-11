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

}

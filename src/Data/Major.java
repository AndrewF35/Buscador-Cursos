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
    public Subject readByCode(int code){
        for (Subject subject: subjects) {
            if (subject.getCodeSubject() == code)
                return subject;
        }
        return null;
    }
    public String deleteByCode(int codeSubject){
        String nameSubjectDeleted = readByCode(codeSubject).getNameSubject();
        int index=0;
        for (Subject subjectCode: subjects) {
            if (subjectCode.getCodeSubject() == codeSubject){
                subjects.remove(index);
                return nameSubjectDeleted;
            }
            index++;
        }
        return null;
    }
    public void addSubjectToMajor(String courseName, int courseCode, int creditSubject,int quotesSubject) {
        Subject subject = new Subject();
        subject.setNameSubject(courseName);
        subject.setCodeSubject(courseCode);
        subject.setCreditsSubject(creditSubject);
        subject.setQuotesSubject(quotesSubject);
        subjects.add(subject);
    }

    public String getNameMajor() {
        return nameMajor;
    }

    public void setNameMajor(String nameMajor) {
        this.nameMajor = nameMajor;
    }

}

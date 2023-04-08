
package Data;

import java.util.LinkedList;

// 
//esta clase se encarga de crear linked list donde se alamcenaran los cursos y en ellos su informacion

public class BaseDatosCursos {
    
        LinkedList<Subject> subjects = new LinkedList<>();

        
    public void create(String courseName, int courseCode, int creditSubject){
        Subject subject = new Subject();
        subject.setNameSubject(courseName);
        subject.setCodeSubject(courseCode);
        subject.setCreditsSubject(creditSubject);
        subjects.add(subject);
    }
    
    public Subject readByCode(int code){
        for (Subject subject: subjects) {
            if (subject.getCodeSubject() == code)
                return subject;
        }
        return null;
    }
    public LinkedList<Subject> readAll(){
        LinkedList<Subject> subjectList = new LinkedList<>();
        for (Subject curso: subjects)
            subjectList.add(curso);
        return subjectList;
    }
    public LinkedList<String> readAllByName(){
        LinkedList<String> subjectList = new LinkedList<>();
        for (Subject curso: subjects)
            subjectList.add(curso.getNameSubject());

        return subjectList;
    }
    public String modify(int codeSubject, String newNameSubject){
        String previewName = readByCode(codeSubject).getNameSubject();
        readByCode(codeSubject).setNameSubject(newNameSubject);
        return previewName;
    }

    public String delete(int codeSubject){
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
}

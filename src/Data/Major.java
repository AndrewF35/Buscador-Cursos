
package Data;
import java.util.ArrayList;

public class Major {
    private String nameMajor;//ciencias de la computacion
    private ArrayList<Subject> subjects =new ArrayList<>();//introduccion, mates,poo

    public void addSubjectToMajor(Subject subject){
        subjects.add(subject);
    }

    public Subject getSubjectsFromMajor(int index) {
        return subjects.get(index);
    }
    
    public void addSubjectToMajor(String courseName, int courseCode, int creditSubject){
        Subject subject = new Subject();
        subject.setNameSubject(courseName);
        subject.setCodeSubject(courseCode);
        subject.setCreditsSubject(creditSubject);
        subjects.add(subject);
    }
    
    public String getNameMajor() {
        return nameMajor;
    }

    public void setNameMajor(String nameMajor) {
        this.nameMajor = nameMajor;
    }

}

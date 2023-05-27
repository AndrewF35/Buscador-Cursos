package national.ed.coursesearch.Infrastructure.Repositories;

import national.ed.coursesearch.Domain.Entities.Subject;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class CoursesRepository {
    private int codeAssign = 1000;

    private HashMap<Integer,Subject> COURSE_NAMES = new HashMap<>();

    public void CreateSubject(Subject subject){
        COURSE_NAMES.put(subject.getCodeSubject(), subject);
    }

    public void EditSubject(Subject subject){
        COURSE_NAMES.replace(subject.getCodeSubject(),subject);
    }

    public void DeleteSubject(Integer idSubject){
        COURSE_NAMES.remove(idSubject);
    }

    public HashMap<Integer,Subject> GetAllSubjects () {
        return COURSE_NAMES;
    }

    public Subject GetSubjectById (Integer id) {
        return COURSE_NAMES.get(id);
    }

    public Integer GetAvailableCode () {
        this.codeAssign++;
        return codeAssign;
    }


}

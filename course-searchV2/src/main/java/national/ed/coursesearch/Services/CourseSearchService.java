package national.ed.coursesearch.Services;

import national.ed.coursesearch.Domain.Entities.Subject;
import national.ed.coursesearch.Domain.Request.CreateSubjectRequest;
import national.ed.coursesearch.Infrastructure.Repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CourseSearchService {

    @Autowired
    public CoursesRepository coursesRepository;

    public HashMap<Integer, Subject> allSubjects() {
        return coursesRepository.GetAllSubjects();
    }

    public Subject subjectById(Integer id) {
        return coursesRepository.GetSubjectById(id);
    }

    public Boolean createSubject(CreateSubjectRequest createSubjectRequest) {
        Subject subject = new Subject(createSubjectRequest);
        subject.setCodeSubject(coursesRepository.GetAvailableCode());
        coursesRepository.CreateSubject(subject);
        return true;
    }

    public Boolean editSubject(int idSubject, CreateSubjectRequest createSubjectRequest) {
        Subject subject = subjectById(idSubject);
        subject.setNameSubject(createSubjectRequest.getNameSubject());
        subject.setCreditsSubject(createSubjectRequest.getCreditsSubject());
        coursesRepository.EditSubject(subject);
        return true;
    }

    public Boolean deleteSubject(int idSubject) {
        coursesRepository.DeleteSubject(idSubject);
        return true;
    }
}

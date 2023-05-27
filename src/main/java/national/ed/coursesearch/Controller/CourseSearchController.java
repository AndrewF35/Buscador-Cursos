package national.ed.coursesearch.Controller;

import national.ed.coursesearch.Domain.Entities.Subject;
import national.ed.coursesearch.Domain.Request.CreateSubjectRequest;
import national.ed.coursesearch.Services.CourseSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/CourseSearch")
@CrossOrigin(origins = "*")
public class CourseSearchController {

    @Autowired
    private CourseSearchService courseSearchService;


    @GetMapping("courses")
    public HashMap<Integer,Subject> allCourses() {
        return courseSearchService.allSubjects();
    }


    @GetMapping("{idSubject}")
    public Subject getSpecificCourseById(@PathVariable Integer idSubject) {
        return courseSearchService.subjectById(idSubject);
    }

    @PostMapping("create-course")
    public Boolean createCourse(@RequestBody CreateSubjectRequest subjectRequest) {
        return courseSearchService.createSubject(subjectRequest);
    }

    @PutMapping("update-course/{idSubject}")
    public Boolean updateCourse(@PathVariable Integer idSubject, @RequestBody CreateSubjectRequest subjectRequest) {
        return courseSearchService.editSubject(idSubject, subjectRequest);
    }

    @DeleteMapping("delete-course/{idSubject}")
    public Boolean deleteById(@PathVariable Integer idSubject) {
        return courseSearchService.deleteSubject(idSubject);
    }
}

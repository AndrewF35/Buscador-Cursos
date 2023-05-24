package national.ed.coursesearch.Domain.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import national.ed.coursesearch.Domain.Request.CreateSubjectRequest;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    private String nameSubject;
    private int codeSubject;
    private int creditsSubject;
    private int quotesSubject;
    private String requirementsSubject;
    private String descriptionSubject;

    public Subject(CreateSubjectRequest createSubjectRequest) {
        nameSubject = createSubjectRequest.getNameSubject();
        creditsSubject = createSubjectRequest.getCreditsSubject();
        quotesSubject = createSubjectRequest.getQuotesSubject();
        descriptionSubject = createSubjectRequest.getDescriptionSubject();
    }
}

package national.ed.coursesearch.Domain.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubjectRequest {

    private String nameSubject;
    private int creditsSubject;
    private int quotesSubject;
    private String descriptionSubject;
}

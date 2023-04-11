package Data;

import java.util.LinkedList;

public class Subject {

    private String nameSubject;
    private int codeSubject;
    private int creditsSubject;
    private int quotesSubject;
    private String requirementsSubject;
    private String descriptionSubject;

    public Subject() {
    }

    public Subject(String nameSubject, int codeSubject, int creditsSubject, int quotesSubject) {
        this.nameSubject = nameSubject;
        this.codeSubject = codeSubject;
        this.creditsSubject = creditsSubject;
        this.quotesSubject = quotesSubject;
    }

//    private int cupoDisponible;
//    private boolean ofertado;
    public void modifySubect(Subject subjectToModify,String nameSubject,int codeSubject,int creditsSubject,int quotesSubject){
        subjectToModify.setNameSubject(nameSubject);
        subjectToModify.setCodeSubject(codeSubject);
        subjectToModify.setCreditsSubject(creditsSubject);
        subjectToModify.setQuotesSubject(quotesSubject);
    }
    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getCodeSubject() {
        return codeSubject;
    }

    public void setCodeSubject(int codeSubject) {
        this.codeSubject = codeSubject;
    }

    public int getCreditsSubject() {
        return creditsSubject;
    }

    public void setCreditsSubject(int creditsSubject) {
        this.creditsSubject = creditsSubject;
    }

    public int getQuotesSubject() {
        return quotesSubject;
    }

    public void setQuotesSubject(int quotesSubject) {
        this.quotesSubject = quotesSubject;
    }

    public String getRequirementsSubject() {
        return requirementsSubject;
    }

    public void setRequirementsSubject(String requirementsSubject) {
        this.requirementsSubject = requirementsSubject;
    }

    public String getDescriptionSubject() {
        return descriptionSubject;
    }

    public void setDescriptionSubject(String descriptionSubject) {
        this.descriptionSubject = descriptionSubject;
    }
}

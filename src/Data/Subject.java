
package Data;


public class Subject {
    private String nameSubject;
    private int codeSubject;
    private int creditsSubject;
    private int quotesSubject;
    private String requirementsSubject;
    private String descriptionSubject;

    public Subject() {
    }

    public Subject(String nameSubject) {
        this.nameSubject = nameSubject;
    }
    
//    private int cupoDisponible;
//    private boolean ofertado;

    public String getNameSubject() {return nameSubject;}
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getCodeSubject() {
        return codeSubject;
    }
    public void setCodeSubject(int codeSubject) {
        this.codeSubject = codeSubject;
    }

    public int getCreditsSubject() {return creditsSubject;}
    public void setCreditsSubject(int creditsSubject) {this.creditsSubject = creditsSubject;}

    public int getQuotesSubject() {return quotesSubject;}
    public void setQuotesSubject(int quotesSubject) {this.quotesSubject = quotesSubject;}

    public String getRequirementsSubject() {return requirementsSubject;}
    public void setRequirementsSubject(String requirementsSubject) {this.requirementsSubject = requirementsSubject;}

    public String getDescriptionSubject() {return descriptionSubject;}
    public void setDescriptionSubject(String descriptionSubject) {this.descriptionSubject = descriptionSubject;}
}

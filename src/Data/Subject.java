package Data;

import java.util.LinkedList;

public class Subject implements Comparable<Subject> {

    private String nameSubject;
    private int codeSubject;
    private int creditsSubject;
    private int quotesSubject;

    public Subject() {
    }

    public Subject(String nameSubject, int codeSubject, int creditsSubject, int quotesSubject) {
        this.nameSubject = nameSubject;
        this.codeSubject = codeSubject;
        this.creditsSubject = creditsSubject;
        this.quotesSubject = quotesSubject;
    }
    @Override
    public int compareTo(Subject anotherSubject) {
        // comparar por nameSubject
        int comparacionNameSubject = this.nameSubject.compareTo(anotherSubject.nameSubject);
        if (comparacionNameSubject != 0) {
            return comparacionNameSubject;
        }
        // Comparar por codeSubject
        int comparacionCodeSubject = Integer.compare(this.codeSubject,anotherSubject.codeSubject);
        if (comparacionCodeSubject != 0) {
            return comparacionCodeSubject;
        }
        // Comparar por creditsSubject
        int comparacionCreditsSubject = Integer.compare(this.creditsSubject,anotherSubject.creditsSubject);
        if (comparacionCreditsSubject != 0) {
            return comparacionCreditsSubject;
        }
        // Comparar por edad
        return Integer.compare(this.quotesSubject,anotherSubject.quotesSubject);
    }

//    private int cupoDisponible;
//    private boolean ofertado;
    public void modifySubect(Subject subjectToModify,String nameSubject,int codeSubject,int creditsSubject,int quotesSubject){
        subjectToModify.setName(nameSubject);
        subjectToModify.setCodeSubject(codeSubject);
        subjectToModify.setCreditsSubject(creditsSubject);
        subjectToModify.setQuotesSubject(quotesSubject);
    }
    public String getNameSubject() {
        return nameSubject;
    }

    public void setName(String nameSubject) {
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
}

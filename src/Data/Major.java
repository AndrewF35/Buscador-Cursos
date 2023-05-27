package Data;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Major {

    private String nameMajor;//ciencias de la computacion
    private ArrayList<Subject> subjects = new ArrayList<>();//introduccion, mates,poo
    private RecursiveBinarySearchTree students = new RecursiveBinarySearchTree();

    // metodos Carrera
    public String getNameMajor() {
        return nameMajor;
    }

    public void setNameMajor(String nameMajor) {
        this.nameMajor = nameMajor;
    }

    //Metodos para filtrar materias  
    public Major filterByCode(Major subjects, int code) {
        Major majorFiltered = new Major();
        for (int i = 0; i < subjects.getSubjectsFromMajor().size(); i++) {
            if (subjects.getSubjectsFromMajor().get(i).getCodeSubject() == code) {
                majorFiltered.subjects.add((subjects.getSubjectsFromMajor().get(i)));
            }
        }
        return majorFiltered;
    }

    public Major filterByName(Major subjects, String name) {
        Major majorFiltered = new Major();
        for (int i = 0; i < subjects.getSubjectsFromMajor().size(); i++) {
            if (subjects.getSubjectsFromMajor().get(i).getNameSubject().contains(name)) {
                majorFiltered.subjects.add((subjects.getSubjectsFromMajor().get(i)));
            }
        }
        return majorFiltered;
    }

    public Major filterByCredits(Major subjects, int credits) {
        Major majorFiltered = new Major();
        for (int i = 0; i < subjects.getSubjectsFromMajor().size(); i++) {
            if (subjects.getSubjectsFromMajor().get(i).getCreditsSubject() == credits) {
                majorFiltered.subjects.add((subjects.getSubjectsFromMajor().get(i)));
            }
        }
        return majorFiltered;
    }

    public void addSubjectToMajor(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjectsFromMajor() {
        return subjects;
    }

    public LinkedList<String> readAllByName() {
        LinkedList<String> subjectList = new LinkedList<>();
        for (Subject curso : subjects) {
            subjectList.add(curso.getNameSubject());
        }

        return subjectList;
    }

    public Subject getSubjectsFromMajorByIndex(int index) {
        return subjects.get(index);
    }

    public Subject getSubjectsFromMajorByName(String nameSubject) {
        for (Subject subject : subjects) {
            if (subject.getNameSubject().equals(nameSubject)) {
                return subject;
            }
        }
        return null;
    }

    public Subject getSubjectsFromMajorByCredits(int credits) {
        for (Subject subject : subjects) {
            if (subject.getCreditsSubject() == (credits)) {
                return subject;
            }
        }
        return null;
    }

    public Subject readByCode(int codeSubject) {
        return subjects.get(codeSubject - 1000);
    }

    public String deleteByCode(int codeSubject) {
        String nameSubjectDeleted = readByCode(codeSubject).getNameSubject();
        if (nameSubjectDeleted != null) {
            subjects.remove(codeSubject - 1000);
            return nameSubjectDeleted;
        }
        return null;
    }

    public void addSubjectToMajor(String courseName, int courseCode, int creditSubject, int quotesSubject) {
        Subject subject = new Subject(courseName, courseCode, creditSubject, quotesSubject);
        subjects.add(subject);
    }
    //-------Metodos estudiantes-------//

    public RecursiveBinarySearchTree getStudentsTree() {
        return students;
    }

    public ArrayList<Student> getStudentsFromMajorInArray() {
        ArrayList<Student> StudentsInMajor = new ArrayList<>();
        this.students.inOrderList(StudentsInMajor);
        return StudentsInMajor;
    }
    public Student getStudentsFromMajorByName(String name) {
        Student student = new Student(); 
        student = (Student) students.getNode(student.getName()).getKey();
        if(student.getName().equals(name)){
            return student; 
        }
        return null;
    }
    public Student searchStudentByUser(String user){
        return this.searchStudentByUser(students.root, user);
    }
    private Student searchStudentByUser(TreeNode<Student> node,String data) { 
        if(node == null) return null;
        if(node.getKey().getUser().compareTo(data) == 0) {
            return node.getKey();
        }
        else if(data.compareTo(node.getKey().getUser()) < 0) {
            return this.searchStudentByUser(node.getLeft(),data);
        }
        else return this.searchStudentByUser(node.getRight(), data);
    }
    
    private Student searchStudentByName(TreeNode<Student> node,Student data) {
        node = students.root;
        if(node == null) return null;
        if(node.getKey().getName().compareTo(data.getName()) == 0) {
            return node.getKey();
        }
        else if(data.getName().compareTo(node.getKey().getName()) < 0) {
            return this.searchStudentByName(node.getLeft(),data);
        }
        else return this.searchStudentByName(node.getRight(), data);
    }
    public void printTreeByName() {
        printTree(students.root, 0);
    }
    
    private void printTree(TreeNode<Student> node, int level) {
        if (node == null) {
            return;
        }

        printTree(node.getRight(), level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(node.getKey().getName());

        printTree(node.getLeft(), level + 1);
    }
    public void AddStudentsToMajor(Student studentToAdd) {
        this.students.insert(studentToAdd);
    }
    
    public void AddStudentsToMajor(RecursiveBinarySearchTree Students,String name, int age, Major majorCurrent, String password, String user) {
        Student studentToAdd = new Student();
        studentToAdd.setName(name);
        studentToAdd.setAge(age);
        studentToAdd.setMajorCurrent(majorCurrent);
        studentToAdd.setPassword(password);
        studentToAdd.setUser(user);
        this.students.insert((Comparable) studentToAdd);
    }

//_______________________________Metodos medicion______________________________________________________________
    private static Major timeSubjects = new Major();

    public static void measureMethods() {
        int[] inputSizes = {10000, 100000, 1000000, 10000000};
        for (int size : inputSizes) {
            System.out.println("Testing with " + size + " courses:");
            long startTime, endTime, elapsedTime;

            // Add subjects
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                timeSubjects.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for addSubjectToMajor(): " + elapsedTime / 1_000_000 + " ms");

            // Read subjects by code
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                timeSubjects.readByCode(i + 1000);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for readByCode(): " + elapsedTime / 1_000_000 + " ms");

            // Delete subjects by code
            startTime = System.nanoTime();
            for (int i = size; i > 0; i--) {
                timeSubjects.deleteByCode(i + 999);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for deleteByCode(): " + elapsedTime / 1_000_000 + " ms");

            //TODO: Añadir la medición de la implementación del Árbol
        }
    }

}

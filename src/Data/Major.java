package Data;

import DataStructures.RecursiveBinarySearchTree;
import DataStructures.TreeNode;
import java.util.ArrayList;

public class Major implements Comparable<Major> {

    private String nameMajor;//ciencias de la computacion
    private RecursiveBinarySearchTree<Subject> subjects = new RecursiveBinarySearchTree<>();//introduccion, mates,poo
    private RecursiveBinarySearchTree<Student> students = new RecursiveBinarySearchTree();

    
//getters y setters 
    public void setSubjects(RecursiveBinarySearchTree<Subject> subjects) {
        this.subjects = subjects;
    }
    public String getNameMajor() {
        return nameMajor;
    }

    public void setNameMajor(String nameMajor) {
        this.nameMajor = nameMajor;
    }
    public ArrayList<Subject> readAllByName() {
        ArrayList<Subject> SubjectsInMajor = new ArrayList<>();
        this.subjects.inOrderList(SubjectsInMajor);
        return SubjectsInMajor;
    }

    private Subject getSubjectByName(String name) {
        TreeNode<Subject> root = this.getSubjectsFromMajor().getRoot();
        return getSubjectsHelperByName(root, name);

    }
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
        student = (Student) students.getNode(student).getKey();
        if (student.getName().equals(name)) {
            return student;
        }
        return null;
    }

    //Metodos para filtrar materias  
    public Major filterByCode(Major major,int code) {
        Major majorFiltered = new Major();
        RecursiveBinarySearchTree<Subject> resultTree = new RecursiveBinarySearchTree<>();
        filterHelperByCode(major.getSubjectsFromMajor().getRoot(), code, resultTree);
        majorFiltered.setSubjects(resultTree);
        return majorFiltered;
    }

    public Major filterByName(Major major,String name) {
        Major majorFiltered = new Major();
        RecursiveBinarySearchTree<Subject> resultTree = new RecursiveBinarySearchTree<>();
        filterHelperByName(major.getSubjectsFromMajor().getRoot(), name, resultTree);
        majorFiltered.setSubjects(resultTree);
        return majorFiltered;
    }

    private void filterHelperByName(TreeNode<Subject> node, String attributeValue, RecursiveBinarySearchTree<Subject> resultTree) {
        if (node == null) {
            return;
        }

        if (node.getKey().getNameSubject().compareTo(attributeValue) >= 0) {
            resultTree.insert(node.getKey());
        }

        filterHelperByName(node.getLeft(), attributeValue, resultTree);
        filterHelperByName(node.getRight(), attributeValue, resultTree);
    }

    public Major filterByCredits(Major subjects,int credits) {
        Major majorFiltered = new Major();
        RecursiveBinarySearchTree<Subject> filteredNodes = new RecursiveBinarySearchTree<>();
        filterHelperByValue(subjects.getSubjectsFromMajor().getRoot(), credits, filteredNodes);
        majorFiltered.setSubjects(filteredNodes);
        return majorFiltered;
    }

    private void filterHelperByValue(TreeNode<Subject> node, int value, RecursiveBinarySearchTree<Subject> resultTree) {
        if (node == null) {
            return;
        }

        if (node.getKey().getCreditsSubject() == value) {
            resultTree.insert(node.getKey());
        }

        if (node.getKey().getCreditsSubject() > value) {
            filterHelperByValue(node.getLeft(), value, resultTree);
        } else {
            filterHelperByValue(node.getRight(), value, resultTree);
        }
    }


    private void filterHelperByCode(TreeNode<Subject> node, int attributeValue, RecursiveBinarySearchTree<Subject> resultTree) {
        if (node == null) {
            return;
        }

        if (node.getKey().getCodeSubject() == attributeValue) {
            resultTree.insert(node.getKey());
        }

        filterHelperByCode(node.getLeft(), attributeValue, resultTree);
        filterHelperByCode(node.getRight(), attributeValue, resultTree);
    }

    public void addSubjectToMajor(Subject subject) {
        this.subjects.insert(subject);
    }

    public RecursiveBinarySearchTree<Subject> getSubjectsFromMajor() {
        return subjects;
    }



    private Subject getSubjectsHelperByName(TreeNode<Subject> root, String nameSubject) {

        if (this.getSubjectsFromMajor().getRoot() == null || (root.getKey().getNameSubject() == null ? nameSubject == null : root.getKey().getNameSubject().equals(nameSubject))) {
            return root.getKey();
        }
        if (nameSubject.compareTo(root.getKey().getNameSubject()) < 0) {
            return getSubjectsHelperByName(root.getLeft(), nameSubject);
        } else {
            return getSubjectsHelperByName(root.getRight(), nameSubject);
        }
    }

    public Subject getSubjectsFromMajorByCredits(int credits) {
        TreeNode<Subject> root = this.getSubjectsFromMajor().getRoot();
        return getSubjectsHelperByCredits(root, credits);
    }

    private Subject getSubjectsHelperByCredits(TreeNode<Subject> root, int credits) {

        if (this.getSubjectsFromMajor().getRoot() == null || (root.getKey().getCreditsSubject() == credits)) {
            return root.getKey();
        }
        if (credits < root.getKey().getCreditsSubject()) {
            return getSubjectsHelperByCredits(root.getLeft(), credits);
        } else {
            return getSubjectsHelperByCredits(root.getRight(), credits);
        }
    }

    public void addSubjectToMajor(String courseName, int courseCode, int creditSubject, int quotesSubject) {
        Subject subject = new Subject(courseName, courseCode, creditSubject, quotesSubject);
        subjects.insert(subject);
    }
    //-------Metodos estudiantes-------//

    public Student searchStudentByUser(String user) {
        return this.searchStudentByUser(students.getRoot(), user);
    }

    private Student searchStudentByUser(TreeNode<Student> node, String data) {
        if (node == null) {
            return null;
        }
        if (node.getKey().getUser().compareTo(data) == 0) {
            return node.getKey();
        } else if (data.compareTo(node.getKey().getUser()) < 0) {
            return this.searchStudentByUser(node.getLeft(), data);
        } else {
            return this.searchStudentByUser(node.getRight(), data);
        }
    }

    private Student searchStudentByName(TreeNode<Student> node, Student data) {
        node = students.getRoot();
        if (node == null) {
            return null;
        }
        if (node.getKey().getName().compareTo(data.getName()) == 0) {
            return node.getKey();
        } else if (data.getName().compareTo(node.getKey().getName()) < 0) {
            return this.searchStudentByName(node.getLeft(), data);
        } else {
            return this.searchStudentByName(node.getRight(), data);
        }
    }
    //------------------metodos imprimir arboles 
    public void printTreeSubject() {
        printTreeS(this.subjects.getRoot(), 0);
    }

    private void printTreeS(TreeNode<Subject> node, int level) {
        if (node == null) {
            return;
        }

        printTreeS(node.getRight(), level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(node.getKey().getNameSubject());

        printTreeS(node.getLeft(), level + 1);
    }
    public void printTreeStudent() {
        printTree(this.students.getRoot(), 0);
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

    public void AddStudentsToMajor(RecursiveBinarySearchTree Students, String name, int age, Major majorCurrent, String password, String user) {
        Student studentToAdd = new Student();
        studentToAdd.setName(name);
        studentToAdd.setAge(age);
        studentToAdd.setMajorCurrent(majorCurrent);
        studentToAdd.setPassword(password);
        studentToAdd.setUser(user);
        this.students.insert(studentToAdd);
    }
//---------------------------- metodos para to compare

    @Override
    public int compareTo(Major anotherMajor) {
        // comparar por nameMajor;
        return this.nameMajor.compareTo(anotherMajor.nameMajor);
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
//                timeSubjects.readByCode(i + 1000);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for readByCode(): " + elapsedTime / 1_000_000 + " ms");

            // Delete subjects by code
            startTime = System.nanoTime();
            for (int i = size; i > 0; i--) {
                //              timeSubjects.deleteByCode(i + 999);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for deleteByCode(): " + elapsedTime / 1_000_000 + " ms");

            //TODO: Añadir la medición de la implementación del Árbol
        }
    }

}

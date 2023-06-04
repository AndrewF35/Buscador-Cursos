package Data;

import DataStructures.RecursiveBinarySearchTree;
import DataStructures.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;

public class Major implements Comparable<Major> {

    private String nameMajor;//ciencias de la computacion
    private RecursiveBinarySearchTree<Subject> subjects = new RecursiveBinarySearchTree<>();//introduccion, mates,poo
    private RecursiveBinarySearchTree<Student> students = new RecursiveBinarySearchTree();
    private RecursiveBinarySearchTree<Teacher> teachers = new RecursiveBinarySearchTree();
    private HashMap<String, Admin> admins = new HashMap<>();

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

    public Subject getSubjectByName(String name) {
        TreeNode<Subject> root = this.getSubjectsFromMajor().getRoot();
        return getSubjectsHelperByName(root, name);
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

    public Subject getSubjectByCredits(int credits) {
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

    public Subject getSubjectByCode(int code) {
        TreeNode<Subject> root = this.getSubjectsFromMajor().getRoot();
        return getSubjectsHelperByValue(root, code);
    }

    private Subject getSubjectsHelperByValue(TreeNode<Subject> root, int value) {
        if (this.getSubjectsFromMajor().getRoot() != null || root.getKey().getCodeSubject() == value) {
            return root.getKey();
        }

        if (value < root.getKey().getCodeSubject()) {
            return getSubjectsHelperByValue(root.getLeft(), value);
        } else {
            return getSubjectsHelperByValue(root.getRight(), value);
        }
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
//    Metodos para administradores 

    public HashMap<String, Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(HashMap<String, Admin> admins) {
        this.admins = admins;
    }

    public void createAdmin(Admin adminToAdd) {
        String key = adminToAdd.getUser();
        this.admins.put(key, adminToAdd);
    }

    //Metodos para filtrar materias  
    public ArrayList<Subject> filterByCode(int code) {
        ArrayList<Subject> SubjectFilteredInMajor = new ArrayList<>();
        this.filterHelperByCode(this.getSubjectsFromMajor().getRoot(), SubjectFilteredInMajor, code);
        return SubjectFilteredInMajor;
    }

    private void filterHelperByCode(TreeNode<Subject> root, ArrayList<Subject> values, int code) {
        if (root == null) {
            return;
        }
        filterHelperByCode(root.getLeft(), values, code);
        if (root.getKey().getCodeSubject() == code) {
            values.add((Subject) root.getKey());
        }
        filterHelperByCode(root.getRight(), values, code);
    }

    public ArrayList<Subject> filterByName(String name) {
        ArrayList<Subject> SubjectFilteredInMajor = new ArrayList<>();
        this.filterHelperByName(this.getSubjectsFromMajor().getRoot(), SubjectFilteredInMajor, name);
        return SubjectFilteredInMajor;
    }

    private void filterHelperByName(TreeNode<Subject> root, ArrayList<Subject> values, String name) {
        if (root == null) {
            return;
        }
        filterHelperByName(root.getLeft(), values, name);
        if (root.getKey().getNameSubject().contains(name)) {
            values.add((Subject) root.getKey());
        }
        filterHelperByName(root.getRight(), values, name);
    }

    public ArrayList<Subject> filterByCredits(int credits) {
        ArrayList<Subject> SubjectFilteredInMajor = new ArrayList<>();
        this.filterHelperByCredits(this.getSubjectsFromMajor().getRoot(), SubjectFilteredInMajor, credits);
        return SubjectFilteredInMajor;
    }

    private void filterHelperByCredits(TreeNode<Subject> root, ArrayList<Subject> values, int credits) {
        if (root == null) {
            return;
        }
        filterHelperByCredits(root.getLeft(), values, credits);
        if (root.getKey().getCreditsSubject() == credits) {
            values.add((Subject) root.getKey());
        }
        filterHelperByCredits(root.getRight(), values, credits);
    }

    public void addSubjectToMajor(Subject subject) {
        this.subjects.insert(subject);
    }

    public RecursiveBinarySearchTree<Subject> getSubjectsFromMajor() {
        return subjects;
    }

    public void addSubjectToMajor(String courseName, int courseCode, int creditSubject, int quotesSubject) {
        Subject subject = new Subject(courseName, courseCode, creditSubject, quotesSubject);
        subjects.insert(subject);
    }

    //-------Metodos Profesor----------//
    public RecursiveBinarySearchTree<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(RecursiveBinarySearchTree<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Teacher> filterByTeacherName(String name) {
        ArrayList<Teacher> TeacherFilteredInMajor = new ArrayList<>();
        this.filterHelperTeacherName(this.getTeachers().getRoot(), TeacherFilteredInMajor, name);
        return TeacherFilteredInMajor;
    }

    private void filterHelperTeacherName(TreeNode<Teacher> root, ArrayList<Teacher> values, String name) {
        if (root == null) {
            return;
        }
        filterHelperTeacherName(root.getLeft(), values, name);
        if (root.getKey().getName().contains(name)) {
            values.add((Teacher) root.getKey());
        }
        filterHelperTeacherName(root.getRight(), values, name);
    }

    public ArrayList<Teacher> filterByTeacherUser(String name) {
        ArrayList<Teacher> TeacherFilteredInMajor = new ArrayList<>();
        this.filterHelperTeacherUser(this.getTeachers().getRoot(), TeacherFilteredInMajor, name);
        return TeacherFilteredInMajor;
    }

    private void filterHelperTeacherUser(TreeNode<Teacher> root, ArrayList<Teacher> values, String name) {
        if (root == null) {
            return;
        }
        filterHelperTeacherUser(root.getLeft(), values, name);
        if (root.getKey().getUser().contains(name)) {
            values.add((Teacher) root.getKey());
        }
        filterHelperTeacherUser(root.getRight(), values, name);
    }

    public ArrayList<Teacher> filterByTeacherAge(int code) {
        ArrayList<Teacher> teacherFilteredInMajor = new ArrayList<>();
        this.filterHelperTeacherAge(this.getTeachers().getRoot(), teacherFilteredInMajor, code);
        return teacherFilteredInMajor;
    }

    private void filterHelperTeacherAge(TreeNode<Teacher> root, ArrayList<Teacher> values, int code) {
        if (root == null) {
            return;
        }
        filterHelperTeacherAge(root.getLeft(), values, code);
        if (root.getKey().getAge() == code) {
            values.add((Teacher) root.getKey());
        }
        filterHelperTeacherAge(root.getRight(), values, code);
    }

    public ArrayList<Teacher> getTeacherFromMajorInArray() {
        ArrayList<Teacher> teacherInMajor = new ArrayList<>();
        this.teachers.inOrderList(teacherInMajor);
        return teacherInMajor;
    }

    public Teacher searchTeacherByUser(String user) {
        return this.searchTeacherByUser(teachers.getRoot(), user);
    }

    private Teacher searchTeacherByUser(TreeNode<Teacher> root, String data) {
        if (this.getSubjectsFromMajor().getRoot() == null || (root.getKey().getUser() == null ? data == null : root.getKey().getUser().equals(data))) {
            return root.getKey();
        }
        if (data.compareTo(root.getKey().getUser()) < 0) {
            return searchTeacherByUser(root.getLeft(), data);
        } else {
            return searchTeacherByUser(root.getRight(), data);
        }
    }

    public void AddTeachersToMajor(Teacher teacherToAdd) {
        this.teachers.insert(teacherToAdd);
    }

    public void AddTeachersToMajor(RecursiveBinarySearchTree Students, String name, int age, ArrayList<Subject> Subject, String password, String user) {
        Teacher teacherToAdd = new Teacher();
        teacherToAdd.setName(name);
        teacherToAdd.setAge(age);
        teacherToAdd.setCurrentSubjects(Subject);
        teacherToAdd.setPassword(password);
        teacherToAdd.setUser(user);
        this.teachers.insert(teacherToAdd);
    }

    //-------Metodos estudiantes-------//
    
    public ArrayList<Student> filterByStudentMajor(String name) {
        ArrayList<Student> FilteredInMajor = new ArrayList<>();
        this.filterHelperStudentMajor(this.getStudentsTree().getRoot(), FilteredInMajor, name);
        return FilteredInMajor;
    }

    private void filterHelperStudentMajor(TreeNode<Student> root, ArrayList<Student> values, String name) {
        if (root == null) {
            return;
        }
        filterHelperStudentMajor(root.getLeft(), values, name);
        if (root.getKey().getMajorCurrent().getNameMajor().contains(name)) {
            values.add((Student) root.getKey());
        }
        filterHelperStudentMajor(root.getRight(), values, name);
    }
    
    public ArrayList<Student> filterByStudentName(String name) {
        ArrayList<Student> FilteredInMajor = new ArrayList<>();
        this.filterHelperStudentName(this.getStudentsTree().getRoot(), FilteredInMajor, name);
        return FilteredInMajor;
    }

    private void filterHelperStudentName(TreeNode<Student> root, ArrayList<Student> values, String name) {
        if (root == null) {
            return;
        }
        filterHelperStudentName(root.getLeft(), values, name);
        if (root.getKey().getName().contains(name)) {
            values.add((Student) root.getKey());
        }
        filterHelperStudentName(root.getRight(), values, name);
    }

    public ArrayList<Student> filterByStudentUser(String name) {
        ArrayList<Student> FilteredInMajor = new ArrayList<>();
        this.filterHelperStudentUser(this.getStudentsTree().getRoot(), FilteredInMajor, name);
        return FilteredInMajor;
    }

    private void filterHelperStudentUser(TreeNode<Student> root, ArrayList<Student> values, String name) {
        if (root == null) {
            return;
        }
        filterHelperStudentUser(root.getLeft(), values, name);
        if (root.getKey().getUser().contains(name)) {
            values.add((Student) root.getKey());
        }
        filterHelperStudentUser(root.getRight(), values, name);
    }

    public ArrayList<Student> filterByStudentAge(int code) {
        ArrayList<Student> FilteredInMajor = new ArrayList<>();
        this.filterHelperStudentAge(this.getStudentsTree().getRoot(), FilteredInMajor, code);
        return FilteredInMajor;
    }

    private void filterHelperStudentAge(TreeNode<Student> root, ArrayList<Student> values, int code) {
        if (root == null) {
            return;
        }
        filterHelperStudentAge(root.getLeft(), values, code);
        if (root.getKey().getAge() == code) {
            values.add((Student) root.getKey());
        }
        filterHelperStudentAge(root.getRight(), values, code);
    }
    
    public Student searchStudentByUser(String user) {
        return this.searchStudentByUser(this.students.getRoot(), user);
    }

    private Student searchStudentByUser(TreeNode<Student> root, String data) {
        if (this.getSubjectsFromMajor().getRoot() == null || (root.getKey().getUser() == null ? data == null : root.getKey().getUser().equals(data))) {
            return root.getKey();
        }
        if (data.compareTo(root.getKey().getUser()) < 0) {
            return searchStudentByUser(root.getLeft(), data);
        } else {
            return searchStudentByUser(root.getRight(), data);
        }
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

    public void printTreeTeacher() {
        printTreeT(this.teachers.getRoot(), 0);
    }

    private void printTreeT(TreeNode<Teacher> node, int level) {
        if (node == null) {
            return;
        }

        printTreeT(node.getRight(), level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(node.getKey().getName());

        printTreeT(node.getLeft(), level + 1);
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

package com.initial;

import Data.DataGenerator;
import Data.Major;
import Data.Subject;
import GUI.login;
import java.util.Random;
import java.util.ArrayList;
import java.util.Stack;

public class main {

    public static ArrayList<Major> majorsInUniversity = new ArrayList<>();
    public static Major DataInUniversity = new Major();
    public static Major Biologia = new Major();
    public static Major IngenieriaDeSistemas = new Major();

    public static void main(String args[]) {

        majorsInUniversity.add(DataInUniversity);
        majorsInUniversity.add(Biologia);
        majorsInUniversity.add(IngenieriaDeSistemas);
        
        DataInUniversity.setNameMajor("Todas las materias");
        Biologia.setNameMajor("Biologia");
        IngenieriaDeSistemas.setNameMajor("Ingenieria De Sistemas");
        
        int numCoursesToGenerate = 10; // Cantidad de cursos a generar
        int numStudentsToGenerate = 10;   // Cantidad de Estudiantes a generar hasta el momento alcanza un maximo en 10 000 usuarios 
        int numTeachersToGenerate = 10;   // Cantidad de Estudiantes a generar hasta el momento alcanza un maximo en 10 000 usuarios 

        for (int i = 0;
                i < numCoursesToGenerate;
                i++) {

            DataInUniversity.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
        }
        for (int i = 0;
                i < 30;
                i++) {

            Biologia.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
        }
        
        for (int i = 0;
                i < numStudentsToGenerate;
                i++) {
            DataInUniversity.AddStudentsToMajor(DataGenerator.generateRandomStudent(i));
        }
        for (int i = 0;
                i < numTeachersToGenerate;
                i++) {
            DataInUniversity.AddTeachersToMajor(DataGenerator.generateRandomTeacher(i));
        }
                      
        DataInUniversity.printTreeStudent();
        DataInUniversity.printTreeSubject();
        DataInUniversity.printTreeTeacher();

        System.out.println(DataInUniversity.getStudentsFromMajorInArray().get(1).getUser());
        System.out.println(DataInUniversity.getStudentsFromMajorInArray().get(1).getPassword());
        
        System.out.println(DataInUniversity.getTeacherFromMajorInArray().get(1).getUser());
        System.out.println(DataInUniversity.getTeacherFromMajorInArray().get(1).getPassword());

        login newLogin = new login();
        newLogin.setVisible(
                true);
    }
}

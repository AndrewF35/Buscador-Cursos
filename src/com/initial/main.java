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
    public static Major subjectsInUniversity = new Major();
    public static Major Biologia = new Major();
    public static Major IngenieriaDeSistemas = new Major();

    public static void main(String args[]) {

        majorsInUniversity.add(subjectsInUniversity);
        majorsInUniversity.add(Biologia);
        majorsInUniversity.add(IngenieriaDeSistemas);
        
        subjectsInUniversity.setNameMajor("Todas las materias");
        Biologia.setNameMajor("Biologia");
        IngenieriaDeSistemas.setNameMajor("Ingenieria De Sistemas");
        
        int numCoursesToGenerate = 10000; // Cantidad de cursos a generar
        int numStudentsToGenerate = 100;   // Cantidad de Estudiantes a generar hasta el momento alcanza un maximo en 10 000 usuarios 
        
        for (int i = 0;
                i < numCoursesToGenerate;
                i++) {

            subjectsInUniversity.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
        }
        for (int i = 0;
                i < 30;
                i++) {

            Biologia.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
        }
        
        for (int i = 0;
                i < numStudentsToGenerate;
                i++) {
            subjectsInUniversity.AddStudentsToMajor(DataGenerator.generateRandomStudent(i));
        }
                      
        subjectsInUniversity.printTreeStudent();
        subjectsInUniversity.printTreeSubject();
        System.out.println(subjectsInUniversity.getStudentsFromMajorInArray().get(1).getUser());
        System.out.println(subjectsInUniversity.getStudentsFromMajorInArray().get(1).getPassword());

        login newLogin = new login();
        newLogin.setVisible(
                true);
    }
}

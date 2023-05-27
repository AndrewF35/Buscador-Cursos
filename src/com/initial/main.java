package com.initial;

import Data.DataGenerator;
import Data.Major;
import GUI.login;
import java.util.ArrayList;

public class main {

    public static ArrayList<Major> majorsInUniversity = new ArrayList<>();
    public static Major subjectsInUniversity = new Major();
    public static Major Biologia = new Major();
    public static Major IngenieriaDeSistemas = new Major();

    public static void main(String args[]) {

        majorsInUniversity.add(subjectsInUniversity);
        majorsInUniversity.add(Biologia);
        majorsInUniversity.add(IngenieriaDeSistemas);
        
        subjectsInUniversity.setNameMajor("");
        Biologia.setNameMajor("Biologia");
        IngenieriaDeSistemas.setNameMajor("Ingenieria De Sistemas");
        
        int numCoursesToGenerate = 100000; // Cantidad de cursos a generar
        int numStudentsToGenerate = 10;    // Cantidad de Estudiantes a generar
        
        for (int i = 0;
                i < numCoursesToGenerate;
                i++) {

            subjectsInUniversity.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
        }
        
        for (int i = 0;
                i < numStudentsToGenerate;
                i++) {
            subjectsInUniversity.AddStudentsToMajor(DataGenerator.generateRandomStudent(i));
        }

        System.out.println(subjectsInUniversity.readAllByName());
        System.out.println(subjectsInUniversity.getSubjectsFromMajor().size());
        
        for(int i=0;i<subjectsInUniversity.getStudentsFromMajorInArray().size();i++){
            System.out.print(subjectsInUniversity.getStudentsFromMajorInArray().get(i).getName());
        }

        System.out.println(subjectsInUniversity.getStudentsFromMajorInArray().size());
        
        System.out.println(subjectsInUniversity.getStudentsFromMajorInArray().get(1).getUser());
        System.out.println(subjectsInUniversity.getStudentsFromMajorInArray().get(1).getPassword());
        
        subjectsInUniversity.getStudentsTree().inOrder();
        subjectsInUniversity.printTreeByName();

        login newLogin = new login();

        newLogin.setVisible(
                true);
    }
}

package com.initial;

import Data.DataGenerator;
import Data.Major;
import GUI.login;


public class main {
    
    public static Major subjects = new Major();
    public static void main(String args[]) {
        int numCoursesToGenerate = 100000; // Cantidad de cursos a generar
        
        for (int i = 0; i < numCoursesToGenerate; i++) {
            subjects.addSubjectToMajor(DataGenerator.generateRandomCourses(i));
        }
        
        System.out.println(subjects.readAllByName());
        System.out.println(subjects.getSubjectsFromMajor().size());
        
        login newLogin = new login();
        newLogin.setVisible(true);
    }
}

package com.initial;

import Data.Major;

import static Data.DataGenerator.generateRandomCourses;

public class TestClass {
    public static Major subjects = new Major();
    public static void main(String[] args) {
        int[] testSizes = {10000, 100000, 1000000, 10000000};

/*
        //Código de prueba para los métodos  a evaluar
        subjects.addSubjectToMajor(generateSubject(0));
        subjects.addSubjectToMajor(generateSubject(1));
        subjects.addSubjectToMajor(generateSubject(2));
        subjects.addSubjectToMajor(generateSubject(3));
        subjects.addSubjectToMajor(generateSubject(4));
        subjects.addSubjectToMajor(generateSubject(5));
        System.out.println(subjects.readAllByName());

        System.out.println(subjects.readByCode(1000).getNameSubject());
        System.out.println(subjects.readByCode(1001).getNameSubject());
        System.out.println(subjects.readByCode(1002).getNameSubject());
        System.out.println(subjects.readByCode(1003).getNameSubject());
        System.out.println(subjects.readByCode(1004).getNameSubject());
        System.out.println(subjects.readByCode(1005).getNameSubject());
        System.out.println(subjects.readByCode(1005).getCodeSubject());
        subjects.deleteByCode(1005);
        System.out.println(subjects.readAllByName());
*/




        for (int size : testSizes) {
            System.out.println("Testing with " + size + " courses:");
            long startTime, endTime, elapsedTime;

            // Add subjects
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                subjects.addSubjectToMajor(generateRandomCourses(i));
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for addSubjectToMajor(): " + elapsedTime / 1_000_000 + " ms");

            // Read subjects by code
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                subjects.readByCode(i+1000);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for readByCode(): " + elapsedTime / 1_000_000 + " ms");

            // Delete subjects by code
            startTime = System.nanoTime();
            for (int i = size; i > 0; i--) {
                subjects.deleteByCode(i+999);
            }
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            System.out.println("Time for deleteByCode(): " + elapsedTime / 1_000_000 + " ms");
        }

    }


}

package com.initial;

import Data.Admin;
import Data.Major;
import GUI.SetData;
import java.util.ArrayList;

public class main {

    public static ArrayList<Major> majorsInUniversity = new ArrayList<>();
    public static Major DataInUniversity = new Major();

    public static void main(String args[]) {

        majorsInUniversity.add(DataInUniversity);
        DataInUniversity.setNameMajor("Todas las materias");
        DataInUniversity.createAdmin(new Admin("AdminTest", "user","1234"));

        SetData newsetData = new SetData();
        newsetData.setVisible(
                true);
    }
}

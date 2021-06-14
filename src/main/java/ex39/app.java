package ex39;

import java.util.HashMap;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.HashMap;

public class app {

    public static void main(String[] args) {

        String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        sortArray(lastNames);

        HashMap<String, employee>  employees = new HashMap<String, employee>();
        employees.put(lastNames[0], createEmployee("Jacquelyn", "Jackson", "DBA", ""));
        employees.put(lastNames[1], createEmployee("Jake", "Jacobson", "Programmer", ""));
        employees.put(lastNames[2], createEmployee("John", "Johnson", "Manager", "2016-12-31"));
        employees.put(lastNames[3], createEmployee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employees.put(lastNames[4], createEmployee("Sally", "Webber", "Web Developer","2015-12-18" ));
        employees.put(lastNames[5], createEmployee("Tou", "Xiong", "Software Engineer", "2016-10-05"));

        System.out.println("Name                 | Position          | Separation Date");
        System.out.println("---------------------|-------------------|----------------");
        System.out.println(employees.get(lastNames[0]).firstName + " " + employees.get(lastNames[0]).lastName + "    | " + employees.get(lastNames[0]).position + "               | " + employees.get(lastNames[0]).separationDate);
        System.out.println(employees.get(lastNames[1]).firstName + " " + employees.get(lastNames[1]).lastName + "        | " + employees.get(lastNames[1]).position + "        | " + employees.get(lastNames[1]).separationDate);
        System.out.println(employees.get(lastNames[2]).firstName + " " + employees.get(lastNames[2]).lastName + "         | " + employees.get(lastNames[2]).position + "           | " + employees.get(lastNames[2]).separationDate);
        System.out.println(employees.get(lastNames[3]).firstName + " " + employees.get(lastNames[3]).lastName + "  | " + employees.get(lastNames[3]).position + "  | " + employees.get(lastNames[3]).position);
        System.out.println(employees.get(lastNames[4]).firstName + " " + employees.get(lastNames[4]).lastName + "         | " + employees.get(lastNames[4]).position + "     | " + employees.get(lastNames[4]).separationDate);
        System.out.println(employees.get(lastNames[5]).firstName + " " + employees.get(lastNames[5]).lastName + "            | " + employees.get(lastNames[5]).position + " | " + employees.get(lastNames[5]).separationDate);

    }

    public static void sortArray(String[] lastNames) {

        String temp;
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {

                if (lastNames[i].compareTo(lastNames[j]) > 0) {

                    temp = lastNames[i];
                    lastNames[i] = lastNames[j];
                    lastNames[j] = temp;
                }
            }
        }
    }

    public static employee createEmployee(String firstName, String lastName, String position, String separationDate){

        employee ret = new employee();

        ret.firstName = firstName;
        ret.lastName = lastName;
        ret.position = position;
        ret.separationDate = separationDate;

        return ret;
    }


}

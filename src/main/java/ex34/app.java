package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;

public class app {

    public static void main(String[] args){
        String[] employees={"John Smith","Jackie Jackson","Chris Johns","Amanda Cullen","Jeremy Goodwin"};

        printList(employees);

        System.out.print("Enter an employee name to remove: ");

        Scanner in=new Scanner(System.in);

        String remove=in.nextLine();

        printList(removeEmployee(employees, remove));

    }

    public static String[] removeEmployee(String[] employee, String remove){
        String[] newlist= new String[employee.length-1];
        int index=0;
        for(int i=0; i<employee.length;i++){
            if(!employee[i].equals(remove)){
                newlist[index]=employee[i];
                index++;
            }
        }
        return newlist;
    }
    public static void printList(String[] employees) {
        System.out.println("There are "+employees.length+" employees:");
        for(int i=0; i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }
}

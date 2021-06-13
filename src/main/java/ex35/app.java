package ex35;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;
import java.util.ArrayList;
import java.lang.Math;

public class app {

    public static void main(String[] args){
        ArrayList<String> people= new ArrayList<String>();

        Scanner in=new Scanner(System.in);

        System.out.print("Enter a name: ");
        String person=in.nextLine();

        while(person!=""){
            people.add(person);
            System.out.print("Enter a name: ");
            person=in.nextLine();
        }

        int rand=(int)Math.floor(Math.random()*(people.size()-0+1)+0);

        System.out.print("The winner is... "+getPerson(people, rand)+".");
    }

    public static String getPerson(ArrayList<String> people, int random){
        return people.get(random);
    }


}

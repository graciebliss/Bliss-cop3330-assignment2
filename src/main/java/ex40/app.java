package ex40;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class app {

    public static void main(String[] args){
        String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String[] firstNames ={"John","Tou","Michaela","Jake","Jacquelyn","Sally"};

        ArrayList<String> last=new ArrayList<String>();
        ArrayList<String> first=new ArrayList<String>();

        System.out.print("Enter a search string: ");
        Scanner in=new Scanner(System.in);
        String search=in.nextLine();

        for(int i=0; i< lastNames.length;i++){
            if(lastNames[i].toLowerCase().contains(search.toLowerCase()) || firstNames[i].toLowerCase().contains(search.toLowerCase())){
                last.add(lastNames[i]);
                first.add(firstNames[i]);
            }
        }

        HashMap<String, employee> employees = new HashMap<String, employee>();

        for(int i=0; i<last.size(); i++){
            if(last.get(i).equals("Jackson")){
                employees.put(last.get(i), createEmployee("Jacquelyn", "Jackson", "DBA", ""));
            }
            if(last.get(i).equals("Jacobson")){
                employees.put(last.get(i), createEmployee("Jake", "Jacobson", "Programmer", ""));
            }
            if(last.get(i).equals("Johnson")) {
                employees.put(last.get(i), createEmployee("John", "Johnson", "Manager", "2016-12-31"));
            }
            if(last.get(i).equals("Michaelson")){
                employees.put(last.get(i), createEmployee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
            }
            if(last.get(i).equals("Webber")){
                employees.put(last.get(i), createEmployee("Sally", "Webber", "Web Developer","2015-12-18" ));
            }
            if(last.get(i).equals("Xiong")){
                employees.put(last.get((i)), createEmployee("Tou", "Xiong", "Software Engineer", "2016-10-05"));

            }
        }
        for(int i=0; i<last.size();i++){
            System.out.println(employees.get(last.get(i)).firstName + " " + employees.get(last.get(i)).lastName + " " + employees.get(last.get(i)).position + " " + employees.get(last.get(i)).separationDate);
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

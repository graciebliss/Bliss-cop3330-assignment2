package ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */

import java.util.*;
import java.lang.Math;

public class app {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String[] choices={"Yes.","No.","Maybe.","Ask again later."};

        System.out.println("What is your question?");

        String question=in.nextLine();

        String answer=getChoice(choices, getRandom());
    }

    public static String getChoice(String[] choices, int random){

        return choices[random];
    }

    public static int getRandom(){
        int rand=(int)Math.floor(Math.random()*(3-0+1)+0);
        return rand;
    }

}


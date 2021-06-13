package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */


import java.util.*;
import java.lang.Math;


public class app {
    public static void main(String[] args){
        PaymentCalculator pay=new PaymentCalculator();

        int months=pay.calculateMonthsUntilPayoff();

        System.out.print("It will take you "+months+" months to pay off this card.");
    }


}

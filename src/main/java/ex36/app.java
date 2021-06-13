package ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */


import java.util.*;
import java.util.ArrayList;
import java.lang.Math;

public class app {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<Integer>();

        Scanner in=new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number=in.nextLine();

        while(!number.equals("done")){
            nums.add(Integer.parseInt(number));

            System.out.print("Enter a number: ");
            number=in.nextLine();
        }

        System.out.print("Numbers: ");

        if(nums.size()!=0) {
            System.out.print(nums.get(0));
        }
        for(int i=1;i<nums.size(); i++){
            System.out.print(", "+nums.get(i));
        }

        System.out.print("\nThe average is: "+average(nums)+"\nThe minimum is: "+min(nums)+"\nThe maximum is: "+max(nums)+"\nThe standard deviation is: "+String.format("%.2f",std(nums)));

    }

    public static int min(ArrayList<Integer> nums){
        int smallest=0;
        if(nums.size()>0) {
            smallest = nums.get(0);
        }
        for(int i=0; i<nums.size(); i++){
            if(smallest>=nums.get(i)){
                smallest=nums.get(i);
            }
        }
        return smallest;
    }

    public static int max(ArrayList<Integer> nums){
        int largest=0;
        for(int i=0; i<nums.size(); i++){
            if(largest<=nums.get(i)){
                largest=nums.get(i);
            }
        }
        return largest;
    }

    public static double average(ArrayList<Integer> nums){
        double average=0;
        for(int i=0; i<nums.size(); i++){
            average+=nums.get(i);
        }
        average=average/(double)nums.size();
        return average;
    }

    public static double std(ArrayList<Integer> nums){
        double sum=0;
        double mean=average(nums);
        for(int i=0; i<nums.size(); i++){
            sum+=(nums.get(i)-mean)*(nums.get(i)-mean);
        }

        double sd=Math.sqrt(sum/nums.size());

        sd=Math.round(sd*100.0)/100.0;

        return sd;
    }


}

package ex37;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gracie Bliss
 */


import java.util.*;

public class app {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length=in.nextInt();

        System.out.print("How many special characters? ");
        int special=in.nextInt();

        System.out.print("How many numbers? ");
        int num=in.nextInt();

        int min=(special+num)*2;

        int len=length;

        if(min>length){
            len=min;
        }

        String[] alphabet={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] nums={0,1,2,3,4,5,6,7,8,9};
        String[] specials={"!","%","&","*"};

        ArrayList<String> password=new ArrayList<String>();
        int rand;

        for(int i=0; i<num; i++){
            rand=(int)Math.floor(Math.random()*(9-0+1)+0);
            password.add(Integer.toString(nums[rand]));
        }

        for(int i=0; i<special; i++){
            rand=(int)Math.floor(Math.random()*(3-0+1)+0);
            password.add(specials[rand]);
        }

        for(int i=0; i<len-(num+special); i++){
            rand=(int)Math.floor(Math.random()*(25-0+1)+0);
            password.add(alphabet[rand]);
        }

        System.out.print("Your password is "+createPassword(password));


    }

    public static String createPassword(ArrayList<String> pass){
        String finalPass="";
        int rand;
        int size=pass.size();
        while(size>0) {
            rand = (int) Math.floor(Math.random() * ((size-1) - 0 + 1) + 0);
            finalPass += pass.get(rand);
            pass.remove(pass.get(rand));
            size--;
        }
        System.out.print(finalPass);
        return finalPass;
    }
}

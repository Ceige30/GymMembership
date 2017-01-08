package com.company;
//Maker's Note
//Sorry I didn't use the superclass personally I felt it easier to not use it for my program
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customerCheck nc = new customerCheck();
        totalCost tc = new totalCost();

        String answerM = "";
        boolean loop = true;
        while(loop) {
            System.out.println("Are you a customer, member or employee?");
            try {
                answerM = sc.nextLine().toLowerCase();
                if (answerM.equals("customer") || answerM.equals("member") || answerM.equals("employee"))
                    loop = false;
            } catch (InputMismatchException ERROR) {}
        }
            nc.getMembership(answerM);
            System.out.println(tc.totCost);
            loop = true;
            String answerC = "";


        while(loop){
            System.out.println("Would you be interested in taking a class?");
            try {
                answerC = sc.nextLine().toLowerCase();
                if (answerC.equals("no") || answerC.equals("yes"))
                    loop = false;
            } catch (InputMismatchException ERROR) {}
        }
            nc.getClasses(answerC,answerM);
            loop = true;
            int answerGranola = 0;
        while(loop){
            System.out.println("How many granola bars would you like? You may not have more than 5.");
            try {
                answerGranola = sc.nextInt();
                if (answerGranola == 1 || answerGranola==2 || answerGranola== 3 || answerGranola== 4 || answerGranola==5)
                    loop = false;
            } catch (InputMismatchException ERROR) {}
        }
            nc.gerGranola(answerGranola,answerM);
            loop = true;
            int answerGator = 0;
        while(loop){
            System.out.println("How many gatorades would you like? You may not have more than 5.");
            try {
                answerGator = sc.nextInt();
                if (answerGator == 1 || answerGator==2 || answerGator== 3 || answerGator== 4 || answerGator==5)
                    loop = false;
            } catch (InputMismatchException ERROR) {}
        }
            nc.getGator(answerGator,answerM);
            loop = true;
            String answerAquatics = "";
            Scanner sc2 = new Scanner(System.in);
        while(loop){
            if(answerM.equals("customer"))
                break;
            System.out.println("Would you be interested in taking an aquatics class?");
            try {
                answerAquatics = sc2.nextLine().toLowerCase();
                if (answerAquatics.equals("no") || answerAquatics.equals("yes"))
                    loop = false;
            } catch (InputMismatchException ERROR) {}
        }
            nc.getAquatic(answerAquatics, answerM);
            loop = false;
            int answerTrainer = 0;
        while(loop){
            System.out.println("How many hours would you like for a trainer? You may not have more than 5.");
            try {
                answerTrainer = sc.nextInt();
                if (answerTrainer == 1 || answerTrainer==2 || answerTrainer== 3 || answerTrainer== 4 || answerTrainer==5)
                    loop = false;
            } catch (InputMismatchException ERROR) {}
        }
        System.out.println("Your total Cost is $"+tc.totCost);
    }
}

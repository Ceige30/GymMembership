package com.company;
import java.util.*;

public class customerCheck {
    Scanner sc = new Scanner(System.in);
    public String response = "";
    boolean test = true;
    totalCost tc = new totalCost();

    void getMembership(String antM){
        if(antM.equals("customer")){
            while (test) {
                System.out.println("Would you like to buy a membership");
                response = sc.nextLine().toLowerCase();
                if (response.equals("yes"))
                    tc.increaseCost(65.0);
                    test = false;
            }
        }
    }void getClasses(String antC,String antm){
        if(antC.equals("yes")){
            if(antm.equals("customer")){
                tc.increaseCost(10);
            }else if(antm.equals("member")){
                tc.increaseCost(8);
            }else if(antm.equals("employee")){
                tc.increaseCost(3);
            }
        }
    }void gerGranola(int antGra,String antM){
        if(antM.equals("customer")){
            tc.increaseCost(1*antGra*1);
        }else if(antM.equals("member") || antM.equals("employee")){
            tc.increaseCost(1*antGra*.8);
        }
    }void getGator(int antGat,String antM){
        if(antM.equals("customer")){
            tc.increaseCost(2*antGat*1);
        }else if(antM.equals("member") || antM.equals("employee")){
            tc.increaseCost(2*antGat*.8);
        }
    }void getAquatic(String antAqu,String antm){
        if(antAqu.equals("yes")){
            if(antm.equals("member")){
                tc.increaseCost(10);
            }else if(antm.equals("employee")){
                tc.increaseCost(7);
            }
        }
    }void getTrainer(int antTrain,String antM){
        if(antM.equals("customer")){
            tc.increaseCost(25*antTrain);
        }else if(antM.equals("member")){
            tc.increaseCost(20*antTrain);
        }else if(antM.equals("employee"))
            tc.increaseCost(20*antTrain);
}
}

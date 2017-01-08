package com.company;
import java.util.*;

public class totalCost {
    public static double totCost;
    public totalCost(){
        totCost = 0;
    }
    void increaseCost(double thing){
        totCost += thing;
    }
}

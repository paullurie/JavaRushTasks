package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner max = new Scanner(System.in);
        double num1 = max.nextDouble();
        double num2 = max.nextDouble();
        
        
        if (Math.abs(num1-num2)<=0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}

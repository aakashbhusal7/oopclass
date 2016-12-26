 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oopfundamentals;

import com.leapfrog.oopfundamentals.test.Animal;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maxVal=0;
        double minVal=0;
        
            while(true){
            
            System.out.println("Enter marks for Nepali:");
            int n = input.nextInt();
            System.out.println("Enter marks for English:");
            int e = input.nextInt();
            System.out.println("Enter marks for Mathematics:");
            int m = input.nextInt();
            System.out.println("Enter marks for Science:");
            int s = input.nextInt();
            System.out.println("Enter marks for Computer:");
            int c = input.nextInt();
            double total = n + e + m + s + c;
            System.out.println("The total marks obtained is:" + total);
            if (n >= 40 && e >= 40 && m >= 40 && s >= 40 && c >= 40) {
                System.out.println("Result: PASSED");
                double percentage = (total / 500)*100;
            System.out.println("The percenatge is: " + percentage);
            char grade;
            if (percentage >= 80) {
                grade = 'A';
            } else if (percentage >= 70 && percentage < 80) {
                grade = 'B';
            } else if (percentage >= 60 && percentage < 70) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("the grade is:" + grade);
             
               if(total> maxVal){
                   maxVal=total;
               }
               if(total<minVal){
                   minVal=total;
               }
               
            } else {
                System.out.println("Result: Failed");
                
            }
            System.out.println("Do you want to continue[y/n]");
           String check= input.next();
           if (check.equalsIgnoreCase("n")){
               System.out.println("The maximum total is: "+ maxVal);
               System.out.println("the minimum total is: " + minVal);
               
        
               System.exit(n);           
           }
        }
         
    }
    }

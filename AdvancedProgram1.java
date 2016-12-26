/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oopfundamentals;

import com.leapfrog.oopfundamentals.util.ResultPublisher;
import java.util.Scanner;

public class AdvancedProgram1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] students = {"Aakash","ram"};
        String[] subjects = {"science","maths","computer"};
        int[][] marks = new int[students.length][subjects.length];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Marks entry of "+ students[i]);
            for (int j = 0; j < subjects.length; j++) {
                System.out.println("Enter marks for " + subjects[j]);
               marks[i][j]=input.nextInt();
            }
        }
        ResultPublisher publisher= new ResultPublisher(subjects);
       
        for(int i=0; i<students.length;i++){
            publisher.setMarks(marks[i]);
        System.out.println("Total marks is" + publisher.getTotal());
        if (!publisher.isFail()){
            System.out.println("The percentage is " + publisher.getPercentage());
            System.out.println("The grade is "+ publisher.getGrade() );
        }
        else{
            System.out.println("the result is failed");
        }
        }
    }

}

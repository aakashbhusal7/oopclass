/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oopfundamentals.util;

/**
 *
 * @author Dell
 */
public class ResultPublisher {
    int passMark=40, fullMark=100;
    
    String[] subjects;
    int[] marks;
    
    public ResultPublisher(String[]subjects){
        this.subjects=subjects;
    }
    
    public ResultPublisher(String[]subjects, int[]marks){
        this.subjects= subjects;
        this.marks=marks;
    }
    
    public void setMarks(int[] marks){
        this.marks=marks;
    }
    public double getTotal(){
        double total=0;
        for(int i=0;i<subjects.length;i++){
            total += marks[i];
        }
        return total;
    }
    boolean isFail= false;
    public boolean isFail(){
        for(int i=0;i<subjects.length;i++){
            if(marks[i]< passMark){
                return true;
            }
        }
        return false;
    }
    
    public double getPercentage(){
        return(getTotal()/subjects.length)*100;
    }
    
    public String getGrade(){
        double percentage= getPercentage();
        if(percentage>=80){
            return("Distinction");
        }
        else if(percentage>=65 && percentage<80){
            return("First Division");
        }
        else if(percentage>=40 && percentage<65){
            return ("Second Division");
        }
        else{
            return null;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.oopfundamentals;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class power {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number");
        int z= s.nextInt();
        System.out.println("power?");
        int p= s.nextInt();
        int res=1;
        for (int i=p;i>=1;i--){
            res=res*z;
        }
        System.out.println(res);
    }
}

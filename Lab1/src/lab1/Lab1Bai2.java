/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Doan Minh
 */
public class Lab1Bai2 {
    public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);
            System.out.printf("Chiều dài: ");
            float a = abc.nextFloat();
            System.out.printf("Chiều rộng: ");
            float b = abc.nextFloat();
            float CV = ((a + b) * 2);
            float DT = (a * b);
            float CNN = Math.min(a,b);
            System.out.printf("CV:%.1f DT:%.1f Min:%.1f",CV,DT,CNN);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3bai1;

import java.util.Scanner;

/**
 *
 * @author Doan Minh
 */
public class Lab3Bai2 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        for(int i = 1; i <=10;i++)
        {
            System.out.print("-----------------------\n");  
            for(int j = 1; j <=10; j++)
            {
                System.out.printf("%d x %d  =%d\n",i,j,i*j);
            }
        }          
                
    }
    
}

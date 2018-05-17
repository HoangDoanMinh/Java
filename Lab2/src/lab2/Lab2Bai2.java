/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Doan Minh
 */
public class Lab2Bai2 {
            public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);
            System.out.printf("Nhập vào a: ");
            String S1 = abc.nextLine();
            int a = Integer.parseInt(S1);
            System.out.printf("Nhập vào b: ");
            int b = Integer.parseInt(abc.nextLine());
             System.out.printf("Nhập vào c: ");
            String S2 = abc.nextLine();
            int c = Integer.parseInt(S2);
            if(a ==0){
                        if(b==0){
                                   if(c==0){
                                         System.out.printf("Phương trình vô số nghiệm");
                                  }
                                  else
                                        System.out.printf("Phương trình vô nghiệm");
                                     }
                        else 
                       {
                           float x = -c/b;
                           System.out.printf("Nghiệm của phương trình là: %.1f\n", x);
                       }
            }
             else
             {
                     float x1, x2;
                     float Delta = (float) (Math.pow(b, 2) - 4 * a * c);
                     if(Delta <0)
                     {
                            System.out.println("Vô nghiệm");
                     }
                     if(Delta == 0)
                     {
                         float x= -b/(2 * a);
                         System.out.printf("Nghiệm kép: %.1f",x);
                       }
                        if  (Delta  > 0)
                             {
                                  x1 = (float) ((-b+Math.sqrt(Delta))/(2 * a));
                                  x2 = (float) ((-b-Math.sqrt(Delta))/(2 * a));
                                 System.out.printf("Phương trình có 2 nghiệm phân biệt: \nx1= %f\n x2 = %f\n",x1,x2);
                             }
             }
            }
}

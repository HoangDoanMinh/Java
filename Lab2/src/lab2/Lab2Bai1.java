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
public class Lab2Bai1 {
      public static void main(String[] args) {
        // TODO code application logic here
            Scanner abc = new Scanner(System.in);
            System.out.printf("Nhập vào a: ");
            String s1 =abc.nextLine();
            int a = Integer.parseInt(s1);
            System.out.printf("Nhập vào b: ");
            String s2 = abc.nextLine();
            int b = Integer.parseInt(s2);
            if(a==0)
                {
                    if(b==0)
                        {
                            System.out.printf("Phương trình vô số nghiệm");
                        }
                    else
                        System.out.printf("Phương trình vô nghiệm");
                }
            else 
                {
                    float x = -b/a;
                    System.out.printf("Nghiệm của phương trình là: %.1f\n", x);
                }
      }
}

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
public class Lab1Bai4 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.printf("Nhập vào a: ");
        String s1 = abc.nextLine();
        float a = Float.parseFloat(s1);
        System.out.printf("Nhập vào b: ");
        String s2 = abc.nextLine();
        float b = Float.parseFloat(s2);
        System.out.printf("Nhập vào c: ");
        String s3 = abc.nextLine();
        float c = Float.parseFloat(s3);
        float Delta = (float) (Math.pow(b, 2) - 4 * a * c);
        System.out.printf("Giá trị Delta là: %.1f\nCăn Delta = %.1f\n",Delta, Math.sqrt(Delta));
    
}
}
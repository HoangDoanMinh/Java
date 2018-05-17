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
public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Nhap vao canh cua khoi lap phuong: ");
        String lp = abc.nextLine();
        float a = Float.parseFloat(lp);
        double TT =  Math.pow(a, 3);
        System.out.printf("Thể tích khối lập phương là: %.1f\n",TT);

    }
}

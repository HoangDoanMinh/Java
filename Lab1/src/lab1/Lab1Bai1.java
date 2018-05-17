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
public class Lab1Bai1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc = new Scanner(System.in);
        System.out.printf("Họ và Tên: ");
        String hoten = abc.nextLine();
        System.out.printf("Điểm TB: ");
        double diemTB = abc.nextDouble();
        System.out.printf("Ten:%s điểm:%.0f\n",hoten,diemTB);
    }
}

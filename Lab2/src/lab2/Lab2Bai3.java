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
public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.printf("Nhập vào số điện của tháng: ");       
        int d = Integer.parseInt(abc.nextLine());
        int tien;
        if(d < 50)
        {
            tien = d*1000;
            System.out.printf("Số tiền điện phải trả với mức dưới 50 là: %d\n",tien);
        }
        else
        {
             tien = 50 * 1000 + (d - 50)*1200;
            System.out.printf("Số tiền điện phải trả với mức điện trên 50 là: %d\n",tien);
        }
    }
    
}

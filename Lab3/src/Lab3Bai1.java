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
public class Lab3Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra la so nguyen to hay khong: ");
        int a = Integer.parseInt(abc.nextLine());
        boolean kt =true;
        for(int i =2;i<a; i++)
        {
            if(a%i ==0)
            {
                kt = false;
                System.out.printf("%d khong la so nguyen to\n",a);
                break;
            }
        System.out.printf("%d la so nguyen to\n",a);
             i++;       
        }
                        
    }
    
}

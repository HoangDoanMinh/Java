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
public class Lab3Bai3 {
    public static void NhapMang(int Mang[], int n)
    {
        Scanner abc = new Scanner(System.in);
        for(int i =0; i< n; i++)
        {
            System.out.printf("Nhập a[%d] = ",i);
            Mang[i] = abc.nextInt();
        }
    } public static void XuatMang(int Mang[], int n)
    {
        for(int i =0;i<n;i++)
        {
            System.out.printf("%4d",Mang[i]);
        }
        System.out.println("");
    }
    public static int SoNN(int Mang[],int n)
    {
        int min = Mang[0];
        for(int i =0;i<n;i++)
        {
            min = Math.min(min, Mang[i]);
        }
        return min;
    }
    public static double TongCuaChia3(int Mang[],int n)
    {
        int tong = 0;
        int dem = 1;
        for(int i =1; i < n; i++)
        {
            if(Mang[i] %3 ==0)
                tong +=Mang[i];
                dem++;
        }
        return tong/dem;
    }
    
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int n; int Mang[];
        System.out.print("Nhập vào số lượng phần tử: ");
        n = abc.nextInt();
        Mang =new int[n];
        NhapMang(Mang, n);
        System.out.printf("Mang Vua Nhap la :");
        XuatMang(Mang, n);
        System.out.printf("So nho nhat trong mang la : %d\n",SoNN(Mang, n));
        System.out.printf("Tong So chia Het cho 3 =" +TongCuaChia3(Mang, n));
    }
}



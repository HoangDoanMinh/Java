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
public class Lab2Bai4 {
    public static void main(String[] args)
    {
        Scanner abc= new Scanner(System.in);
        System.out.println("+-----------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện ");
        System.out.println("Kết thúc");
        System.out.println("+-----------------------------------+");
        Scanner scanner = new Scanner(System.in);
        int c = Integer.parseInt(scanner.nextLine());
        switch(c)
        {
            case 1: Lab2Bai1.main(args);break;
            case 2: Lab2Bai2.main(args); break;
            case 3: Lab2Bai3.main(args); break;
            case 4: 
                System.out.printf("Kết thúc chương trình");
                System.exit(0);
        }
    }
    
}

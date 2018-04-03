/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;


/**
 *
 * @author DOANMINH
 */
public class ThucHanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Frame fr = new Frame("Bai 1");
       fr.setSize(200,300);
       fr.setLayout(new FlowLayout());
       //Bo lang nghe
       fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {};
            @Override
            public void windowClosing(WindowEvent e)
             {System.exit(0);}
       });
       
       
       lb1 = new Label("A ");
       fr.add(lb1);
       tf1 = new TextField(20);
       fr.add(tf1);
       
       lb2 = new Label("B ");
       fr.add(lb2);
        tf2 = new TextField(20);
       fr.add(tf2);

       
       Button bn1 = new Button("+");
       bn1.addActionListener(new langngheCong());
       fr.add(bn1);
       Button bn2 = new Button("-");
       bn2.addActionListener(new langnghetru());
       fr.add(bn2);
       Button bn3 = new Button("*");
       bn3.addActionListener(new langngheNhan());
       fr.add(bn3);
       Button bn4 = new Button("/");
       bn4.addActionListener(new langnghechia());
       fr.add(bn4);
       
        lb3 = new Label("Ket Qua");
       fr.add(lb3);
       tf3 = new TextField(20);
       fr.add(tf3);
       
       
    fr.setVisible(true);
    }
    static class langngheCong implements ActionListener{
  
        
        @Override
        public void actionPerformed(ActionEvent e) {
            //Lay A B
           
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());
            //Tinh Tong
            int Tong = a + b;
            //Xuat
            tf3.setText(String.valueOf(Tong));          
        }
    }
    static class langnghetru implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());
            //Tinh Tong
            int Tru= a - b;
            //Xuat
            tf3.setText(String.valueOf(Tru)); 
        }
        
    }
     static class langngheNhan implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());
            //Tinh Tong
            int Nhan = a * b;
            //Xuat
            tf3.setText(String.valueOf(Nhan)); 
        }
        
    }
      static class langnghechia implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());
            //Tinh Tong
            int Chia = a / b;
            //Xuat
            tf3.setText(String.valueOf(Chia)); 
        }
        
    }
     static TextField tf1,tf2,tf3;
     static Label lb1,lb2,lb3;
}

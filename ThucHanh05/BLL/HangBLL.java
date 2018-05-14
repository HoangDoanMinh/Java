/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DBConnection;

/**
 *
 * @author Doan Minh
 */
public class HangBLL {
    DBConnection conn;
        public HangBLL()
        {
           this.conn = DAL.DAL.getDAL();
        }
    
}

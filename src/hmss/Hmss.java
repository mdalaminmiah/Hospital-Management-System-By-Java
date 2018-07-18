/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmss;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

public class Hmss {
    Connection conn=null;
    public static Connection dbConnector(){

        try {
          Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:H:\\Hospital Management System\\HMSA.sqlite");
           //JOptionPane.showMessageDialog(null,"Connected to the database");
          return conn;

        } catch ( Exception e ) {
             JOptionPane.showMessageDialog(null,e);

          System.exit(0);
        }
        return null;
    }

}

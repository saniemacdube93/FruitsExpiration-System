/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.ParseException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static nust.systems.workingcrud.entities.Applicants_.applicantId;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import static nust.systems.workingcrud.DatabaseNav.conn;
import com.mysql.cj.jdbc.Driver;
/**
 *
 * @author busisani
 */
public class ApplicantDAO {
    
    
    
    public boolean checkApplicant(String no) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        

        String s =  no;
        System.out.println(no);
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
       //Credentials pointing to live db
         //   String url = "jdbc:sqlserver://196.220.119.10:1433;databaseName=NUST2017";
         //   String uName = "onlineapplication";
          //  String uPass = "Monday2@nust.ac.zw";

            
            String url = "jdbc:sqlserver://196.220.119.58:1433;databaseName=TEST_NUST2017";
            String uName = "sa";
            String uPass = "Monday1@nust.ac.zw";
            
            
		//String uPass = "Mdaka@nust.ac.zw";		
          Connection conn = DriverManager.getConnection( url , uName, uPass);
            System.out.println("connected successfully to NAV test database by Musa");
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  * FROM [TEST_NUST2017].[dbo].[NUST_USD$Applicant] WHERE [No_]='"+s+"'");
            System.out.println("Records have been retrieved.....................");
        
        
         if (rs.next()){
         
         
         System.out.print("true");
                    
         return true;
         }
         
         
         else{
             
                      System.out.print("false");

             return false;
           
         }
         
         
         
         
         }
    
    
            
  public boolean checkApplicantLocally(String no) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
  
  
  Class.forName("com.mysql.jdbc.Driver").newInstance();
       
            String url = "jdbc:mysql://127.0.0.1:3306/onlineapplication";
            String uName = "root";
       String uPass = ""; //local db password
    // String uPass = "dread_woman";//live db password		
             conn = DriverManager.getConnection( url , uName, uPass);
    Statement st = conn.createStatement();
   ResultSet rs; 
   rs = st.executeQuery("SELECT  * FROM applicants where national_Id='"+no+"'");

      

     if (rs.next()) {
     
         
         return true;
     }
     
     else {
     
         
         
         return false;
     }
     
     
     
  
  
  
  }
  
    
    public boolean LoginUserz(String userName , String password) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        
        
  Class.forName("com.mysql.jdbc.Driver").newInstance();
       //
            String url = "jdbc:mysql://127.0.0.1:3306/onlineapplication";
            String uName = "root";
       String uPass = ""; //local db password
    // String uPass = "dread_woman";//live db password		
             conn = DriverManager.getConnection( url , uName, uPass);
    Statement st = conn.createStatement();
   ResultSet rs; 
   rs = st.executeQuery("SELECT  * FROM applicants where navApplicantId='"+userName+"' AND password='"+password+"'");

      

     if (rs.next()) {
     
         
         return true;
     }
     
     else {
     
         
         
         return false;
     }
     
    
    
    }

    
    
}

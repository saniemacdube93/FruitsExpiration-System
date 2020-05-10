/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static nust.systems.workingcrud.DatabaseNav.conn;
import static nust.systems.workingcrud.entities.Applicants_.applicantId;
import static nust.systems.workingcrud.entities.Applicants_.password;

/**
 *
 * @author busisani
 */
public class BooleanClass {
    
    public boolean checkApplicant(String no) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        
        
    
        
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
       //Credentials pointing to live db
         //   String url = "jdbc:sqlserver://196.220.119.10:1433;databaseName=NUST2017";
         //   String uName = "onlineapplication";
          //  String uPass = "Monday2@nust.ac.zw";

            
            String url = "jdbc:sqlserver://196.220.119.58:1433;databaseName=TEST_NUST2017";
            String uName = "sa";
            String uPass = "Monday1@nust.ac.zw";
            
            
		//String uPass = "Mdaka@nust.ac.zw";		
            conn = DriverManager.getConnection( url , uName, uPass);
            System.out.println("connected successfully to NAV test database by Musa");
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  * FROM [TEST_NUST2017].[dbo].[NUST_USD$Applicant] WHERE [No_]='"+applicantId+"'");
            System.out.println("Records have been retrieved.....................");
        
        
         if (rs.next()){
         
         
         System.out.print("true");
                    

         }
         
         
         else{
             
                      System.out.print("false");

             
           
         }
         
         
         
         return true;
         }
        
        
        
        

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author busisani
 */
class RegisterApplicant {
    
    
     public String getGG () throws SQLException
   {
       ResultSet rs = null; 
       int applicantNumber = 0;
         String applicantNumberS = "";
         
         
      
       String sql2= "SELECT TOP 1 [Last No_ Used] FROM [TEST_NUST2017].[dbo].[NUST_USD$No_ Series Line] where [Series Code] = 'STUDENT' ORDER BY [Last No_ Used] DESC "; 
	 DatabaseNav selectPersonalDetails = new DatabaseNav();
		rs =  selectPersonalDetails.select_db(sql2);
           System.out.println("Are we getting here tttttt");       
                
         System.out.println("Connection Successful");  
        
           while(rs.next()){
               String applicantNumber1 = rs.getString("Last No_ Used");//.getString ("applicantNumnber");
               
               System.out.println("THIS IS THE applicant number"+applicantNumber1);
               
            
               applicantNumber =Integer.parseInt(applicantNumber1);// applicantNumber;
               applicantNumber = applicantNumber+1;
                System.out.println("THIS IS THE NEW APPLICANT NUMBER "+applicantNumber);
                
                applicantNumberS = Integer.toString(applicantNumber);
             
   
   }
        
                 return applicantNumberS;
   
   }
     
     
     
     
     
           public void upDateSeries (String applicantNumberS) throws SQLException
   {
       
       System.out.println("THIS IS THE NEW APPLICANT NUMBER jjjjjjj "+applicantNumberS);
       //ResultSet rs = null; 
     //  String applicantNumber1 = "";
         //String applicantNumberS = "";
//String query = ("SELECT DISTINCT [Document No_],[Closed by Amount], [Posting Date] FROM [NUST_2009].[dbo].[NUST_USD$Cust_ Ledger Entry] WHERE [Closed by Amount] >'0.00000000000000000000' AND [Document No_]= '"+courseCode+"' ORDER BY [Posting Date] DESC");
       //String sql3= "SELECT TOP 1 [Last No_ Used] FROM [NUST_2009].[dbo].[NUST_USD$No_ Series Line] WHERE [Series Code] = 'NORMALL'"; 
String sql2= "UPDATE [TEST_NUST2017].[dbo].[NUST_USD$No_ Series Line]\n" +
"   SET [Series Code] = 'STUDENT'\n" +
"      ,[Line No_] = '1000'\n" +
"      ,[Starting Date] = '1753-01-01 00:00:00.000'\n" +
"      ,[Starting No_] = '12000'\n" +
"      ,[Ending No_] = ''\n" +
"      ,[Warning No_] = ''\n" +
"      ,[Increment-by No_] = 1\n" +
"      ,[Last No_ Used] = '"+applicantNumberS+"'\n" +
"      ,[Open] =1\n" +
"      ,[Last Date Used] = '2014-06-05 00:00:00.000'\n" +
" WHERE [Series Code] = 'STUDENT'"; 
	 DatabaseNav selectPersonalDetails = new DatabaseNav();
	
                
              //  DatabaseNav selectPersonalDetails = new DatabaseNav();
                ResultSet rs = null; 
		//rs =  selectPersonalDetails.select_db(sql3);
           System.out.println("Are we getting here");       

            
              
              
               	selectPersonalDetails.update_db(sql2);//.select_db(sql2);
              
               
               
         System.out.println("Connection Successful");  
       
}  
     
     
         
    
}

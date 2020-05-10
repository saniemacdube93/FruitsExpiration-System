/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author busisani
 */


public class HomeNav {
    
     public static void main(String [] args) throws SQLException{
        HomeNav wrst= new HomeNav();
        wrst.createStudent();
       
    }
    
    public String createStudent() throws SQLException{
    //code to create student number
     //getting year 
        
        LocalDate currentDate = LocalDate.now();
        int y = currentDate.getYear();
        System.out.println("this is the year"+y);
    //Code to replace first char with N
        
        String year = Integer.toString(y);
        year = year.replaceFirst("2", "N");
        System.out.println("This is the prefix code"+year);
        // code for random letter generation
        
        Random rnd = new Random();
        char c = (char) (rnd.nextInt(26) + 'A');
  
         System.out.println("this is the random letter"+c);
          RegisterApplicant rg = new RegisterApplicant();
          String number = rg.getGG();
          rg.upDateSeries(number);
         /*code for getting the last value on studentid no series  code is Student
         NUSTUSDNoSeriesLineDao nsld = new NUSTUSDNoSeriesLineDao();
       String number = nsld.getNumber();
       nsld.update(number, null);**/
        System.out.println("this is the random letter"+number);
        String studentNumber = year +number+c;
        System.out.println("this is the id "+studentNumber);
        return studentNumber;
    
    }
}

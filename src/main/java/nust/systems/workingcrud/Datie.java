/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author NoNO
 */
public class Datie {
    
    public static long calculateDays(String startDate, String endDate) throws ParseException
    {
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          //     String expirydate = ac.getExpiryDate();
              // String manufacturing_date = ac.getExpiryDate();
                 //     String expirydate = ac.getExpiryDate();
              // String manufacturing_date = ac.getExpiryDate();   
                Date sDate= sdf.parse(startDate);
                Date eDate = sdf.parse(endDate);
        
        
        
    
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(sDate);
        Calendar cal4 = Calendar.getInstance();
        cal4.setTime(eDate);
        return daysBetween(cal3, cal4);
    }
    
  // public static void main(String[] args) throws ParseException {
  //    String ola = "" +  calculateDays("2020-04-29", "2020-04-31");
       
  //     System.out.print(ola);
       
        //System.out.println(calculateDays("2020/03/31", "2020/04/31"));

 //   }

   
   /** Using Calendar - THE CORRECT WAY**/
    public static long daysBetween(Calendar startDate, Calendar endDate) {
        Calendar date = (Calendar) startDate.clone();
        long daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        return daysBetween;
    }
     public static Integer convertToString(String numberofdays) throws ParseException
    {
        
    String strTest = numberofdays;
    Integer iTest = Integer.parseInt(strTest);
   
    
    return iTest;
    }
}

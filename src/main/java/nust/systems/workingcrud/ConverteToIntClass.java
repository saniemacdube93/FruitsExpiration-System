/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

import java.text.ParseException;

/**
 *
 * @author NoNO
 */
public class ConverteToIntClass {
    
    
     public static Integer convertToString(String numberofdays) throws ParseException
    {
        
    String strTest = numberofdays;
    Integer iTest = Integer.parseInt(strTest);
   
    
    return iTest;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author busisani
 */
public class PersistanceUnit58 {
     private static PersistanceUnit pu;
    public static PersistanceUnit getInstance(){
        if(pu==null){
            return new PersistanceUnit();
        }
        return pu;
    }
    
    public EntityManagerFactory enFactory = Persistence.createEntityManagerFactory("nust.systems.busisani");
}

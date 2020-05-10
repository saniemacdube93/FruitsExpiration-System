/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

import com.google.gson.Gson;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import static nust.systems.workingcrud.DatabaseNav.conn;
import nust.systems.workingcrud.config.PersistanceUnit;
import nust.systems.workingcrud.config.PersistanceUnit58;
import nust.systems.workingcrud.models.UserExistsModel;

/**
 *
 * @author busisani
 */
public class Home2 {
    
     PersistanceUnit pu = PersistanceUnit58.getInstance();
      
      
      

    public Home2(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Home2() {
    }

    private EntityManagerFactory emf = pu.enFactory;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Home2 nustusdapplicant) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(nustusdapplicant);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
      
    
    
         /* Find Applicant by Applicant Number */
 
    
    
    
    
    
    
  /*
   public boolean checkNavApplicant(String no){
       
       
       
            try{
             
             
             
             
             
         //   String url = "jdbc:sqlserver://196.220.119.58:1433;databaseName=TEST_NUST2017";
         //   String uName = "sa";
          //  String uPass = "Monday2@nust.ac.zw";
                            
         //   conn = DriverManager.getConnection( url , uName, uPass);
           /// System.out.println("connected successfully to NAV test database by Musa");
            
          // Statement stmt = conn.createStatement();
          //  ResultSet rs = stmt.executeQuery("SELECT  * FROM [TEST_NUST2017].[dbo].[NUST_USD$Applicant] WHERE [No_]='"+no+"'");
          //  System.out.println("Records have been retrieved.....................");
             
             
             
    
         if(rs.next()){
              
               
             UserExistsModel user = new UserExistsModel();

             user.setSuccess(true);
             user.setMessage("user exists");
             
             
              Gson gson = new Gson();    
              String json = gson.toJson(user);
              return json;

         }
        //if the result set is empty we will return a json telling us that the result set is empty
          
         
         else{
              UserExistsModel user = new UserExistsModel();
  
              user.setSuccess(false);
              user.setMessage("user does not exists");
           
           
              Gson gson = new Gson();    
              String json = gson.toJson(user);
              return json; 
             
         
         }
        
         
         

     
     }
         
         catch(Exception e){
             
             
             
         return "Error: Dynamics exception";
         }
         
         
     }
     
   
   
   
   
   
   }
   
    
    */
    
    
    
}

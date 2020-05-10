/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

/**
 *
 * @author busisani
 */

import com.google.gson.Gson;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transaction;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;
import static nust.systems.workingcrud.DatabaseNav.conn;
import nust.systems.workingcrud.config.PersistanceUnit;
import nust.systems.workingcrud.entities.Applicants;
import static nust.systems.workingcrud.entities.Applicants_.navApplicantId1;
import nust.systems.workingcrud.models.LoginJson;
import nust.systems.workingcrud.models.LoginResponder;
import nust.systems.workingcrud.models.UserExistsModel;
import nust.systems.workingcrud.models.UserUpdatedModel;
import nust.systems.workingcrud.models.Exipiratio;
import nust.systems.workingcrud.HomeNav;
import nust.systems.workingcrud.config.PersistanceUnit58;
import nust.systems.workingcrud.emails.EmailSender;
import static nust.systems.workingcrud.entities.Applicants_.applicantId;
import nust.systems.workingcrud.entities.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author busisani
 */
@RestController
public class Home {
    
    
      PersistanceUnit pu = PersistanceUnit.getInstance();
      
      
     


    public Home(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public Home() {
    }

    private EntityManagerFactory emf = pu.enFactory;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Home nustusdapplicant) {
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
                  

     EntityManager em =null;
   //this is were the landing page will be accessed in this case the landing page
    @RequestMapping(value = "/")
     public ModelAndView IndexIt(ModelAndView model) throws IOException {
       
       model.setViewName("index");
       return model;
    }
     
     
     
     
     
     
     
     @RequestMapping(value = "/ModalController")
    public ModelAndView Modal5(ModelAndView model,  HttpServletRequest request) throws IOException {
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        PersistanceUnit pu = PersistanceUnit.getInstance();
        EntityManagerFactory emf = pu.enFactory;        
        EntityManager em = emf.createEntityManager();
        
        
         Applicants applicants;
         Query query1;
         query1 = em.createQuery("SELECT a FROM AuthenticationTable a WHERE a.email = :email AND a.password = :password");
         query1.setParameter("email", email);
         query1.setParameter("password", password);
         if(!query1.getResultList().isEmpty()){
               
              //  List<Transaction> t = query1.getResultList();
               
                em.close();
             //   model.addObject("products", t);
           //   model.setViewName("viewitems");     
                model.setViewName("index2");

            }
           
           
           else {
           
               model.setViewName("index");
           
           }
          
  
         
       return model;
    }
     
     
     
     
       @RequestMapping(value = "/ModalController3")
     public ModelAndView Modal2(ModelAndView model) throws IOException {
      System.out.println("Hello World");
       model.setViewName("index3");
       return model;
    }
     
     
     
     
     @RequestMapping(value = "/ModalController4")
     public ModelAndView Modal3(HttpServletRequest request,ModelAndView model) throws IOException {
      System.out.println("Hello World");
      
   // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
   // Date date = new Date();  
    //System.out.println(formatter.format(date));  
       
       String price = request.getParameter("price");
       price = price.concat(".00");
       String pricy = price.trim();
       String expirydate = request.getParameter("expiry-date");
       String purchase  = request.getParameter("purchase-date"); 
       String productDescription = request.getParameter("product-description"); 
       String supplier = request.getParameter("product-supplier"); 
      
      
       em = getEntityManager();
       em.getTransaction().begin();
        
       
       
      Products products1 = new Products();
      products1.setBatchno(1);
      products1.setCategoryId("fruits");
      products1.setExpiryDate(expirydate);
      products1.setMerchandiseId("4323");
      products1.setOnSpecial("true");
      products1.setProductDescription(productDescription);
      products1.setProductPrice(pricy);
      products1.setPurchaseDate(purchase);
      
      
      
      
      em.persist(products1);
      em.getTransaction().commit();
         
          
      
      
      model.setViewName("index4");
       
       
       
       
       return model;
    }
     
     
          @RequestMapping(value = "/ModalController5" )
     public ModelAndView Modal4(ModelAndView model,  HttpServletRequest request) throws IOException {
         
        PersistanceUnit pu = PersistanceUnit.getInstance();
        EntityManagerFactory emf = pu.enFactory;        
        EntityManager em = emf.createEntityManager();
        
        
         Applicants applicants;
         Query query1;
         query1 = em.createQuery("SELECT p FROM Products p");
         
         
           if(!query1.getResultList().isEmpty()){
               
                List<Transaction> t = query1.getResultList();
               
                em.close();
                model.addObject("products", t);
           //   model.setViewName("viewitems");     
                model.setViewName("newjsp");

            }
          
  
         
       return model;
    }
     
     
     
     
     @RequestMapping(value = "/ModalController9")
    public ModelAndView Modal9(ModelAndView model) throws IOException, ParseException {
         
        Datie datie = new Datie();
        
        //ConverteToIntClass conv = new ConverteToIntClass();
         PersistanceUnit pu = PersistanceUnit.getInstance();
        EntityManagerFactory emf = pu.enFactory;        
        EntityManager em = emf.createEntityManager();
        
        
         Applicants applicants;
         Query query1;
         query1 = em.createQuery("SELECT p FROM Products p");
         
        List <Products> rm = query1.getResultList();
         
        //if(!query1.getResultList().isEmpty()){
               
               List <Expired> expired =  new ArrayList<Expired>();
               List <Exipiratio> expired2 =  new ArrayList<Exipiratio>(); 
               
               
           for (Products ac : rm)
           {
                LocalDate localDate = LocalDate.now();
               String sj =  DateTimeFormatter.ofPattern("yyy-MM-dd").format(localDate) ;
               
               String srtDate = ac.getPurchaseDate();
               String endDate = ac.getExpiryDate();
               
               String numberofdays = ""  + datie.calculateDays(sj, endDate);
               System.out.println(numberofdays);
               
            //   int i = Integer.parseInt(s.trim());
               Integer bala = Integer.parseInt(numberofdays);
               String s  = "";
               
               
               if(bala < 30){
                  String price = ac.getProductPrice();
          double d =  Double.parseDouble(price);
          double e = d * 0.8;
          s = "0" ;
               
               }
               
               
               if(bala > 30){
               
            String price = ac.getProductPrice();
          double d =  Double.parseDouble(price);
          double e = d * 0.8;
          s = "" + e;
               }
               
               
          //    Double price =  Double.valueOf(ac.getProductPrice()) * 0.8;
              
          
          
          
         
           
              
               // System.out.println(DateTimeFormatter.ofPattern("yyy-MM-dd").format(localDate));
      //     public Expired(String currentdate ,String batchno , String productDescription, String categoryId, String merchandiseId, String productPrice, String purchaseDate, String expiryDate, String onSpecial, String days) {
       
                           expired.add(new Expired(s,sj, ac.getBatchno().toString(), ac.getProductDescription(), ac.getCategoryId(), ac.getMerchandiseId(), ac.getProductPrice(), ac.getPurchaseDate(), ac.getExpiryDate(),ac.getOnSpecial(), numberofdays));
                            //  expired.add(new Expired("123","123","123","123","123","123","123","123","123" ,"123","123"));

                            System.out.println("hello");
                            System.out.println("hello");

            //   expired.add(new Expired(DateTimeFormatter.ofPattern("yyy-MM-dd").format(localDate).toString() , ac.getBatchno().toString(), ac.getProductDescription(), ac.getCategoryId(), ac.getMerchandiseId(), ac.getProductPrice(), ac.getPurchaseDate(), ac.getExpiryDate(), ac.getOnSpecial(), numberofdays));
               
             //  expired.setCategoryId(ac.getCategoryId());
               
              // expired.setDays(numberofdays);
               
              // expired.setExpiryDate(ac.getExpiryDate());
               
             //  expired.setMerchandiseId(ac.getMerchandiseId());
             //  expired.setOnSpecial(ac.getOnSpecial());
             //  expired.setProductDescription(ac.getProductDescription());
             //  expired.setProductPrice(srtDate);
              // expired.setPurchaseDate(srtDate);
               
               
               
               
               
               
                model.addObject("expired", expired);
           //   model.setViewName("viewitems");     
            
               
               
               
               
               
               
            //   Date date = sdf.parse(expirydate);
             //   Date date2 = sdf.parse(expirydate);
               
           
           //    ab.sendtoapplicant(ac.getEMail(), ac.getApplicantNo(), ac.getSurname(), ac.getForenames());
           }   
              
              
              
              

         //   }
           
           
         
          
  
       model.setViewName("ola");
       return model;
    }
     
     
     
    // @RequestMapping(value = "/ModalController4", method = RequestMethod.GET)
     //  public ModelAndView addUnderDetails(HttpServletRequest request,ModelMap modelMap) throws IOException{
     
    //   System.out.println("Hello World");
     //  System.out.println("Hello World");
    //   String applicantNumber = request.getParameter("applicantNumber");
      // ModelAndView model= new ModelAndView("indexUnderGrad");
     //  return model;
  // }
       
       @RequestMapping(value = "/ModalController10")
    public ModelAndView Modal10(ModelAndView model) throws IOException, ParseException {
         
    
     //    EmailSender ab = new EmailSender();
     //    ab.sendtoapplicant("nomsadube1966@gmail.com", "n0124u5u4", "test", "test");
        
  
       model.setViewName("index3");
       return model;
    }
     
     

         
     
     
     
     
     //not working for now
       //responsible for check if a user is avaialable within the database
     //check user using id
     /*
     @RequestMapping(value="checkUserz")
     @GetMapping
     public String checkUser(@RequestParam String no){
         
         System.out.print("----------------------------" + no + "------------------------------------------");
        PersistanceUnit pu = PersistanceUnit.getInstance();
        EntityManagerFactory emf = pu.enFactory;        
        EntityManager em = emf.createEntityManager();
        String id  = no.toUpperCase();
         Query query1;
         Applicants applicants;
         query1 = em.createQuery("SELECT a FROM Applicants a WHERE a.nationalId = :nationalId");
         query1.setParameter("nationalId", id);

         if(!query1.getResultList().isEmpty()){
             
             
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
     
    */
     
     
     
     
     
     
     
    
     
     
     /*
     **************************************************************************************************************
     *************************************************************************************************************
     *************************************************************************************************************
     ************************************** THIS IS FOR CREATING THE USER*****************************************
     **********************   POST METHOD
     *******************     http://localhost:8081/mavenproject1/createUser?name=sanisto  *************************************
     ************* STUDENT NUMBER WILL BE RECEIVED BY IMPLEMENTING THE LOGIC FROM NUMBER LINE SERIES TABLE *********
     
     */
     nust.systems.workingcrud.HomeNav numberLine = new HomeNav();
     
     
     
     @PostMapping("createUser")
     public String createUser(@RequestParam String name) throws SQLException{
     
         
              HomeNav lg = new HomeNav();
             String applicantNumber = lg.createStudent();
            // String Name = name.toUpperCase();
             
          em = getEntityManager();
          em.getTransaction().begin();
       
       try{
           
           
       // String applicantNumber = lg.createStudent();

         
         
           
        // System.out.println("the applicant number has been generated as" + applicantNumber );
       
         Applicants apps = new Applicants();
         UserUpdatedModel userUpdated = new UserUpdatedModel();
         apps.setApplicantId(Integer.MIN_VALUE);
         apps.setName(name.toUpperCase());
         apps.setSurname("12345");
         apps.setGender("12345");
         apps.setEmail("234.com".toUpperCase());
         apps.setPassword("234");
         apps.setTitle("234");
         apps.setSubmitted(true);
         apps.setNationalId("0861142109W72".toUpperCase());
         apps.setType("MR");
         apps.setTimestamp("08:50");
         apps.setDob("34-75-76");
         apps.setNationality("123");
         apps.setCitizenship("zimbo");
         apps.setNavApplicantId(applicantNumber);
         apps.setApplicantId1(12345);
         apps.setNavApplicantId1("3456");
         
      
         em.persist(apps);
         em.getTransaction().commit();
         
          userUpdated.setMessage("successful");
          userUpdated.setSuccess(true);
          
              Gson gson = new Gson();    
              String json = gson.toJson(userUpdated);
              return json; 
             

         
         

       }
       
       catch(Exception ex){
        System.out.print("exception");
            printStackTrace(ex); 
          UserUpdatedModel userUpdated = new UserUpdatedModel();
          userUpdated.setMessage("failed");
          userUpdated.setSuccess(false);

              Gson gson = new Gson();    
              String json = gson.toJson(userUpdated);
              return json; 
             

          
         

       }
       
       finally{
               System.out.print("finally");

                    em.close();

           
       }
        
      
      
         
     }
     
     
     //Login Functionality
     //http://localhost:8081/mavenproject1/checkDude?userName=N01980171Z&pass=12345
      @PostMapping("checkDude")
     public String checkDude(@RequestParam String userName,String pass) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
          
            
         
         String use = userName;
         String user = pass;

         
       ApplicantDAO booleanClass = new ApplicantDAO();
         
         System.out.print("hello");
         
         
         boolean loginSuccesful = booleanClass.LoginUserz(userName , pass);
         //if the resultset is not empty we will ret
        
         if(loginSuccesful){
             
             System.out.println("Hello word it was true");
             
             
             /*
                 List<Applicants> f= query1.getResultList();
                 String json ="";
                 

                  for (Applicants d: f){
                      
         




                      String x = pass;                      
                      String t = d.getPassword();
                      
                      
                      String a1 = userName;
                      String b1 = d.getNavApplicantId();

                      
                      
                      
                      
                      
                      
                        Boolean b = userName.equals(d.getNavApplicantId());
                        Boolean c = pass.equals(d.getPassword());
                        System.out.print("hello world");
                      if(userName.equals(d.getNavApplicantId()) & pass.equals(d.getPassword())){
                      
                          
                          LoginResponder login = new LoginResponder();

                         login.setSuccess(true);
                         login.setMessage("user exists");
             
             
                        Gson gson = new Gson();    
                        json = gson.toJson(login);
             
                          
                      }
                      
                      
                      else{
                          
                          
                          LoginResponder login = new LoginResponder();

                          login.setSuccess(false);
                          login.setMessage("incorrect credentials");
             
             
              Gson gson = new Gson();    
              json = gson.toJson(login);           
                      
                      
                      }
                      
                      
       
         
                 
                 }
             
             */
                 
               // return json;

              
                          LoginResponder login = new LoginResponder();

                         login.setSuccess(true);
                         login.setMessage("user exists");
             
             
                        Gson gson = new Gson();    
                      String  json = gson.toJson(login);
                           return json; 


         }
        //if the result set is empty we will return a json telling us that the result set is empty
         
         
         else{
             
           LoginResponder login = new LoginResponder();
  
           login.setSuccess(false);
           login.setMessage("user does not exists");
           
           
           Gson gson = new Gson();    
              String json = gson.toJson(login);
              return json; 
         }
        
        
         
         

     
     }
     
     
     
     
     
     
     //works
     //http://localhost:8081/mavenproject1/checkUser?no=082114751N75
     @RequestMapping(value="checkUser")
     @GetMapping
     public String checkUser(@RequestParam String no) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
     
          
       ApplicantDAO booleanClass = new ApplicantDAO();
         
         System.out.print("hello");
         
         
         boolean navExists = booleanClass.checkApplicantLocally(no);
         
       
     
         //if the resultset is not empty we will ret
        
         if(navExists){
              
               
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
     
     
     
     
     /*2nd checkNav
     */
     
     
     
      //works
     //http://localhost:8081/mavenproject1/checkNavUser?no=082114751N75
     @RequestMapping(value="checkNavUser")
     @GetMapping
     public String checkNavUser(@RequestParam String no) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
     
         
         ApplicantDAO booleanClass = new ApplicantDAO();
         
         System.out.print("hello");
         
         
         boolean navExists = booleanClass.checkApplicant(no);
     
         
         
         
      
         if(navExists){
              
               
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
     
     
     
     
     
     // THE FOLLOWING ARE THE STUDENT NUMBERS TO USED FOR TESTING PUPROSES
  
     //N0193853T
     //N0193854R
     //N0193855J
     //N0193970A
     //N0193999K
     
     
     //here is the link to the json url
     //http://localhost:8081/mavenproject1/checkUser?no=082114751N75
     //http://localhost:8081/mavenproject1/checkNavApplicant?no=N0195540D
     
     
     //here is the link to the query on 58
     
     //   where [No_] LIKE 'N019%';
     
     
     /*
     @RequestMapping(value="checkApplicant")
     @GetMapping
     public String checkNavApplicant(@RequestParam String no){
     
         
         Home2 home2 = new Home2();
             
             
             
             
             
          
             
             
             
    
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
     
     
     */
          //http://localhost:8081/mavenproject1/checkUser?no=082114751N75
    
     
        static Connection conn;
     //
      /* Find Applicant by Applicant Number within Applicants*/
        //http://localhost:8081/mavenproject1/checkNavApplicant?no=N0195540D
    @RequestMapping(value="checkNavApplicant")
    @GetMapping 
    public String findNo (@RequestParam String no) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        System.out.println("Finding Applicant Number");
        PersistanceUnit pu = PersistanceUnit58.getInstance();
       // EntityManagerFactory emf = pu.enFactory;        
      //  EntityManager em = emf.createEntityManager();
    //    NUSTUSDApplicant nUSTUSDApplicant;
   //     Query query1;
        
       // System.out.println("Select statement Querry now running");
      //  query1 = em.createQuery("SELECT n FROM NUSTUSDApplicant n WHERE UPPER(n.nUSTUSDApplicantPK.no) = :no");
        //query1.setParameter("no", no.toUpperCase());
        
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
       //Credentials pointing to live db
            String url = "jdbc:sqlserver://196.220.119.10:1433;databaseName=NUST2017";
            String uName = "onlineapplication";
            String uPass = "Monday2@nust.ac.zw";
        
                    
              conn = DriverManager.getConnection( url , uName, uPass);
            System.out.println("connected successfully to NAV test database by Musa");
            
            
             Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  * FROM [TEST_NUST2017].[dbo].[NUST_USD$Applicant] WHERE [No_]='"+applicantId+"'");
            System.out.println("Records have been retrieved.....................");
      //  List<NUSTUSDApplicant> resultList1 = query1.getResultList();
        
        
                    if(rs.next()){
                     UserExistsModel user = new UserExistsModel();
                    user.setSuccess(true);
                    user.setMessage("applicant exists");
             
             
                   Gson gson = new Gson();    
                   String json = gson.toJson(user);
                   return json; 
             
                    
                    
                    }
        
      
      
              else{
                  UserExistsModel user = new UserExistsModel();
  
               user.setSuccess(false);
               user.setMessage("applicant not yet created");
           
           
              Gson gson = new Gson();    
              String json = gson.toJson(user);
              return json; 
      
                    }
    }
}
    
    
    
     
     
     
    


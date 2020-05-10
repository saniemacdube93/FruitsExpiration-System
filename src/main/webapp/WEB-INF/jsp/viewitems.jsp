<%-- 
    Document   : view_items
    Created on : Mar 4, 2020, 5:13:15 AM
    Author     : NoNO
--%>

<%@page import="nust.systems.workingcrud.entities.Products" %>
<%@page import ="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <c:forEach  items="${products}" var="products" >  
                     
                        <h2 class="to">Applicant Number: <c:out value="${products.productDescription}" /></h2>
                         <h4 class="to">
                          
                            
                            
                
 </c:forEach>
    </body>
</html>

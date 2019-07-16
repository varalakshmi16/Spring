<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<center>
		<h1>Login Page</h1>
       <form:form method="post" action="loginval.htm" modelAttribute="reg">  
      	<table >  
         <tr>  
          <td>UserId :</td>  
          <td><form:input path="user" /></td>
         </tr> 
         <tr>  
          <td>Password :</td>  
          <td><form:password path="pass" /></td>
         </tr>       
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
</center>
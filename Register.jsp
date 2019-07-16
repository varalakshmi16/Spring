<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<center>
		<h1>Welcome</h1>
       <form:form method="post" action="save.htm" modelAttribute="reg">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>UserId :</td>  
          <td><form:input path="user" /></td>
         </tr> 
         <tr>  
          <td>Password :</td>  
          <td><form:password path="pass" /></td>
         </tr> 
           <tr>  
          <td>Age :</td>  
          <td><form:input path="age" /></td>
         </tr> 
           <tr>  
          <td>MobileNo :</td>  
          <td><form:input path="no" /></td>
         </tr> 
           <tr>  
          <td>City :</td>  
          <td><form:input path="city" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
</center>
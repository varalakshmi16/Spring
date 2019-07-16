<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<center>
<h1>Edit Profile</h1>
<form:form action="saveedit.htm" modelAttribute="reg">
<c:forEach items="${list}" var="reg">
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name" value="${reg.name}" /></td>
         </tr>  
         <tr>  
          <td>UserId :</td>  
          <td><form:input path="user" value="${reg.user}"/></td>
         </tr> 
           <tr>  
              <td>Password :</td>  
          <td><form:input path="pass" value="${reg.pass}"/></td>
         </tr> 
           <tr>  
          <td>Age :</td>  
          <td><form:input path="age" value="${reg.age}"/></td>
         </tr> 
           <tr>  
          <td>MobileNo :</td>  
          <td><form:input path="no" value="${reg.no}"/></td>
         </tr> 
           <tr>  
          <td>City :</td>  
          <td><form:input path="city" value="${reg.city}"/></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
</c:forEach>
</form:form>
</center>
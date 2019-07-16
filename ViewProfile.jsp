<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<center>
		<h1>Welcome</h1>
 
<c:forEach items="${list}" var="log">
<table border="1">
	<tr><td>Name</td><td>${log.name}</td></tr>
	<tr><td>UserID</td><td>${log.user}</td></tr>
	<tr><td>Password</td><td>${log.pass}</td></tr>
	<tr><td>Age</td><td>${log.age }</td></tr>
	<tr><td>MobileNo</td><td>${log.no }</td></tr>
	<tr><td>City</td><td>${log.city}</td></tr>
	<tr><td><form action="edit.htm"><input type="submit" name="edit" value="EditProfile"></form></td>
	<td><form action="Delete.htm"><input type="submit" name="delete" value="DeleteProfile"></form></td></tr>
	<tr><td><form action="ChangePass.htm"><input type="submit" name="delete" value="ChangePassword"></form></td>
	<td><form action="Home.htm"><input type="submit" name="delete" value="Logout"></form></td></tr>
</table>
	</c:forEach> 

</center>
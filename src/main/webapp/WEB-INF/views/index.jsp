<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>



<body>
	<h2>Реєстрація</h2>
	<form method="post">
	<table>
		
		<tr>
			<th>Ім'я:</th>
			<td><input name="realname" type="text"/></td>
		</tr>

		<tr>
			<th>E-mail:</th>
			<td><input name="email" type="text"/></td>
		</tr>
		 
		<tr>
			<th>Нікнейм:</th>
			<td><input name="username" type="text"/></td>			
		</tr>
		 		  	
		<tr>
			<th>Пароль:</th>
			<td><input name="password" type="text"/></td>
		</tr>
		
		<tr>
			<th>Вік:</th>
			<td><input name="age" type="text"/></td>
		</tr>
		<tr>
			<th></th>
			<td><input type="submit" value="Зареєструватись!"/></td>
		</tr>
	</table>
	</form>
	<table>
	<c:if test="${users.size() ne 0}">
		<c:forEach begin="0" end="${users.size()-1}" var="index">
			<tr>
				<td>Ім'я: </td>
				<td>${users.get(index).realname}</td>
				<td>;</td>
				<td>E-mail:</td>
				<td>${users.get(index).email}</td>
				<td>;</td>
				
				<td>Нікнейм: </td>
				<td>${users.get(index).username}</td>
				<td>;</td>
				
				<td>Пароль: </td>
				<td>${users.get(index).password}</td>
				<td>;</td>
				<td>Вік:</td>
				<td>${users.get(index).getAge()}</td>
				<td>;</td>
				<c:url value="/" var="url"/>
				<td><a href="${url}${index}">видалити!</a></td>
			</tr>
		</c:forEach>
	</c:if>
		<c:if test="${users.size() eq 0}">
			<p>Nothing</p>
		</c:if>
	</table>
		
	<!--  
	<div> 
		<h2>Create a free Spitter account</h2>
		<sf:form method="POST" modelAttribute="spitter"       enctype="multipart/form-data">
		<fieldset>  
		<table cellspacing="0">
			<tr>      
				<th><sf:label path="user">User:</sf:label></th>
					<td>
						<sf:input path="user" size="15" maxlength="15" /> 
				  		<small id="user_msg">No spaces, please.</small><br/>         
				  		<sf:errors path="user" cssClass="error" />      
				  	</td>                               
			</tr>
		</table> 
		</fieldset> 
		</sf:form> 
	</div>
	-->	
	
</body>
</html>
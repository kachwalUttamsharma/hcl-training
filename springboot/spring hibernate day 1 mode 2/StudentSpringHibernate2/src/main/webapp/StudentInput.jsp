<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<springForm:form method="POST" action="/addStudent" commandpath="controller">

 <center>
 Roll No : <springForm:input type="text" path="Rollnum" /><br/><br/>
 Student Name :<springForm:input type="text" path="Name" /><br/><br/>
 Age : <springForm:input type="text" path="Age" /><br/><br/>
 Gender : <springForm:input type ="radio" path="Gender" value="MALE" />MALE<br/><br/>
          <springForm:input type ="radio" path="Gender" value="FEMALE" />FEMALE<br/><br/>
 Country : <springForm:select path="Country">
          
          <springForm:option value= "India">India</springForm:option>
          <springForm:option value= "USA">USA</springForm:option>
          <springForm:option value= "ENGLAND">ENGLAND</springForm:option>
          <springForm:option value="AUSTRALIA">AUSTRALIA</springForm:option>
          <springForm:option value="CHINA">CHINA</springForm:option>
 </springForm:select><br/><br/>
 Date Of Join :<springForm:input type="date" path="dateofjoin" /><br/><br/>
 Final Score:<springForm:input type="text" path="finalScore" /><br/><br/>
             <input type="submit" value="Submit" />         
 </center>
</springForm:form>
</body>
</html>
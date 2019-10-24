<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><h1>HOME PAGE</h1></title>
<script>
function goToNewPage()
{
    var url = document.getElementById('list').value;
    if(url != 'none') {
        window.location = url;
    }
}
</script>
</head>
<body>
<center>
<%
 int pages = (Integer)request.getAttribute("page");
 int total = (Integer)request.getAttribute("totalrecords");
 int num = total%pages;
 int t;
 if(num > 0){
	 t = (total/pages)+1;
 }else{
		 t = (total/pages);
 }
 for(int i = 0;i < t ; i++){
	 %><a href = "/displayAllPages/page/<%=i%>">page <%=i+1 %></a><br/><%
 }
%>
<form>
<select name="list" id="list">
<%
if (num != 0) {
for (int i = 0; i < t + 1; i++) {
%><option value="/displayAllPages/page/<%=i%>"><%=i + 1%></option>
<%
}
} else if (num == 0) {
for (int i = 0; i < t; i++) {
%><option value="/displayAllPages/page/<%=i%>"><%=i + 1%></option>
<%
}
}
%>
</select>
<input type="button" value="Go" onclick="goToNewPage()"/>
</form>
<table border = "1" style="background-color: pink" >

			<tr style="background-color:gray">
				<th>empno</th>
				<th>name</th>
				<th>basic</th>
				<th>dept</th>
				<th>desig</th>
			</tr>
			<c:forEach var="employee" items="${employees}">
				<tr>
					<td>${employee.empno}</td>
					<td>${employee.name}</td>
					<td>${employee.basic}</td>
					<td>${employee.dept}</td>
					<td>${employee.desig}</td>
				</tr>
			</c:forEach>
	</table>

	<!-- categories:
	
	<a href="/displayjavacontractor">Display Java Contractor</a><br/><br/>
	<a href="/displayjavaemployees">Display Java Employees</a><br/><br/>
	<a href="/displayjavamanagers">Display Java Managers</a><br/><br/>
	<a href="/displayjavasalariesgreterthan5000">Display Java Manager with basic more than 5000</a><br/><br/>
	<a href="/displaywithstartwithname">Display Start With Name s</a><br/><br/>
	<a href="/displayAllSortByDesig">Display All Order By Designation</a><br/><br/>
	<a href="/displayallbydesendingdesig">Display all in desending order by desig</a><br/><br/> 
	<a href="/displayallbydesendingdesigandsalary">Display all in desending order by saalry and department</a><br/><br/>
	<a href="/displayjavaandsalary">Display java Employees and sort by salary</a><br/><br/>
	<a href="/displaysalariesgreaterthan5000andstartingwith">Displayjavatrainerwithsalarygraterthan5000</a><br/><br/> -->
	</center>
	
	
</body>
</html>
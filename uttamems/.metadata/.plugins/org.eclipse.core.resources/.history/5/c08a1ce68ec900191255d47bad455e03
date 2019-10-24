<%@page import="com.hcl.ems.EmsDao"%>
<%@page import="com.hcl.ems.Leaves"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr class="table-primary">
 <th>Leave ID</th>
 <th>Number of Days</th>
 <th>Start Date</th>
 <th>End Date</th>
 <th>Leave Type</th>
 <th>Status</th>
 <th>Reason</th>
 <th>Applied On</th>
 <th>Manager Comments</th>
 </tr>
 <%
 int EMP_ID=Integer.parseInt((String)session.getAttribute("EMP_ID"));
 Leaves l=new EmsDao().getMyLeavesDao(EMP_ID);
 if(l.getLeaId()!=0){
	 out.println("<tr>");
	 out.println("<td>"+ l.getLeaId() +"</td>");
	 out.println("<td>"+ l.getNoDays() +"</td>");
	 out.println("<td>"+ l.getStartDate() +"</td>");
	 out.println("<td>"+ l.getEndDate() +"</td>");
	 out.println("<td>"+ l.getType() +"</td>");
	 out.println("<td>"+ l.getStatus() +"</td>");
	 out.println("<td>"+ l.getReason() +"</td>");
	 out.println("<td>"+ l.getAppliedOn() +"</td>");
	 out.println("</tr>");
 }else{
	 out.println("<td>No Standing Leaves</td>");
 }
 %>
</table>
<div id="applyButton" />
<input  type="submit" value="New Application" />
</body>
</html>
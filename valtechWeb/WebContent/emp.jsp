<%@page import="com.valtech.dao.Employee"%>
<%@page import="com.valtech.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% EmployeeDAO dao = new EmployeeDAO();
    int id = Integer.parseInt(request.getParameter("id"));
   Employee e= dao.getEmployee(id);
   String prev = "emp.jsp?id="+dao.getPreviousId(id);
   String next = "emp.jsp?id="+dao.getNextId(id);
   
%>
<table>
<tr>   
   <td> Id</td><td><%= e.getId() %></td>
  </tr>
  <tr> 
   <td> Name</td><td><%= e.getName() %></td>
   </tr>
   <tr>
   <td> Age </td><td><%= e.getAge() %></td>
   </tr>
   <tr>
   <td> Gender</td><td><%= e.getGender() %></td>
   </tr>
<tr>
   <td> Salary</td><td><%= e.getSalary() %></td>
</tr>
<tr>
<td>   <a href=<%=prev%>>Previous</a></td> 
<td>   <a href=<%=next%>>Next</a></td>

</tr>

</table>
</body>
</html>
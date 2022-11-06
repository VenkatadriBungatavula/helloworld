<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retail</title>
</head>
<body>
<hr><h1><center>KRISHNA CHAITANYA DEGREE COLLEGE</center></h1><hr>
<br><br>
<a href="/Home"><button>HOME</button></a>&nbsp;&nbsp;&nbsp; 	
<a href="/Students"><button>STUDENT INFO</button></a>&nbsp;&nbsp;&nbsp;
<a href="/Lecturers"><button>LECTURER INFO</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href ="/Login"><button>LOG OUT</button></a>
<br><br><br>
<h3><center>STUDENT DETAILS</h3></cennter>
<!-- <table border=2 width=100%>
<tr><td>S.No.</td><td>NAME</td><td>AGE</td><td>CLASS</td><td>DOB</td><td>Phone No.</td></tr>
<tr><td>1.</td><td>SANGEETHA</td><td>21</td><td>13</td><td>21/10/2001</td><td>7331132542</td></tr>
<tr><td>2.</td><td>GANGA</td><td>21</td><td>13</td><td>10/23/2001</td><td>8341088602</td></tr>
<tr><td>3</td><td>SAM</td><td>21</td><td>15</td><td>10/23/1994</td><td>8179288670</td></tr></table>
 -->

<table border=2 width=100%>
<tr><td>S.No.</td><td>NAME</td><td>AGE</td><td>CLASS</td><td>DOB</td><td>Phone No.</td><td>Action</td></tr>
<c:forEach items="${studentList}" var="student">
<tr><td>${student.sId}</td><td>${student.sName}</td><td>${student.sAge}</td><td>${student.sClass}</td><td>${student.sDOB}</td><td>${student.sPhone}</td><td><button>Delete</button></td></tr>
</c:forEach>
</table> 
 
 <br><br>
<center><a href="/CreateStudent"><button>CREATE STUDENT</button></a></center>
<hr><center>@copyright ganga solution<hr></center>


</body>
</html>
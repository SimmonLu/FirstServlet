<%--
  Created by IntelliJ IDEA.
  User: simon
  Date: 10/11/15
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    java.util.Date today = new java.util.Date();
    String text = "Today's date is: " + today.toString();
%>

<%=
    text
%>
</body>
</html>

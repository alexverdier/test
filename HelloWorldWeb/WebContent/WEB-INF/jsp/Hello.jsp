<%@page import="com.hello.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<title>Hello</title>
</head>
<body> 

Hello world ! 

<jsp:useBean id="alex" class="com.hello.beans.User"></jsp:useBean>
  <jsp:setProperty name="alex" property="name" value="alex"/>
            ${alex.name}
           

<% 

            String attribut = (String) request.getAttribute("message");
			//User user = (User) request.getAttribute("user");
			int counter = (Integer) request.getAttribute("counter");
            out.println( attribut +   " n° " + counter  ) ;

            %>
            
            ${user.name}
            ${counter}
            
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>URL filter Demo</title>
</head>
<body>
    <a href="/UrlFilterServlet">Click here to send GET request</a>
     
    <br/><br/>
     
    <form action="UrlFilterServlet" method="post">
        Url: <input type="text" size="100" name="Url"/>
        &nbsp;&nbsp;
        <input type="submit" value="Check" />
    </form>
</body>
</html>
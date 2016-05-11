<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
 <title>登陆界面 WEB-INF/jsp/login.jsp</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    	
  </head>
  
  <body>
  <form action="${pageContext.request.contextPath }/LoginServlet" method="post">
  	用户名<input type="text" name="username"/><br/>
  	密码<input type="text" name="password"/><br/>
  	<input type="submit" value="登陆"/><br/>  	
  </form>
   
  </body>
</html>
  
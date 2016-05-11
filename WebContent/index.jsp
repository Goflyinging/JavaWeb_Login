<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>       
    <title>index.jsp</title>
	<meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>  
  <body>
  <c:if test="${user!=null }">
     欢迎：${user.username} <a href="${pageContext.request.contextPath }/LoginOutServlet">注销</a><br/>
  </c:if>
   <a href="${pageContext.request.contextPath }/RegisterUIServlet">注册</a> <br>
   <a href="${pageContext.request.contextPath }/LoginUIServlet">登录</a> <br>
    </body>
</html>
	
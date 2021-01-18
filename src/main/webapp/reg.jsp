<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
   <body>
      <form method="post" action="${pageContext.request.contextPath}/userAction.action">
           UserName<input type="text" name="user.userName"/><br/>
           Password<input type="password" name="user.password"/><br/>
           <input type="submit" value="userAction">
      </form>
   </body>
</html>
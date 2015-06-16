<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for MainForm form</title>
	</head>
	<body>
		<html:form action="/main">
			<html:hidden property="login_id"/><html:errors property="login_id"/><br/>
			
		</html:form>
	</body>
</html>


<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for MainForm form</title>
	</head>
	<body>
		<html:form action="/main">
			login_id : <html:hidden property="login_id"/><html:errors property="login_id"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<body>
	<html:form action="login.do">
		<html:text property="email" name="LoginForm"></html:text>
		<html:submit value="Login"></html:submit>
	</html:form>
</body>
</html>

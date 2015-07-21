<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<html:form action="add_item.do">
		Item Name: <html:text name="ItemForm" property="name"></html:text><br/>
		Item Description: <html:text name="ItemForm" property="description"></html:text><br/>
		Start Bid Amount: <html:text name="ItemForm" property="start_bid_amount"></html:text><br/>
		Start Bid Date: <html:text name="ItemForm" property="start_bid_datetime"></html:text><br/>
		End Bid Date: <html:text name="ItemForm" property="end_bid_datetime"></html:text><br/>		
		<html:submit value="Post" />
	</html:form>
</body>
</html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>FSOFT Bidding Web App</title>
</head>
<body style="background-color: gray">
	<div id="container" style="margin: auto; width: 250px;">
		<div>
			FSOFT Bidding Web App <a href="">Home</a> <a href="/item_form.jsp">Post
				Item</a> <a href="logout.do">Logout</a>
		</div>
		<table style="width: 100%">
			<thead>
				<tr>
					<th>Item Name</th>
					<th>Item Description</th>
					<th>Start Bid Amount</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${items}" var="item">
					<tr>
						<td><c:out value="${item.itemName}" /></td>
						<td><c:out value="${item.itemDescription}" /></td>
						<td><c:out value="Php${item.startBidAmount}.00" /></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>
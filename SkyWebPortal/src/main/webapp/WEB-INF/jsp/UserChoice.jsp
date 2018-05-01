<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">
	<form:form method="POST" action="/products/user/order" >
		<table class="table table-striped">
			<caption>Products Selected</caption>
			<thead>
				<tr>
					<th></th>
					<th>Product ID</th>
					<th>Category</th>
					<th>Product Name</th>
					<th>Location</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${catalogues}" var="catalogue">
					<tr>
						<td><input style="display: none;" type="checkbox" name="userOptions"
							id="__${catalogue.productId}"  value="${catalogue.productId}" checked ></td>
						<td>${catalogue.productId}</td>
						<td>${catalogue.category}</td>
						<td>${catalogue.prodName}</td>
						<td>${catalogue.locId}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<button class="btn btn-success" onclick="javascript:window.history.back();return false;" value="Back">Back</button> &nbsp; &nbsp; <input type="submit" class="btn btn-success" value="Confirm"/>
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h2>Congratulations! your order has been submitted!</h2>
	<table class="table table-striped">
			<caption>Products Selected</caption>
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Category</th>
					<th>Product Name</th>
					<th>Location</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${catalogues}" var="catalogue">
					<tr>
						<td>${catalogue.productId}</td>
						<td>${catalogue.category}</td>
						<td>${catalogue.prodName}</td>
						<td>${catalogue.locId}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
<%@ include file="common/footer.jspf"%>
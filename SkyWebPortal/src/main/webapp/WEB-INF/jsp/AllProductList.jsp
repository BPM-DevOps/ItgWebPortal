<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
		<table class="table table-striped">
			<caption>Sky Products Listing</caption>
			<thead>
				<tr>
					<th></th>
					<th>Product ID</th>
					<th>Category</th>
					<th>Product Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${catalogues}" var="catalogue">
					<tr>
						<td><input type="checkbox" name="catalogues" id="__${catalogue.productId}" ></td>
						<td>${catalogue.productId}</td>
						<td>${catalogue.category}</td>
						<td>${catalogue.prodName}</td>
					</tr>
				</c:forEach>
				
			</tbody>
		</table>
</div>
<%@ include file="common/footer.jspf"%>
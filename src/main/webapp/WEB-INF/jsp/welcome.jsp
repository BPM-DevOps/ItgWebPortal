<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>Welcome ${name}!! </h1>
	<table class="table table-striped">
			<caption>Customer Details Listing</caption>
			<thead>
				<tr>
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Location Id</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${locations}" var="locations">
					<tr>
						<td>${locations.customerId}</td>
						<td>${locations.customerName}</td>
						<td>${locations.locid}</td>
						<td>
					<a type="button" class="btn btn-success" href="/products/${locations.locid}">View products</a>
					</td>
					</tr>
					<tr>
					
					
					</tr>
				</c:forEach>
			</tbody>
			</table>
	
	
</div>
<%@ include file="common/footer.jspf"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
<form method="post" action="/productlocation/confirm" modelAttribute="catalog">
		<table class="table table-striped">
			<caption>${location} Products Listing</caption>
			
			<thead>
				<tr>
					<th></th>
					<th>Product ID</th>
					<th>Category</th>
					<th>Product Name</th>
					<th>Location</th>
					<!-- <th>Action</th> -->
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${catalogues}" var="catalogue">
				
					<tr>
						<td><input type="checkbox" name="catalogues" id="__${catalogue.productId}" ></td>
						<td>${catalogue.productId}</td>
						<td>${catalogue.category}</td>
						<td>${catalogue.prodName}</td>
						<td>${catalogue.locId}</td>
						<%-- <td><a type="button" class="btn btn-success"
							href="/products/${catalogue.locId}">View Products</a></td> --%>
					
					</tr>
				</c:forEach>
				<tr>
					<td><input type="submit" value="submit"></td>
					</tr>
			</tbody>
			
			<!-- <a class="button" href="/submit">Submit</a> -->
		</table>
		</form>
		
</div>

<%@ include file="common/footer.jspf"%>
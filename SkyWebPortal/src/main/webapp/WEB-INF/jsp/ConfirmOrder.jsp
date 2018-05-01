<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<div class="container">
	<p><h3><i class="fa fa-check" style="font-size:24px;color:green"></i>Congratulations! your order has been submitted!</h3>
	<br><h4><i class="fa fa-shopping-cart"></i>Order Items</h4>
		<hr>
			<c:forEach items="${catalogues}" var="catalogue">
				<ul><li>${catalogue.prodName}</li></ul>
			</c:forEach>
</div>
<%@ include file="common/footer.jspf"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="validate.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<div class="container">
	<form:form method="POST" action="/products/user/choice">
		<div id="checkoptions">
			<table class="table table-striped">
				<caption>${location} Products Listing</caption>
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
							<td><input type="checkbox" name="userOptions" class="ckbox"
								id="userOptions" value="${catalogue.productId}"></td>
							<td>${catalogue.productId}</td>
							<td>${catalogue.category}</td>
							<td>${catalogue.prodName}</td>
							<td>${catalogue.locId}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<p align="right">
				<label>Basket: <input type="text" name="total" class="num"
					size="6" value="0" readonly="readonly" /></label>
			</p>
			<button type="submit" onclick="return check()" class="btn btn-success">
				<i class="fa fa-shopping-cart"></i> CheckOut
			</button>
		</div>
	</form:form>
</div>


<!-- <script>
	function check() {
        if (!validateCheckBoxes()){
            alert("Please select atleast one product");
            return false;
        }
	}
	function validateCheckBoxes() 
    {
        var isValid = false;
        var allRows = document.getElementsByTagName("input");
        for (var i=0; i < allRows.length; i++) {
            if (allRows[i].type == 'checkbox') {
                if (allRows[i].checked == true) {
                       return true;
                }
            }
        }
        return isValid;
    }
	function attachCheckboxHandlers() {
		var el = document.getElementById('checkoptions');
		var elt = el.getElementsByTagName('input');
		for (var i = 0, len = elt.length; i < len; i++) {
			if (elt[i].type === 'checkbox') {
				elt[i].onclick = updateTotal;
			}
		}
	}

	function updateTotal(e) {
		var form = this.form;
		var val = parseInt(form.elements['total'].value);
		if (this.checked) {
			val += 1;
		} else {
			val -= 1;
		}
		form.elements['total'].value = val;
	}
	attachCheckboxHandlers();
</script> -->

<%@ include file="common/footer.jspf"%>
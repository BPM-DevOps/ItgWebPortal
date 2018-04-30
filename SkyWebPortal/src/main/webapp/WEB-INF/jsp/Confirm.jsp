<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
		
				<%-- <% String[] values=request.getParameterValues("catalogues");
					if (values!=null)%>
	     <ul><%for(String val: values){%>
	     <li><%=val%></li>
	    </ul><%}%> --%>
			
			 
			 <c:forEach items="${paramValues.catalogues}" var="catvalue">
				 <c:out value="${catvalue.prodName}" />
				
				<%-- <td>${value.productId}</td>
						<td>${value.category}</td>
						<td>${value.prodName}</td> --%>
			</c:forEach>
		
</div>

<%@ include file="common/footer.jspf"%>
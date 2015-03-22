<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="content-section-a">
	<div class="container">
		<div class="row">
		<c:forEach items="${servicesList}" var="servicesItem">
			<div class="col-lg-8 col-sm-6">
	            <h3><i class="fa fa-file-o"></i> <a href="services?id=<c:out value="${servicesItem.id}" />">
	            	<c:out value="${servicesItem.title}" />
	            </a></h3>
	            <p><c:out value="${servicesItem.text}" /></p>
	            <img src="${servicesItem.image}" width="400">
	        </div>
		</c:forEach>	        
		</div>
	</div>
</div>
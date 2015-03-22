<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" >
<link href="${pageContext.request.contextPath}/css/landing-page.css" rel="stylesheet" >
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" >
</head>
<body>

<jsp:include page="menu.jsp" />

<div class="content-section-a">
	<div class="container">
		<div class="row">
			<h2 class="section-heading">${title}</h2>
			<p class="lead">	
				${text}
		     </p>
		</div>
	</div>
</div>

<jsp:include page="services.jsp" />
<jsp:include page="service.jsp" />

<jsp:include page="banner.html" />
<jsp:include page="footer.jsp" />
</body>
</html>
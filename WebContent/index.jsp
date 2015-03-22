<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" >
<link href="${pageContext.request.contextPath}/css/landing-page.css" rel="stylesheet" >

</head>
<body>
<jsp:include page="menu.jsp" />

<div class="intro-header">
      <div class="container">
          <div class="row">
              <div class="col-lg-12">
                  <div class="intro-message">
                      <h1>Landing Page</h1>
                      <h3>A Template by Start Bootstrap</h3>
                      <hr class="intro-divider">
                      <ul class="list-inline intro-social-buttons">
                          <li>
                              <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                          </li>
                          <li>
                              <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                          </li>
                          <li>
                              <a href="#" class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                          </li>
                      </ul>
                  </div>
              </div>
          </div>

      </div>
      <!-- /.container -->

  </div>

<div class="content-section-a">
	<div class="container">
		<div class="row">
			<h2 class="section-heading">Jack London to Anna Strunsky</h2>
			<p class="lead">	
				Dear Anna:
				Did I say that the human might be filed in categories? Well, and if I did, let me qualify
				not all humans. You elude me. I cannot place you, cannot grasp you. I may boast that of nine out of ten, 
				under given circumstances, I can forecast their action; that of nine out of ten, by their word or action, 
				I may feel the pulse of their hearts. But of the tenth I despair. It is beyond me. You are that tenth.
				Were ever two souls, with dumb lips, more incongruously matched! We may feel in common surely,
			    we oftimes do and when we do not feel in common, yet do we understand; and yet we have no common tongue.
				Spoken words do not come to us. We are unintelligible. God must laugh at the mummery.
		     </p>
		     <img src="img/pioni.jpg" align="left">
		</div>
	</div>
</div>
<jsp:include page="banner.html" />
<jsp:include page="footer.jsp" />
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<footer>
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <ul class="list-inline">
                <c:forEach items="${bottomMenu}" var="mf">
                    <li>
                        <a href="<c:out value="${mf.url}" />"><c:out value="${mf.text}" /></a>
                    </li>
                    <li class="footer-menu-divider">&sdot;</li>
                </c:forEach>    
                   
                </ul>
                <p class="copyright text-muted small">Copyright &copy; Your Company 2014. All Rights Reserved</p>
            </div>
        </div>
    </div>
</footer>

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
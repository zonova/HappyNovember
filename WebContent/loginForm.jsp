<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="${pageContext.request.contextPath}/css/login-styles.css" rel="stylesheet" >

</head>
<body>
	<div class="vladmaxi-top">
        <a href="http://localhost:8080/HappyNovember">Home</a>

    <div class="clr"></div>
    </div>
<!--/top bar -->

<div id="wrapper">
    <div class="user-icon"></div>
    <div class="pass-icon"></div>
	
<form name="login-form" class="login-form" action="http://localhost:8080/HappyNovember/login" method="post">

    <div class="header">
		<h1>Sign in</h1>
		<span>Enter your username and password to log into your personal account.</span>
    </div>

    <div class="content">
		<input name="username" type="text" class="input username" value="login" onfocus="this.value=&#39;&#39;">
		<input name="password" type="password" class="input password" value="password" onfocus="this.value=&#39;&#39;">
    </div>

    <div class="footer">
		<input type="submit"  class="button">
		<a href="/HappyNovember/registration" class="register">Register</a>
    </div>

</form>
</div>
<div class="gradient"></div>

<script type="text/javascript">
$(document).ready(function() {
	$(".username").focus(function() {
		$(".user-icon").css("left","-48px");
	});
	$(".username").blur(function() {
		$(".user-icon").css("left","0px");
	});
	
	$(".password").focus(function() {
		$(".pass-icon").css("left","-48px");
	});
	$(".password").blur(function() {
		$(".pass-icon").css("left","0px");
	});
});
</script>
</body>
</html>
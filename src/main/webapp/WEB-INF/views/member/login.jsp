<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<c:import url="../template/meetingboard/bootstrapCss.jsp"></c:import>
<link rel="stylesheet" href="/resources/css/member/home.css">
<link rel="stylesheet" href="/resources/css/member/login.css">
</head>
<body>
	<c:import url="../template/member/memberHeader.jsp"></c:import>
	<div style="background-color: #FBF7F2; height: 47rem;">
		<div class="container loginTop">
			<form action="./login" method="post">
				<section class="container col-lg-6 loginFrame">
					<div id="loginContent">
						<h1>Login</h1>
						<div class="row">
							<div class="mb-3">
								<label for="id" class="form-label">ID</label>
								<input type="text" class="form-control" id="id" aria-describedby="emailHelp" name="id">
							</div>
							<div class="mb-3">
								<label for="pw" class="form-label">Password</label>
								<input type="password" class="form-control" id="pw" name="password">
							</div>
							
							<div>
							<button type="submit" class="btn btn-primary" id="btn">login</button>
							</div>
						</div>
					</div>
				</section>
			</form>
		</div>
	</div>
<c:import url="../template/meetingboard/bootstrapJs.jsp"></c:import>
</body>
</html>
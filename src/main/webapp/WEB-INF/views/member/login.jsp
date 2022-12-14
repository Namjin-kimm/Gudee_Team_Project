<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>๋ก๊ทธ์ธ๐โ๊ตฌ๋๋ง์ผ</title>
<c:import url="../template/meetingboard/bootstrapCss.jsp"></c:import>
<link rel="stylesheet" href="/resources/css/member/home.css">
<link rel="stylesheet" href="/resources/css/member/login.css">

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">
    
<style>
	@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700&display=swap');
</style>

</head>
<body>
	<c:import url="../template/member/memberHeader.jsp"></c:import>
	
	<div style="background-color: #FBF7F2; height: 47rem;">
		<div class="container loginTop">
			<form action="./login" method="post">
				<section class="container col-lg-6 loginFrame">
					<div id="loginContent">
						<img src="/resources/images/logo.png" class="login-logo">
						<h4 class="login-text">๋ก๊ทธ์ธ๐</h4>
						<div class="row">
							<div class="mb-3">
								<label for="id" class="form-label">์์ด๋</label>
								<input type="text" class="form-control" id="id" aria-describedby="emailHelp" name="id">
							</div>
							<div class="mb-3">
								<label for="pw" class="form-label">๋น๋ฐ๋ฒํธ</label>
								<input type="password" class="form-control" id="pw" name="password">
							</div>
							
							<div>
							<button type="submit" class="login-btn" id="btn">๋ก๊ทธ์ธ</button>
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
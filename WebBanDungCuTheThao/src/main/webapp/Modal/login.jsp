<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f8f9fa;
	margin: 0;
	padding: 0;
}

.modal-content {
	border-radius: 8px;
	border: none;
}

.modal-header {
	background-color: #007bff;
	color: #fff;
	border-bottom: none;
	border-top-left-radius: 8px;
	border-top-right-radius: 8px;
}

.modal-title {
	margin: 0;
	font-weight: bold;
}

.close {
	color: #fff;
	opacity: 1;
}

.modal-body {
	padding: 20px;
}

.form-group label {
	font-weight: bold;
}

.form-control {
	border-radius: 4px;
	border: 1px solid #ced4da;
	padding: 10px;
}

.btn-primary {
	background-color: #007bff;
	border: none;
	border-radius: 4px;
	padding: 10px 20px;
}

.btn-primary:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="modal fade" id="loginModal" tabindex="-1" role="dialog"
		aria-labelledby="loginModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="loginModalLabel">Đăng Nhập</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="LoginServlet" method="post">
						<div class="form-group">
							<label for="email">Email :</label> <input type="text"
								class="form-control" id="email" name="email" required>

						</div>
						<div class="form-group">
							<label for="password">Mật Khẩu:</label> <input type="password"
								class="form-control" id="password" name="password" required>
						</div>
						<div class="form-group">
							<div class="checkbox">
								<label><input type="checkbox" name="remember">
									Nhớ tài khoảng</label>
							</div>
						</div>
						<button type="submit" class="btn btn-primary">Đăng Nhập</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

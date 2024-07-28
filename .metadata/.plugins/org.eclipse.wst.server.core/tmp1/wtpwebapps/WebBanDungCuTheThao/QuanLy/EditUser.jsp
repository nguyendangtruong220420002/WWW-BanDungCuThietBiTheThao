<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Cập Nhật User</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Bootstrap JS và jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	display: flex;
	flex-direction: column;
	min-height: 100vh;
}

.logo {
	display: flex;
	align-items: center;
	justify-content: space-around;
	padding: 10px;
	background: linear-gradient(10deg, #344c4c, #001a33);
	border-radius: 1px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}

.logo-left {
	display: flex;
	align-items: center;
}

.logo-right {
	display: flex;
	align-items: center;
}

.logo img {
	height: 50px;
	width: 50px;
	margin-right: 10px;
}

.logo h1 {
	font-size: 20px;
	text-shadow: 1px 1px 0 #000, 2px 2px 0 #000, 3px 3px 0 #000, 4px 4px 0
		#000, 5px 5px 0 #000;
	color: #cccccc;
	font-weight: 100;
	margin-right: 20px;
}

.contact-info {
	display: flex;
	align-items: center;
	margin-right: 20px;
}

.contact-info h2 {
	margin: 0;
	font-size: 14px;
	color: #8c8c8c;
}

.social-icons img {
	height: 40px;
	width: 40px;
	margin: 10px;
}

header {
	background-color: #cc9900;
	height: 150px;
}

.memu-icons {
	height: 15px;
	width: 15px;
	margin: 0 5px;
}

.user-menu {
	display: none;
	position: absolute;
	background-color: white;
	border: 1px solid #ccc;
	padding: 10px;
	right: 15px;
	top: 40px;
}

.user-menu a {
	display: block;
	color: #333;
	text-decoration: none;
	margin: 5px 0;
}

.user-icon {
	position: relative;
	cursor: pointer;
}

.sidebar {
	width: 250px;
	height: 100%;
	background-color: #8c8c8c;
	padding-top: 20px;
	position: fixed;
	top: 150px; /* Dưới header */
	left: 0;
	overflow-y: auto;
}

.nav-list {
	list-style-type: none;
	padding: 0;
	margin: 0;
}

.nav-list li {
	position: relative;
}

.nav-list li a {
	display: block;
	color: white;
	padding: 14px 16px;
	text-decoration: none;
}

.nav-list li a:hover {
	background-color: #111;
}

.menu-icons {
	height: 20px;
	width: 20px;
	margin-right: 8px;
}

.dropdown-content {
	display: none;
	background-color: #444;
	padding-left: 20px;
}

.dropdown-content a {
	color: white;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: #555;
}

main {
	margin-left: 250px; /* Để lại khoảng trống cho sidebar */
	padding: 20px;
	flex: 1;
}

.show {
	display: block;
}
</style>
<script>
	function toggleUserMenu() {
		var userMenu = document.getElementById("user-menu");
		if (userMenu.style.display === "block") {
			userMenu.style.display = "none";
		} else {
			userMenu.style.display = "block";
		}
	}
	function toggleDropdown(event) {
		event.preventDefault();
		var dropdownContent = event.currentTarget.nextElementSibling;
		dropdownContent.classList.toggle("show");
	}
</script>
</head>
<body>
	<header>
		<div class="logo">
			<div class="logo-left">
				<img alt="" src="IMG/logo.png">
				<h1>SPORTS EQUIPMENT MIX</h1>
				<div class="contact-info">
					<img alt="" src="IMG/thu.png" class="social-icons">
					<h2>nguyendangtruong22042002@gmail.com</h2>
					<img alt="" src="IMG/call.png" class="social-icons">
					<h2>0326923816</h2>
				</div>
			</div>
			<div class="logo-right">
				<li>
					
						<input type="text" name="query" placeholder="Tìm kiếm...">
						<button type="submit">SEARCH</button>
				
				</li>
				<li><a href="#" class="user-icon" onclick="toggleUserMenu()"><img
						alt="" src="IMG/user.png" style="height: 40px; width: 40px"></a>
					<div id="user-menu" class="user-menu">
						<c:choose>
							<c:when test="${not empty sessionScope.ten}">
								<span class="user-info font-weight-bold text-black"> <c:out
										value="Xin chào: ${sessionScope.ten}" />
								</span>
								<button type="button" class="btn btn-danger"
									onclick="confirmLogout()">Đăng Xuất</button>
							</c:when>
							<c:otherwise>
								<button type="button" class="btn btn-primary"
									data-toggle="modal" data-target="#loginModal">Đăng
									Nhập</button>
								<button type="button" class="btn btn-primary"
									data-toggle="modal" data-target="#registerModal">Đăng
									Ký</button>
							</c:otherwise>
						</c:choose>
					</div></li>
				<li>
			</div>
		</div>
		<div style="text-align: center; margin-top: 10px">
			<h2 style="font-weight: bold;">Cập Nhật Tài Khoảng</h2>
		</div>
	</header>
	<nav class="sidebar">
		<ul class="nav-list">
			<li><a href="Admin.jsp"><img alt="" src="IMG/home.png"
					class="menu-icons">TRANG CHỦ</a></li>
			<li class="dropdown"><a href="javascript:void(0)"
				class="dropbtn" onclick="toggleDropdown(event)"><img alt=""
					src="IMG/menu.png" class="menu-icons">DANH SÁCH SẢN PHẨM</a>
				<div class="dropdown-content">
					<a href="LoaiSanPhamServlet">Loại Sản phẩm</a> <a
						href="DanhSachSanPhamServlet">Sản phẩm</a>
				</div></li>
			<li><a href="DanhSachUserServlet"><img alt="" src="IMG/user.png"
					class="menu-icons">QUẢN LÍ TÀI KHOẢN</a></li>
			<li><a href="DSDonHangServlet"><img alt="" src="IMG/sale.png"
					class="menu-icons">ĐƠN HÀNG</a></li>
		</ul>
	</nav>
	<main>
		<div class="container mt-4">
			<div class="row">
				<div class="col-md-6 offset-md-3">
					<div class="card">
						<div class="card-header bg-primary text-white">Chỉnh sửa Người Dùng</div>
                        <div class="card-body">
                            <form action="DanhSachUserServlet" method="post">
                                <!-- Hidden field to indicate the action -->
                                <input type="hidden" name="action" value="update" />
                                
                                <!-- Hidden field to store the user ID -->
                                <input type="hidden" name="maUser" value="${user.mauser}" />

                                <!-- User Name -->
                                <div class="form-group">
                                    <label for="tenuser">Tên:</label>
                                    <input type="text" class="form-control" id="tenuser" name="tenuser" value="${user.tenuser}" required>
                                </div>

                                <!-- Password -->
                                <div class="form-group">
                                    <label for="password">Mật khẩu:</label>
                                    <input type="password" class="form-control" id="password" name="password" value="${user.password}" required>
                                </div>

                                <!-- Email -->
                                <div class="form-group">
                                    <label for="email">Email:</label>
                                    <input type="email" class="form-control" id="email" name="email" value="${user.email}" required>
                                </div>

                                <!-- Role -->
                                <div class="form-group">
                                    <label for="role">Vai trò:</label>
                                    <input type="text" class="form-control" id="role" name="role" value="${user.role}" required>
                                </div>

                                <!-- Buttons -->
                                <button type="submit" class="btn btn-primary">Cập nhật</button>
                                <a href="DanhSachUserServlet" class="btn btn-secondary">Hủy</a>
                            </form>
                        </div>
                    </div>
				</div>
			</div>
		</div>
	</main>


	<footer> </footer>

	<jsp:include page="../Modal/register.jsp" />
	<jsp:include page="../Modal/login.jsp" />
	<!-- Modal Đăng ký thành công -->
	<div class="modal fade" id="registerSuccessModal" tabindex="-1"
		role="dialog" aria-labelledby="registerSuccessModalLabel"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="registerSuccessModalLabel">Đăng Ký
						Thành Công</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Chúc mừng! Bạn đã đăng ký thành công.
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Đóng</button>
				</div>
			</div>
		</div>
	</div>

	<!-- JavaScript để hiển thị modal khi cần -->
	<script>
		$(document)
				.ready(
						function() {
	<%-- Kiểm tra xem thuộc tính registerSuccess có trong session không --%>
		
	<%if (session.getAttribute("registerSuccess") != null && (Boolean) session.getAttribute("registerSuccess")) {%>
		
	<%-- Hiển thị modal "Đăng ký thành công" --%>
		$('#registerSuccessModal').modal('show');
	<%}
session.removeAttribute("registerSuccess");%>
		});
	</script>
	<!-- Modal Đăng nhập thành công -->
	<div class="modal fade" id="loginSuccessModal" tabindex="-1"
		role="dialog" aria-labelledby="loginSuccessModalLabel"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="loginSuccessModalLabel">Đăng Nhập
						Thành Công</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Chào mừng bạn đã đăng nhập thành công.
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Đóng</button>
				</div>
			</div>
		</div>
	</div>
	<script>
		$(document)
				.ready(
						function() {
	<%if (session.getAttribute("loginSuccess") != null && (Boolean) session.getAttribute("loginSuccess")) {%>
		$('#loginSuccessModal').modal('show');
	<%session.removeAttribute("loginSuccess");%>
		// Thay đổi nút "Đăng Nhập" và "Đăng Ký" thành nút "Đăng Xuất"
							var tenuser = '${sessionScope.ten}'; // Lấy tên người dùng từ session
							$('#user-menu')
									.html(
											'<span class="user-info font-weight-bold text-black">Xin Chào  '
													+ tenuser
													+ '</span>'
													+ '<button type="button" class="btn btn-danger" onclick="confirmLogout()">Đăng Xuất</button>');
	<%}%>
		});

		function confirmLogout() {
			// Hiển thị modal xác nhận đăng xuất
			$('#confirmLogoutModal').modal('show');
		}

		function logout() {
			window.location.href = "LogoutServlet";
		}
	</script>
	<!-- Modal Đăng nhập không thành công -->
	<div class="modal fade" id="loginFailedModal" tabindex="-1"
		role="dialog" aria-labelledby="loginFailedModalLabel"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="loginFailedModalLabel">Đăng Nhập
						Không Thành Công</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Đăng nhập không thành công. Vui lòng
					kiểm tra lại email và mật khẩu.</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Đóng</button>
				</div>
			</div>
		</div>
	</div>
	<script>
		$(document)
				.ready(
						function() {
	<%-- Kiểm tra xem thuộc tính loginFailed có trong session không --%>
		
	<%if (session.getAttribute("loginFailed") != null && (Boolean) session.getAttribute("loginFailed")) {%>
		
	<%-- Hiển thị modal "Đăng nhập không thành công" --%>
		$('#loginFailedModal').modal('show');
	<%}
session.removeAttribute("loginFailed");%>
		});
	</script>
	<!-- Modal xác nhận đăng xuất -->
	<div class="modal fade" id="confirmLogoutModal" tabindex="-1"
		role="dialog" aria-labelledby="confirmLogoutModalLabel"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="confirmLogoutModalLabel">Xác nhận
						đăng xuất</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Bạn có chắc chắn muốn đăng xuất không?
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Hủy</button>
					<button type="button" class="btn btn-primary" onclick="logout()">Đăng
						xuất</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
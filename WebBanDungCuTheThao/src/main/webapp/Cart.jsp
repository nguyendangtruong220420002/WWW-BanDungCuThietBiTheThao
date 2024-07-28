<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Giỏ Hàng</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
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
	height: 130px;
}

header nav {
	text-align: center;
}

header nav ul {
	list-style: none;
	padding: 0;
}

header nav ul li {
	display: inline;
	margin: 10px;
	transition: background-color 0.3s;
}

header nav ul li a {
	font-size: 20px;
	text-decoration: none;
	color: black;
	border-radius: 5px;
}

header nav ul li a:hover {
	background-color: #995c00;
	font-size: 30px;
	color: white;
}

header nav ul li form {
	display: inline;
}

header nav ul li form input {
	padding: 5px;
}

header nav ul li form button {
	padding: 5px 10px;
}

header nav ul li form a img {
	padding: 5px 10px;
	height: 40px;
	width: 40px;
}

.memu-icons {
	height: 15px;
	width: 15px;
	margin: 0 5px;
}

.ul {
	display: flex;
	justify-content: space-around;
	height: 0px;
	align-items: center;
	margin-top: 30px;
}

.ul-right {
	display: flex;
	align-items: center;
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

main {
	padding: 20px;
	text-align: center;
	height: auto;
	flex: 1;
}

footer {
	background-color: #333;
	color: white;
	padding: 10px 0;
	width: 100%;
	margin-top: 5px;
}

footer div h4 {
	color: #cc9900;
	font-size: 18px;
}

footer h1 {
	text-align: center;
}

footer form {
	text-align: center;
}

footer div p {
	color: #cccccc;
	font-size: 15px;
	line-height: 1.6;
}

footer form {
	display: flex;
	justify-content: center;
	align-items: center;
	margin-bottom: 20px;
}

footer form input[type="text"] {
	padding: 10px;
	font-size: 14px;
	border: 1px solid #ccc;
	border-radius: 5px;
	margin-right: 10px;
	width: 300px;
}

footer form button {
	padding: 10px 20px;
	font-size: 14px;
	background-color: #cc9900;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s;
}

.card-img-top {
	height: 100px;
}

.card-text {
	text-decoration: line-through;
	margin-bottom: 10px;
	font-size: 18px;
	padding-top: 5px;
	margin: 5px;
}

.card-text-giam {
	font-size: 30px;
	color: #cc2900;
	font-weight: bold;
}

.product-item {
	width: 400px;
	height: 600px;
	margin: 20px;
	transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.product-item:hover {
	transform: translateY(-5px);
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.col-md-4 {
	transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.col-md-4:hover {
	transform: translateY(-5px);
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.conter {
	margin-left: 40px;
	margin-left: 40px;
}

.custom-row {
	padding-left: 50px;
	max-width: 1900px;
	height: auto;
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

	$(document).ready(
			function() {
				$('#filterByCategory').change(
						function() {
							var selectedCategoryId = $(this).val();
							$('.product-item').hide(); // Ẩn tất cả các sản phẩm

							if (selectedCategoryId === '') {
								$('.product-item').show(); // Hiển thị lại nếu chọn "Chọn loại sản phẩm"
							} else {
								$(
										'.product-item[data-category="'
												+ selectedCategoryId + '"]')
										.show(); // Hiển thị sản phẩm thuộc loại được chọn
							}
						});
			});
	function handleProductListClick() {
		// Làm bất cứ điều gì bạn cần ở đây, ví dụ như kích hoạt chức năng lọc sản phẩm
		var select = document.getElementById('filterByCategory');
		if (select) {
			// Trigger event lọc sản phẩm
			var event = new Event('change');
			select.dispatchEvent(event);
		}
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
				<img alt="" src="IMG/faceboock.png" class="social-icons"> <img
					alt="" src="IMG/inta.png" class="social-icons">
			</div>
		</div>
		<div class="menu">
			<nav>
				<ul>
					<div class="ul">
						<div class="ul-left">
							<li><a href="index.jsp"><img alt="" src="IMG/home.png"
									class="memu-icons">TRANG CHỦ</a></li>
							<li><a href="ProductsServlet"><img alt=""
									src="IMG/menu.png" class="memu-icons">DANH SÁCH SẢN PHẨM</a></li>
							<li><a href="products.jsp"><img alt=""
									src="IMG/tintuc.png" class="memu-icons">TIN TỨC</a></li>
							<li><a href="products.jsp"><img alt=""
									src="IMG/user.png" class="memu-icons">GIỚI THIỆU</a></li>
							<li><a href="products.jsp"><img alt=""
									src="IMG/sale.png" class="memu-icons">CHÍNH SÁCH</a></li>
						</div>
						<div class="ul-right">
							<li>
								<form action="search.jsp" method="get">
									<input type="text" name="query" placeholder="Tìm kiếm...">
									<button type="submit">SEARCH</button>
								</form>
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
							<div style="display: flex;">
							<a href="Cart.jsp"><img alt="" src="IMG/cart.png"
									style="height: 40px; width: 40px;"> </a>
									<div style="border-radius: 15px; border: 2px solid #ffffff; position: absolute; margin-left: 30px; 
									background-color: red; width: 25px; height: auto ; max-width:auto; text-align: center; color: white; font-size: 15px
									">${fn:length(cart.carts)}</div>
							</div>
							</li>
						</div>

					</div>

				</ul>
			</nav>
		</div>
	</header>

	<main style="width: auto; height: auto;">

		<div
			style="display: flex; width: 1750px; height: auto	; margin: 20px; margin-left: 130px; justify-content: space-between">
			<div
				style="border-radius: 5px; border: 2px solid #6c757d; width: 1300px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2)">
				<h2
					style="font-size: 33px; margin-right: 1110px; margin-top: 20px; color: #000099; font-weight: bold;">Giỏ
					hàng</h2>
				<c:choose>
					<c:when test="${empty cart.carts}">
						<p style="font-size: 20px; color: red;">Giỏ hàng trống !!!.</p>
					</c:when>
					<c:otherwise>
						<table class="table table-bordered"
							style="width: 1240px; margin-left: 25px; margin-top: 20px">
							<thead class="thead-light">
								<tr style="font-size: 20px">
									<th>Actions</th>
									<th>IMG</th>
									<th>Sản Phẩm</th>
									<th>Giá</th>
									<th>Số Lượng</th>
									<th>Tạm Tính</th>

								</tr>
							</thead>
							<c:forEach var="item" items="${cart.carts}" varStatus="counter">
								<tr style="font-size: 20px; color: #666666; text-align: center;">
									<td>
										<form action="CartServlet" method="post">
											<input type="hidden" name="action" value="delete"> <input
												type="hidden" name="index" value="${counter.count}">

											<button type="submit" style="border: none;">
												<i class="fas fa-trash-alt"></i>
											</button>

										</form>
									</td>
									<td><img src="IMG/IMG_SanPham/${item.img}"
										alt="${item.img}" width="50px" height="50px"></td>
									<td>${item.tensanpham}</td>
									<td><fmt:formatNumber value="${item.giagiam}" type="currency" currencySymbol="₫" /> </td>
									
									<td>
										<form action="CartServlet" method="post">
											<input type="hidden" name="action" value="update"> <input
												type="hidden" name="index" value="${counter.count}">
											<input type="text" name="quantity" value="${item.soluongmua}"
												style="border: 0.5px; width: 100px; height: 30px; text-align: center; font-size: 20px;">
											<button type="submit" style="border: none;">
												<i class="fas fa-tools"></i>
											</button>
										</form>
									</td>
									<td><fmt:formatNumber value="${item.tamtinh}" type="currency" currencySymbol="₫" /> </td>
									

								</tr>
							</c:forEach>
							<tr>
								<td colspan="2"><input type="text" placeholder="Mã Ưu đãi"
									style="border-radius: 2px; border-color: #bfbfbf"></td>
									
								
							</tr>
						</table>
						<div style=" width: 870px; display: flex;justify-content: space-between; margin-left: 20px">
						<div style="display: flex;flex-direction: column;">
						<a href="ProductsServlet" 
							style="margin: 10px; font-size: 20px; color:black; "> >>>Quay lại <<<</a>
							<a href="OrderDetailServlet" 
							style="margin: 10px; font-size: 20px; color:black; "> >>>Chi Tiết Đơn Hàng <<<</a></div>
							<label
							style="margin: 10px; font-size: 27px; color: #000099; ">Cộng
							giỏ hàng</label>
						</div>
						<div
							style=" width: 550px; height: 310px; margin-left: 700px;">
							<div
								style="font-size: 21px; display: flex; border-radius: 2px; border: 2px solid #cccccc; height: 60px;">

								<label
									style="font-weight: bold; margin-top: 15px; margin-left: 30px; font-size: 20px">Tạm
									tính</label>
								<div style="margin-left: 120px; margin-top: 15px;">
									<input type="hidden"><fmt:formatNumber value="${cart.orderTotal}" type="currency" currencySymbol="₫" /></div>
									
							</div>

							<div
								style="font-size: 21px; display: flex; border-radius: 2px; border: 2px solid #cccccc; height: 170px;">

								<div style="width: 100px; width: 160px; margin-top: 10px">
									<label style="font-weight: bold; font-size: 20px;">Giao
										hàng</label>
								</div>
								<div style="margin-left: 50px; margin-top: 10px; width: 300px">
									<label style="font-weight: bold; margin-right: 60px">Giao
										hàng miễn phí</label> <label
										style="margin-left: 20px; font-size: 19px">Tùy chọn
										giao hàng sẽ được cập nhật trong quá trình thanh toán. <br>
									</label> <label
										style="margin-right: 50px; font-size: 19px; margin-top: 10px"><a
										href="#">Tính phí giao hàng. </a> <i class="fas fa-truck"></i></label>
								</div>
							</div>
							<div
								style="font-size: 21px; display: flex; border-radius: 2px; border: 2px solid #cccccc; height: 60px;">

								<label
									style="font-weight: bold; margin-top: 15px; margin-left: 30px; font-size: 20px">Tổng</label>
								<div style="margin-left: 160px; margin-top: 15px;">
									<input type="hidden"><fmt:formatNumber value="${cart.orderTotal}" type="currency" currencySymbol="₫" /></div>
							</div>
							
						</div>
						<form action="PayServlet" method="get">
    
    					<div style=" width: 550px; height: 310px; margin-left: 700px;">
						<input type="hidden" name="action" value="processPayment">
						<input type="submit" value="Tiến Hành Thanh Toán" style=" width: 550px; height: 70px; 
						font-size: 25px; font-weight: bold; background-color:  #c6538c; color: white; border: none;border-radius: 3px ">
						<%
									String payError = (String) request.getAttribute("payError");
									if (payError != null && !payError.isEmpty()) {
									%>
									<span style="color: red; font-size: 20px;"><%=payError%></span>
									<%
									}
									%>
						</div>
    					</form>					
					</c:otherwise>
				</c:choose>
			</div>
			<div
				style="display: flex; flex-direction: column; width: 400px; height: auto; ">
				<div
					style="width: 400px; height: 300px;  border-radius: 5px; border: 2px solid #6c757d;">
					<h2
						style="font-size: 33px; color: white; color: white; background-color: #cc9900; width: 400px; height: 50px; font-weight: bold; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2)">
						<i class="fas fa-people-carry" style="color: blue; margin: 10px"></i>HỔ
						TRỢ ONLINE
					</h2>

					<div
						style="display: flex; width: 400px; align-items: center; height: 50px">
						<p
							style="font-size: 18px; font-weight: bold; color: #0052cc; margin-left: 20px; margin-top: 10px">TƯ
							VẤN BÁN HÀNG</p>
						<p
							style="font-size: 27px; font-weight: bold; color: #339933; margin-left: 20px">0123456789</p>
					</div>

					<div
						style="display: flex; width: 400px; align-items: center; height: 30px">
						<img alt="" src="IMG/zalo.png"
							style="width: 40px; height: 40px; margin-left: 20px;">
						<p
							style="font-size: 20px; font-weight: bold; color: red; margin-left: 10px; margin-top: 20px">0123456789</p>
					</div>

					<div
						style="display: flex; width: 400px; align-items: center; height: 100px">
						<p
							style="font-size: 18px; font-weight: bold; color: #0052cc; margin-left: 20px; margin-top: 10px">HỔ
							TRỢ KỸ THUẬT</p>
						<p
							style="font-size: 27px; font-weight: bold; color: #339933; margin-left: 20px">0326923816</p>
					</div>

					<div
						style="display: flex; width: 400px; align-items: center; height: 30px">
						<img alt="" src="IMG/zalo.png"
							style="width: 40px; height: 40px; margin-left: 20px;">
						<p
							style="font-size: 20px; font-weight: bold; color: red; margin-left: 10px; margin-top: 20px">0326923816</p>
					</div>

				</div>
			</div>
		</div>
	</main>

	<div>
		<img alt="" src="IMG/cuối.png" style="width: 100%">
	</div>
	<footer>
		<h1>THÔNG TIN LIÊN LIÊN HỆ CỦA CHÚNG TÔI</h1>
		<form action="search.jsp" method="get">
			<input type="text" name="query"
				placeholder="Nhập Email nhận tin khuyến mãi">
			<button type="submit">ĐĂNG KÝ</button>
		</form>
		<div style="display: flex; justify-content: space-around;">
			<div style="align-items: center;">
				<h4>SPORTS EQUIPMENT MIX</h4>
				<p>
					SPORTS EQUIPMENT MIX nhà cung cấp<br> dụng cụ thể thao hàng
					đầu tại Việt Nam.<br> Với SPORTS EQUIPMENT MIX chất lượng sản
					<br> phẩm được ưu tien hàng đầu, uy tín là tiêu<br> chí
					phát triển của chúng tôi.Hy vọng sảm <br> phẩm làm cho bạn hài
					lòng khi sử dụng.
				</p>
			</div>
			<div>
				<h4>Sinh viên thực hiện</h4>
				<p>Nguyễn Đang Trường</p>
			</div>
			<div>
				<h4>MSSV</h4>
				<p>20062481</p>
			</div>
			<div>
				<h4>THÔNG TIN LIÊN HỆ</h4>
				<p>
					Hiện shop chỉ bán online, không tiếp <br> khách đến cửa hàng.
				</p>
				<p>
					Thời gian làm việc: 8g00 đến 17g00,từ <br> thứ 2 đến thứ 7
					(nghỉ trưa từ 12g đến 13g). Những giờ khác tư vấn online.<br>
					SĐT liên hệ ngoài giờ :0326923816
				</p>
				<p>Email:nguyendangtruong22042002@hmail.com</p>
			</div>
		</div>

	</footer>

	<jsp:include page="Modal/register.jsp" />
	<jsp:include page="Modal/verify.jsp" />
	<jsp:include page="Modal/login.jsp" />
	
	
	 <script>
        $(document).ready(function() {
            // Kiểm tra nếu thuộc tính "showVerifyModal" có trong session và có giá trị true
            <% if (session.getAttribute("showVerifyModal") != null && (Boolean) session.getAttribute("showVerifyModal")) { %>
                $('#verifyModal').modal('show');
                <% session.removeAttribute("showVerifyModal"); %>
            <% } %>
        });
    </script>
<script>
    $(document).ready(function() {
        // Kiểm tra nếu thuộc tính "registerSuccess" có trong session và có giá trị true
        <% if (session.getAttribute("registerSuccess") != null) { %>
            <% Boolean registerSuccess = (Boolean) session.getAttribute("registerSuccess"); %>
            <% if (registerSuccess) { %>
                $('#registerSuccessModal').modal('show');
            <% } else { %>
                $('#registerFailureModal').modal('show');
            <% } %>
            <% session.removeAttribute("registerSuccess"); %>
        <% } %>
    });
</script>
	<!-- Modal Đăng Ký Thành Công -->
<div class="modal fade" id="registerSuccessModal" tabindex="-1" role="dialog" aria-labelledby="registerSuccessModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="registerSuccessModalLabel">Đăng ký thành công</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
           Chúc mừng!. Xác thực tài khoản thành công
             .  Bạn đã đăng ký thành công. Vui lòng đăng nhập lại.
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal Đăng Ký Không Thành Công -->
<div class="modal fade" id="registerFailureModal" tabindex="-1" role="dialog" aria-labelledby="registerFailureModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="registerFailureModalLabel">Đăng ký không thành công</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Đăng ký không thành công. Mã xác thực bạn nhập không chính xác. Vui lòng thử lại.
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
            </div>
        </div>
    </div>
</div>
	<!-- JavaScript để hiển thị modal khi cần -->

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
    $(document).ready(function() {
        
        <% if (session.getAttribute("loginSuccess") != null && (Boolean) session.getAttribute("loginSuccess")) { %>
            $('#loginSuccessModal').modal('show');
            <% session.removeAttribute("loginSuccess"); %>

            // Thay đổi nút "Đăng Nhập" và "Đăng Ký" thành nút "Đăng Xuất"
            var tenuser = '${sessionScope.ten}'; // Lấy tên người dùng từ session
            $('#user-menu').html('<span class="user-info font-weight-bold text-black">Xin Chào  ' + tenuser + '</span>' +
                '<button type="button" class="btn btn-danger" onclick="confirmLogout()">Đăng Xuất</button>');
        <% } %>
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
    $(document).ready(function() {
        <%-- Kiểm tra xem thuộc tính loginFailed có trong session không --%>
        <% if (session.getAttribute("loginFailed") != null && (Boolean) session.getAttribute("loginFailed")) { %>
            <%-- Hiển thị modal "Đăng nhập không thành công" --%>
            $('#loginFailedModal').modal('show');
        <% }
           session.removeAttribute("loginFailed");
        %>
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

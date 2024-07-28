<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiết Sản Phẩm</title>
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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.8.1/font/bootstrap-icons.min.css">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
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
							<li><div style="display: flex;">
							<a href="Cart.jsp"><img alt="" src="IMG/cart.png"
									style="height: 40px; width: 40px;"> </a>
									<div style="border-radius: 15px; border: 2px solid #ffffff; position: absolute; margin-left: 30px; 
									background-color: red; width: 25px; height: auto ; max-width:auto; text-align: center; color: white; font-size: 15px
									">${fn:length(cart.carts)}</div>
							</div></li>
						</div>

					</div>

				</ul>
			</nav>
		</div>
	</header>

	<main style="width: auto; height: auto; background-color: #f2f2f2">

		<div
			style="display: flex; width: 1750px; height: auto	; margin: 20px; margin-left: 130px; justify-content: space-between;">
			<div
				style="border-radius: 5px; border: 2px solid #6c757d; width: 1300px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2); background-color: #ffffff">
				
				<div style="width: 1250px; margin-left: 20px">
				<h2
					style="font-size: 20px; text-align: left; width: 200px; margin-top: 20px; color: #000099; font-weight: bold;">Chi tiết đơn hàng</h2>
					<hr style="background-color: #cc6600; height: 1.5px">
					<div style="display: flex;"> 
						 <div class="col-md-6">
                			<img src="IMG/IMG_SanPham/${sanPham.img}" class="img-thumbnail" alt="${sanPham.tensanpham}" width="700" height="900">
            			</div>
            			
            			 <div class="col-md-6" style=" max-width: 550px; margin-left: 20px; ">
                <h2 style="text-align: left; color: #000099; margin-top: 10px">${sanPham.tensanpham}</h2>
                <img alt="" src="IMG/giaohang.png" width="500px" style="margin-top: 5px">
                <hr>
                		<div style="display: flex; ">
                		<label style="font-weight: bold;color: #000099; font-size: 18px; margin-top: 22px;">Giá Bán:</label>
                		<p  style="color: #8c8c8c; font-size: 20px; text-decoration: line-through; margin-top: 20px; font-weight: bold; margin-left: 10px"> <fmt:formatNumber  value="${sanPham.gia}" type="currency" currencySymbol="₫" /></p>
                <p style="color: #cc2900; font-size: 40px; font-weight: bold; margin-left: 5px"><fmt:formatNumber value="${sanPham.giagiam}" type="currency" currencySymbol="₫" /></p>
                		</div>
                
                		<form action="CartServlet" method="post">
                    <input type="hidden" name="img" value="${sanPham.img}">
                    <input type="hidden" name="tensanpham" value="${sanPham.tensanpham}">
                    <input type="hidden" name="giatien" value="${sanPham.giagiam}">
                    <div style="display: flex; height: 75px;">
                    <div class="form-group" style="width: 110px; font-size: 19px; text-align: left;">
                        <label for="soluongmua">Số lượng:</label>
                        <input type="number" class="form-control" id="soluongmua" name="soluongmua" value="1" min="1" style="text-align: center; width: 70px; margin-left: 10px; height: 35px; font-size: 18px; background-color: #f2f2f2">
                    </div>
                     <input type="hidden" name="action" value="add">
                    <button type="submit" class="btn btn-warning" style="font-size: 27px; font-weight: bold;">THÊM VÀO GIỎ HÀNG <p style="font-size: 15px; font-weight: normal;">Đặt hàng Online hoặc gọi tới Hotline</p></button>
                   
                     </div>
                     <div style="display: flex;  height: 80px; margin-top: 10px">
                      <input type="hidden" name="action" value="add">
                    <button type="submit" class="btn btn-danger" style="font-size: 23px; font-weight:bold; padding-left:  80px; padding-right: 90px">MUA HÀNG<p style="font-size: 15px ;font-weight: normal; width: 350px; margin-top: 5px">Giao Hàng Tận Nơi Hoặc Nhận Tại Cửa Hàng</p></button>
                     </div>
                     
                      <div style="display: flex;  height: 80px; margin-top: 10px">
                      <input type="hidden" name="action" value="add">
                    <button type="submit" class="btn btn-info" style="font-size: 23px; font-weight:bold; padding-left:  80px; padding-right: 90px">TRẢ GÓP QUA THẺ<p style="font-size: 15px ;font-weight: normal; width: 350px; margin-top: 5px">Visa, Master, JCB...</p></button>
                     </div>
                     
                     <div style="display: flex;  height: 80px; margin-top: 10px">
                      <input type="hidden" name="action" value="add">
                    <button type="submit" class="btn btn-primary" style="font-size: 23px; font-weight:bold; padding-left:  80px; padding-right: 90px">MUA NGAY - TRẢ SAU<p style="font-size: 15px ;font-weight: normal; width: 350px; margin-top: 5px">FE CREDIT, HOME CREDIT, VIB, TPBank, ACB,...</p></button>
                     </div>
                		</form>
                	
               </div>	
					</div>
					<div style="background-color: #000099; color: white; font-weight: bold; width: 100px; height: 50px;text-align: center; margin-left: 15px">
					<p style="font-size: 20px; padding-top: 10px">Mô tả</p></div>
					<div style="border-radius: 1px; border: 2px solid #d9d9d9; width: 1180px;  margin-left: 15px"> 
					
					 <p style="font-size: 20px; text-align: left; padding: 10px; margin: 10px">${sanPham.mota}</p>
					</div>
           
           
        </div>
	
			</div>
			<div
				style="display: flex; flex-direction: column; width: 400px; height: auto; ">
				<div
					style="width: 400px; height: 350px;   background-color: #d6e0f5">
					<div
						style="font-size: 20px; color: white; color: white; background: linear-gradient(10deg, #344c4c, #001a33); width: 400px; height: 50px; font-weight: bold; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);">
						<p style="padding-top: 10px">THỂ THAO SPORTS EQUIPMENT MIX</p>

					</div>


					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 30px">
						<i class="bi bi-check2-circle" style="color: #24478f; margin-left: 10px; font-size: 30px; font-weight: bold; height: 50px"></i>
						<p
							style="font-size: 20px; text-align:left; color: #24478f; margin-left: 10px; margin-top: 20px">100% sản phẩm chính hãng, kiểu dáng hiện đại nhất 2024</p>
					</div>

					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 40px">
						<i class="bi bi-check2-circle" style="color: #24478f; margin-left: 10px; font-size: 30px; font-weight: bold; height: 50px"></i>
						<p
							style="font-size: 20px; text-align:left; color: #24478f; margin-left: 10px; margin-top: 20px">Dịch vụ bảo hành tận tâm, sẵn sàng phục vụ 24h</p>
					</div>

					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 40px">
						<i class="bi bi-check2-circle" style="color: #24478f; margin-left: 10px; font-size: 30px; font-weight: bold; height: 50px"></i>
						<p
							style="font-size: 20px; text-align:left; color: #24478f; margin-left: 10px; margin-top: 20px">Sản phẩm chất lượng vượt bậc nhất, giá thành tốt nhất</p>
					</div>
					
					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 40px">
						<i class="bi bi-check2-circle" style="color: #24478f; margin-left: 10px; font-size: 30px; font-weight: bold; "></i>
						<p
							style="font-size: 20px; text-align:left; color: #24478f; margin-left: 10px; margin-top: 20px">Luôn có nhiều ưu đãi tặng kèm</p>
					</div>

				</div>
				
				<div
					style="width: 400px; height: 320px;   background-color: #e6e6e6; margin-top: 80px">
					<div
						style="font-size: 20px;  color: black;  width: 400px; height: 50px; font-weight: bold; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);">
						<p style="padding-top: 10px; ">THÔNG TIN LIÊN HỆ </p>

					</div>


					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 30px">
						<i class="bi bi-geo-alt-fill" style="color: red; margin-left: 10px; font-size: 30px; font-weight: bold; height: 50px"></i>
						<p
							style="font-size: 20px; text-align:left; color: #24478f; margin-left: 10px; margin-top: 20px"> Hiện shop chỉ bán online, không tiếp khách đến cửa hàng.</p>
					</div>

					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 40px">
						<i class="bi bi-phone-vibrate-fill" style="color: black; margin-left: 10px; font-size: 30px; font-weight: bold; "></i>
						<p
							style="font-size: 20px; text-align:left; color: red;font-weight:bold; margin-left: 10px; margin-top: 20px">0326923816</p>
					</div>

					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 20px">
						<i class="bi bi-envelope-check-fill" style="color: black; margin-left: 10px; font-size: 30px; font-weight: bold; "></i>
						<p
							style="font-size: 18px; text-align:left; color: #24478f; margin-left: 10px; margin-top: 20px">nguyendangtruong22042002@gmail.com</p>
					</div>
					
					<div
						style="display: flex; width: 380px; align-items: center; height: 30px; margin-top: 20px">
						<i class="bi bi-alarm-fill" style="color: black; margin-left: 10px; font-size: 30px; font-weight: bold; "></i>
						<p
							style="font-size: 20px; text-align:left; color: #24478f; margin-left: 10px; margin-top: 20px">8:00 AM - 22:00 PM </p>
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-07-28 05:04:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1722109420514L));
    _jspx_dependants.put("jar:file:/D:/WWW/20062481_NguyenDangTruong_DeTai26/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/WebBanDungCuTheThao/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602848772000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Trang Quản Lý</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- Bootstrap JS và jQuery -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	min-height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: space-around;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	background: linear-gradient(10deg, #344c4c, #001a33);\r\n");
      out.write("	border-radius: 1px;\r\n");
      out.write("	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo-left {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo-right {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo img {\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	width: 50px;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo h1 {\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	text-shadow: 1px 1px 0 #000, 2px 2px 0 #000, 3px 3px 0 #000, 4px 4px 0\r\n");
      out.write("		#000, 5px 5px 0 #000;\r\n");
      out.write("	color: #cccccc;\r\n");
      out.write("	font-weight: 100;\r\n");
      out.write("	margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact-info {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact-info h2 {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("	color: #8c8c8c;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons img {\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	width: 40px;\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("	background-color: #cc9900;\r\n");
      out.write("	height: 150px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".memu-icons {\r\n");
      out.write("	height: 15px;\r\n");
      out.write("	width: 15px;\r\n");
      out.write("	margin: 0 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".user-menu {\r\n");
      out.write("	display: none;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	border: 1px solid #ccc;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	right: 15px;\r\n");
      out.write("	top: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".user-menu a {\r\n");
      out.write("	display: block;\r\n");
      out.write("	color: #333;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	margin: 5px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".user-icon {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar {\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-color:  #8c8c8c;\r\n");
      out.write("    padding-top: 20px;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    top: 150px; /* Dưới header */\r\n");
      out.write("    left: 0;\r\n");
      out.write("    overflow-y: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-list {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-list li {\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-list li a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-list li a:hover {\r\n");
      out.write("    background-color: #111;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu-icons {\r\n");
      out.write("    height: 20px;\r\n");
      out.write("    width: 20px;\r\n");
      out.write("    margin-right: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    background-color: #444;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 12px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {\r\n");
      out.write("    background-color: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("main {\r\n");
      out.write("    margin-left: 400px; /* Để lại khoảng trống cho sidebar */\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    flex: 1; \r\n");
      out.write("    width: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".show {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("	function toggleUserMenu() {\r\n");
      out.write("		var userMenu = document.getElementById(\"user-menu\");\r\n");
      out.write("		if (userMenu.style.display === \"block\") {\r\n");
      out.write("			userMenu.style.display = \"none\";\r\n");
      out.write("		} else {\r\n");
      out.write("			userMenu.style.display = \"block\";\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	function toggleDropdown(event) {\r\n");
      out.write("		event.preventDefault();\r\n");
      out.write("		var dropdownContent = event.currentTarget.nextElementSibling;\r\n");
      out.write("		dropdownContent.classList.toggle(\"show\");\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"logo\">\r\n");
      out.write("			<div class=\"logo-left\">\r\n");
      out.write("				<img alt=\"\" src=\"IMG/logo.png\">\r\n");
      out.write("				<h1>SPORTS EQUIPMENT MIX</h1>\r\n");
      out.write("				<div class=\"contact-info\">\r\n");
      out.write("					<img alt=\"\" src=\"IMG/thu.png\" class=\"social-icons\">\r\n");
      out.write("					<h2>nguyendangtruong22042002@gmail.com</h2>\r\n");
      out.write("					<img alt=\"\" src=\"IMG/call.png\" class=\"social-icons\">\r\n");
      out.write("					<h2>0326923816</h2>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"logo-right\">\r\n");
      out.write("				<li>\r\n");
      out.write("					<form action=\"search.jsp\" method=\"get\">\r\n");
      out.write("						<input type=\"text\" name=\"query\" placeholder=\"Tìm kiếm...\">\r\n");
      out.write("						<button type=\"submit\">SEARCH</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li><a href=\"#\" class=\"user-icon\" onclick=\"toggleUserMenu()\"><img\r\n");
      out.write("						alt=\"\" src=\"IMG/user.png\" style=\"height: 40px; width: 40px\"></a>\r\n");
      out.write("					<div id=\"user-menu\" class=\"user-menu\">\r\n");
      out.write("						");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div style=\"text-align: center; margin-top: 10px\">\r\n");
      out.write("			<h1 style=\"font-weight: bold;\">Chào Mừng Bạn Đến Với Trang Quản\r\n");
      out.write("				Lí !!!</h1>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<nav class=\"sidebar\">\r\n");
      out.write("		<ul class=\"nav-list\">\r\n");
      out.write("			<li><a href=\"Admin.jsp\"><img alt=\"\" src=\"IMG/home.png\"\r\n");
      out.write("					class=\"menu-icons\">TRANG CHỦ</a></li>\r\n");
      out.write("			<li class=\"dropdown\"><a href=\"javascript:void(0)\"\r\n");
      out.write("				class=\"dropbtn\" onclick=\"toggleDropdown(event)\"><img alt=\"\"\r\n");
      out.write("					src=\"IMG/menu.png\" class=\"menu-icons\">DANH SÁCH SẢN PHẨM</a>\r\n");
      out.write("				<div class=\"dropdown-content\">\r\n");
      out.write("					<a href=\"DanhSachLoaiSanPhamServlet\">Loại Sản phẩm</a> <a\r\n");
      out.write("						href=\"DanhSachSanPhamServlet\">Sản phẩm</a>\r\n");
      out.write("				</div></li>\r\n");
      out.write("			<li><a href=\"DanhSachUserServlet\"><img alt=\"\" src=\"IMG/user.png\"\r\n");
      out.write("					class=\"menu-icons\">QUẢN LÍ TÀI KHOẢN</a></li>\r\n");
      out.write("			<li><a href=\"DSDonHangServlet\"><img alt=\"\" src=\"IMG/sale.png\"\r\n");
      out.write("					class=\"menu-icons\">ĐƠN HÀNG</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<main  style=\"text-align: center;\">\r\n");
      out.write("		<h1>Hello Admin</h1>\r\n");
      out.write("	</main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<footer> </footer>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Modal/register.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Modal/verify.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Modal/login.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	 <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            // Kiểm tra nếu thuộc tính \"showVerifyModal\" có trong session và có giá trị true\r\n");
      out.write("            ");
 if (session.getAttribute("showVerifyModal") != null && (Boolean) session.getAttribute("showVerifyModal")) { 
      out.write("\r\n");
      out.write("                $('#verifyModal').modal('show');\r\n");
      out.write("                ");
 session.removeAttribute("showVerifyModal"); 
      out.write("\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        // Kiểm tra nếu thuộc tính \"registerSuccess\" có trong session và có giá trị true\r\n");
      out.write("        ");
 if (session.getAttribute("registerSuccess") != null) { 
      out.write("\r\n");
      out.write("            ");
 Boolean registerSuccess = (Boolean) session.getAttribute("registerSuccess"); 
      out.write("\r\n");
      out.write("            ");
 if (registerSuccess) { 
      out.write("\r\n");
      out.write("                $('#registerSuccessModal').modal('show');\r\n");
      out.write("            ");
 } else { 
      out.write("\r\n");
      out.write("                $('#registerFailureModal').modal('show');\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            ");
 session.removeAttribute("registerSuccess"); 
      out.write("\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("	<!-- Modal Đăng Ký Thành Công -->\r\n");
      out.write("<div class=\"modal fade\" id=\"registerSuccessModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"registerSuccessModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"registerSuccessModalLabel\">Đăng ký thành công</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("           Chúc mừng!. Xác thực tài khoản thành công\r\n");
      out.write("             .  Bạn đã đăng ký thành công. Vui lòng đăng nhập lại.\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Modal Đăng Ký Không Thành Công -->\r\n");
      out.write("<div class=\"modal fade\" id=\"registerFailureModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"registerFailureModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"registerFailureModalLabel\">Đăng ký không thành công</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                Đăng ký không thành công. Mã xác thực bạn nhập không chính xác. Vui lòng thử lại.\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("	<!-- JavaScript để hiển thị modal khi cần -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Modal Đăng nhập thành công -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"loginSuccessModal\" tabindex=\"-1\"\r\n");
      out.write("		role=\"dialog\" aria-labelledby=\"loginSuccessModalLabel\"\r\n");
      out.write("		aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"loginSuccessModalLabel\">Đăng Nhập\r\n");
      out.write("						Thành Công</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">Chào mừng bạn đã đăng nhập thành công.\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Đóng</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        \r\n");
      out.write("        ");
 if (session.getAttribute("loginSuccess") != null && (Boolean) session.getAttribute("loginSuccess")) { 
      out.write("\r\n");
      out.write("            $('#loginSuccessModal').modal('show');\r\n");
      out.write("            ");
 session.removeAttribute("loginSuccess"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            // Thay đổi nút \"Đăng Nhập\" và \"Đăng Ký\" thành nút \"Đăng Xuất\"\r\n");
      out.write("            var tenuser = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ten}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'; // Lấy tên người dùng từ session\r\n");
      out.write("            $('#user-menu').html('<span class=\"user-info font-weight-bold text-black\">Xin Chào  ' + tenuser + '</span>' +\r\n");
      out.write("                '<button type=\"button\" class=\"btn btn-danger\" onclick=\"confirmLogout()\">Đăng Xuất</button>');\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function confirmLogout() {\r\n");
      out.write("        // Hiển thị modal xác nhận đăng xuất\r\n");
      out.write("        $('#confirmLogoutModal').modal('show');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function logout() {\r\n");
      out.write("    	window.location.href = \"LogoutServlet\";\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("	<!-- Modal Đăng nhập không thành công -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"loginFailedModal\" tabindex=\"-1\"\r\n");
      out.write("		role=\"dialog\" aria-labelledby=\"loginFailedModalLabel\"\r\n");
      out.write("		aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"loginFailedModalLabel\">Đăng Nhập\r\n");
      out.write("						Không Thành Công</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">Đăng nhập không thành công. Vui lòng\r\n");
      out.write("					kiểm tra lại email và mật khẩu.</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Đóng</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
 if (session.getAttribute("loginFailed") != null && (Boolean) session.getAttribute("loginFailed")) { 
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            $('#loginFailedModal').modal('show');\r\n");
      out.write("        ");
 }
           session.removeAttribute("loginFailed");
        
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("	<!-- Modal xác nhận đăng xuất -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"confirmLogoutModal\" tabindex=\"-1\"\r\n");
      out.write("		role=\"dialog\" aria-labelledby=\"confirmLogoutModalLabel\"\r\n");
      out.write("		aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"confirmLogoutModalLabel\">Xác nhận\r\n");
      out.write("						đăng xuất</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">Bạn có chắc chắn muốn đăng xuất không?\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Hủy</button>\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-primary\" onclick=\"logout()\">Đăng\r\n");
      out.write("						xuất</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("							");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /Admin.jsp(222,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.ten}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								<span class=\"user-info font-weight-bold text-black\"> ");
          if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("								</span>\r\n");
          out.write("								<button type=\"button\" class=\"btn btn-danger\"\r\n");
          out.write("									onclick=\"confirmLogout()\">Đăng Xuất</button>\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
      // /Admin.jsp(223,61) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("Xin chào: ${sessionScope.ten}", java.lang.Object.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								<button type=\"button\" class=\"btn btn-primary\"\r\n");
          out.write("									data-toggle=\"modal\" data-target=\"#loginModal\">Đăng\r\n");
          out.write("									Nhập</button>\r\n");
          out.write("								<button type=\"button\" class=\"btn btn-primary\"\r\n");
          out.write("									data-toggle=\"modal\" data-target=\"#registerModal\">Đăng\r\n");
          out.write("									Ký</button>\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}

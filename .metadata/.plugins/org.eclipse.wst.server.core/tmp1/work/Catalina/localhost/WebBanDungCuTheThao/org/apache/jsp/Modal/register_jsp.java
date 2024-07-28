/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-07-21 09:16:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Modal;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Register</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    background-color: #f8f9fa;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write(".modal-content {\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("    border: none;\r\n");
      out.write("}\r\n");
      out.write(".modal-header {\r\n");
      out.write("    background-color: #007bff;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border-bottom: none;\r\n");
      out.write("    border-top-left-radius: 8px;\r\n");
      out.write("    border-top-right-radius: 8px;\r\n");
      out.write("}\r\n");
      out.write(".modal-title {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".close {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("}\r\n");
      out.write(".modal-body {\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("}\r\n");
      out.write(".form-group label {\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".form-control {\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #ced4da;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write(".btn-primary {\r\n");
      out.write("    background-color: #007bff;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("}\r\n");
      out.write(".btn-primary:hover {\r\n");
      out.write("    background-color: #0056b3;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"modal fade\" id=\"registerModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"registerModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"registerModalLabel\">Đăng Ký</h5>\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <form action=\"UserServlet\" method=\"post\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"username\">Họ và Tên</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"tenuser\" name=\"tenuser\" required>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"password\">Mật Khẩu</label>\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"email\">Email</label>\r\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" required>\r\n");
      out.write("          </div>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">Đăng Ký</button>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
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
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-21 06:17:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class featuredProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/styles/css/featuredProduct.style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container shadow my-5 \">\r\n");
      out.write("    <div class=\"row \">\r\n");
      out.write("        <div class=\"col-lg-12 text-center mb-4\">\r\n");
      out.write("            <h2 class=\"text-black fs-1 font-weight-bold mt-5\">Featured <span class=\"text-warning\">Product.</span></h2>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6 col-sm-12 pb-4\">\r\n");
      out.write("            <div class=\"card product-item border-0 mb-4 shadow\">\r\n");
      out.write("                <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\r\n");
      out.write("                    <img class=\"img-fluid w-100\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/mouse.jpeg\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\r\n");
      out.write("                    <h5 class=\"text-truncate mb-3\">Mouse</h5>\r\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                        <h6>$123.00</h6>\r\n");
      out.write("                        <h6 class=\"text-muted ml-2\">\r\n");
      out.write("                            <del>$123.00</del>\r\n");
      out.write("                        </h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer d-flex justify-content-between bg-light border\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/eye.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">View Detail\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/shopping-bag.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">Add To\r\n");
      out.write("                        Cart\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6 col-sm-12 pb-4\">\r\n");
      out.write("            <div class=\"card product-item border-0 mb-4 shadow\">\r\n");
      out.write("                <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\r\n");
      out.write("                    <img class=\"img-fluid w-100\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/headphone.jpg\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\r\n");
      out.write("                    <h5 class=\"text-truncate mb-3\">Headphone</h5>\r\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                        <h6>$123.00</h6>\r\n");
      out.write("                        <h6 class=\"text-muted ml-2\">\r\n");
      out.write("                            <del>$123.00</del>\r\n");
      out.write("                        </h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer d-flex justify-content-between bg-light border\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/eye.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">View Detail\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/shopping-bag.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">Add To\r\n");
      out.write("                        Cart\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6 col-sm-12 pb-4\">\r\n");
      out.write("            <div class=\"card product-item border-0 mb-4 shadow\">\r\n");
      out.write("                <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\r\n");
      out.write("                    <img class=\"img-fluid w-100\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/product-1.jpg\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\r\n");
      out.write("                    <h5 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h5>\r\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                        <h6>$123.00</h6>\r\n");
      out.write("                        <h6 class=\"text-muted ml-2\">\r\n");
      out.write("                            <del>$123.00</del>\r\n");
      out.write("                        </h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer d-flex justify-content-between bg-light border\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/eye.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">View Detail\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/shopping-bag.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">Add To\r\n");
      out.write("                        Cart\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-6 col-sm-12 pb-4\">\r\n");
      out.write("            <div class=\"card product-item border-0 mb-4 shadow\">\r\n");
      out.write("                <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\r\n");
      out.write("                    <img class=\"img-fluid w-100\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/product-1.jpg\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\r\n");
      out.write("                    <h5 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h5>\r\n");
      out.write("                    <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                        <h6>$123.00</h6>\r\n");
      out.write("                        <h6 class=\"text-muted ml-2\">\r\n");
      out.write("                            <del>$123.00</del>\r\n");
      out.write("                        </h6>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer d-flex justify-content-between bg-light border\">\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/eye.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">View Detail\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex gap-1 align-items-center\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/shopping-bag.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">Add To\r\n");
      out.write("                        Cart\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"d-flex align-items-center justify-content-end mb-3\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/shop.jsp\" class=\"btn btn-warning btn-lg\">See more<span> . . .</span> </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
}

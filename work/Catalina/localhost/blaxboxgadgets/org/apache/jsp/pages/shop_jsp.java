/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.20
 * Generated at: 2024-04-21 06:17:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.icp.gadgets.model.User;
import com.icp.gadgets.doa.ProductDoa;
import com.mysql.cj.xdevapi.DbDoc;
import com.icp.gadgets.model.Product;
import java.util.List;
import com.icp.gadgets.model.Image;
import com.icp.gadgets.doa.ImageDoa;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.icp.gadgets.model.Product");
    _jspx_imports_classes.add("com.icp.gadgets.doa.ProductDoa");
    _jspx_imports_classes.add("com.icp.gadgets.model.User");
    _jspx_imports_classes.add("com.mysql.cj.xdevapi.DbDoc");
    _jspx_imports_classes.add("com.icp.gadgets.doa.ImageDoa");
    _jspx_imports_classes.add("com.icp.gadgets.model.Image");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Shop</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../styles/global.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../styles/css/shop.styles.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    User user = (User) session.getAttribute("user");
    if (user != null) {
        request.setAttribute("user", user);
    }

    ProductDoa pd = new ProductDoa();
    List<Product> productList = pd.getAllProducts();

    ImageDoa img = new ImageDoa();



      out.write("\r\n");
      out.write("<!-- Header Start -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- Page Header Start -->\r\n");
      out.write("<div class=\"container-fluid bg-secondary mb-5\">\r\n");
      out.write("    <div class=\"d-flex flex-column align-items-center justify-content-center\" style=\"min-height: 300px\">\r\n");
      out.write("        <h1 class=\"font-weight-semi-bold text-uppercase mb-3\">Our Shop</h1>\r\n");
      out.write("        <div class=\"d-inline-flex\">\r\n");
      out.write("            <p class=\"m-0 \"><a href=\"../index.jsp\" class=\"text-primary\">Home</a></p>\r\n");
      out.write("            <p class=\"m-0 px-2\">-</p>\r\n");
      out.write("            <p class=\"m-0\">Shop</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Page Header End -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid pt-5\">\r\n");
      out.write("    <div class=\"row px-xl-5\">\r\n");
      out.write("        <!-- Shop Sidebar Start -->\r\n");
      out.write("        <div class=\"col-lg-3 col-md-12\">\r\n");
      out.write("            <!-- Price Start -->\r\n");
      out.write("            <div class=\"border-bottom mb-4 pb-4\">\r\n");
      out.write("                <h5 class=\"font-weight-semi-bold mb-4\">Filter by price</h5>\r\n");
      out.write("                <form>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" checked id=\"price-all\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"price-all\">All Price</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"price-1\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"price-1\">$0 - $100</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"price-2\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"price-2\">$100 - $200</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"price-3\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"price-3\">$200 - $300</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"price-4\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"price-4\">$300 - $400</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"price-5\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"price-5\">$400 - $500</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Price End -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Color Start -->\r\n");
      out.write("            <div class=\"border-bottom mb-4 pb-4\">\r\n");
      out.write("                <h5 class=\"font-weight-semi-bold mb-4\">Filter by color</h5>\r\n");
      out.write("                <form>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" checked id=\"color-all\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"price-all\">All Color</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"color-1\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"color-1\">Black</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"color-2\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"color-2\">White</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"color-3\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"color-3\">Red</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"color-4\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"color-4\">Blue</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"color-5\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"color-5\">Green</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Color End -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Size Start -->\r\n");
      out.write("            <div class=\"mb-5\">\r\n");
      out.write("                <h5 class=\"font-weight-semi-bold mb-4\">Filter by size</h5>\r\n");
      out.write("                <form>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" checked id=\"size-all\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"size-all\">All Size</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"size-1\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"size-1\">XS</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"size-2\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"size-2\">S</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"size-3\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"size-3\">M</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"size-4\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"size-4\">L</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"size-5\">\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"size-5\">XL</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Size End -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Shop Sidebar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Shop Product Start -->\r\n");
      out.write("        <div class=\"col-lg-9 col-md-12\">\r\n");
      out.write("            <div class=\"row pb-3\">\r\n");
      out.write("                <div class=\"col-12 pb-1\">\r\n");
      out.write("                    <div class=\"d-flex align-items-center justify-content-between mb-4\">\r\n");
      out.write("                        <form action=\"\">\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search by name\">\r\n");
      out.write("                                <div class=\"input-group-append\">\r\n");
      out.write("                                        <span class=\"input-group-text bg-transparent text-primary\">\r\n");
      out.write("                                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/Icons/search.png\"\r\n");
      out.write("                                                 alt=\"search\"\r\n");
      out.write("                                                 style=\"width: 20px;height: 20px\">\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"dropdown ml-4\">\r\n");
      out.write("                            <button class=\"btn border dropdown-toggle\" type=\"button\" id=\"triggerId\"\r\n");
      out.write("                                    data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("                                    aria-expanded=\"false\">\r\n");
      out.write("                                Sort by\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"triggerId\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Latest</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Popularity</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Best Rating</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    ");
 if (!productList.isEmpty()) { 
      out.write("\r\n");
      out.write("                    ");
 for (Product product : productList) { 
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-12 pb-1\">\r\n");
      out.write("                        <div class=\"card product-item border-0 mb-4\">\r\n");
      out.write("                            <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\r\n");
      out.write("                                <img class=\"img-fluid \" style=\"width: 75%;height: 40vh\"  src=\"");
      out.print( img.getImgURLByProductId(product.getProductId()) );
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\r\n");
      out.write("                                <h6 class=\"text-truncate mb-3\">");
      out.print( product.getProductName() );
      out.write("</h6>\r\n");
      out.write("                                <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                                    <h6>$");
      out.print( product.getProductPrice() );
      out.write("</h6>\r\n");
      out.write("                                    <h6 class=\"text-muted ml-2\">\r\n");
      out.write("                                        <del>$");
      out.print( product.getProductPrice() );
      out.write("</del>\r\n");
      out.write("                                    </h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-footer bg-light border\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-6\">\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-sm text-dark p-0 d-flex align-items-center\">\r\n");
      out.write("                                            <img src=\"../assets/Icons/eye.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">\r\n");
      out.write("                                            View Detail\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-6\">\r\n");
      out.write("                                            <a href=\"../cart-servlet?id=");
      out.print(product.getProductId());
      out.write("\" class=\"btn btn-sm text-dark p-0 d-flex align-items-center justify-content-end\">\r\n");
      out.write("                                                <img src=\"../assets/Icons/shopping-bag.png\" alt=\"cart\" style=\"width: 20px;height: 20px\">\r\n");
      out.write("                                                Add To Cart\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                    ");
 } else { 
      out.write("\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <p>No products available</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        <!-- Shop Product End -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Footer Start -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"../script/myscript.js\">\r\n");
      out.write("</script>\r\n");
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

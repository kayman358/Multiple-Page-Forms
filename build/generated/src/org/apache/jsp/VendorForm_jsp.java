package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VendorForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("<script src =\"script.js\"></script>\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Vendor Portal</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <center><h3 class=\"top\">FBN Vendor Portal</h3></center>\n");
      out.write("        \n");
      out.write("       <form>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleVendorName\">Vendor Name</label>\n");
      out.write("    <input type=\"text\" class=\"form-control short required control-label\" id=\"exampleVendorName\" placeholder=\"VendorName\">\n");
      out.write("  </div>\n");
      out.write(" <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("    <input type=\"email\" class=\"form-control short required control-label\" id=\"exampleInputEmail1\" placeholder=\"Email\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleProjectManager\">Project Manager</label>\n");
      out.write("    <input type=\"text\" class=\"form-control short\" id=\"exampleProjectManager\" placeholder=\"ProjectManager\">\n");
      out.write("  </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write(" <button onclick=\"pageChanger(0, 1, pageContents)\" id=\"next\">next page</button>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputFile\">File input</label>\n");
      out.write("    <input type=\"file\" id=\"exampleInputFile\">\n");
      out.write("    <p class=\"help-block\">Example block-level help text here.</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"checkbox\">\n");
      out.write("    <label>\n");
      out.write("      <input type=\"checkbox\"> Check me out\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <button type=\"button\" class=\"btn btn-primary glyphicon glyphicon-star\">Submit</button>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

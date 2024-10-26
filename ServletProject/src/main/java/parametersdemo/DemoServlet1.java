package parametersdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet1 extends HttpServlet
{
  public void service(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<b>Ia m in Demo Servlet1<b>");
    out.println("<br>");
    out.println("<b>Init and Context Parameters Demo</b></br>");
    
    out.println("<b>Init Parameter</b><br>");
    ServletConfig config = getServletConfig();
    out.println("ID="+config.getInitParameter("id"));
    out.println("<br>");
    out.println("NAME="+config.getInitParameter("name"));
    out.println("<br>");
    
    out.println("<b>Context Parameter</b><br>");
    ServletContext context = getServletContext();
    out.println("USERNAME="+context.getInitParameter("uname"));
    out.println("<br>");
    out.println("PASSWORD="+context.getInitParameter("password"));
    out.println("<br>");
  }
}
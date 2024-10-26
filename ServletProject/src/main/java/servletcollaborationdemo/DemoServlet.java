package servletcollaborationdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<b>Servlet Chaining/Servlet Collaboration Demo</b><br>");
    
    
//    RequestDispatcher rd=request.getRequestDispatcher("/demo1");
//    rd.forward(request, response);
    
//     RequestDispatcher rd=request.getRequestDispatcher("/demo2");
//     rd.include(request, response);
    
//    RequestDispatcher rd=request.getRequestDispatcher("index.html");
//    rd.include(request, response);
    
//    response.sendRedirect("demo2");
//    response.sendRedirect("index.html");
    response.sendRedirect("https://www.google.com/");
    
    
  }
}
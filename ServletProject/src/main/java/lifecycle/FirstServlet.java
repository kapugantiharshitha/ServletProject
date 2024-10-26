package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	public void init()
	{
		System.out.println("init method is invoked");
	}
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		System.out.println("service method is invoked");
		response.setContentType("text/html");	
		PrintWriter out=response.getWriter();
		out.println("<b>Life Cycle Demo</b>");		
	}
	public void destroy()
	{
		System.out.println("destroy method is invoked");
	}
}
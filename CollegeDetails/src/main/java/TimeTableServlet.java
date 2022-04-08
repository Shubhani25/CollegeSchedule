

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TimeTableServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String cls = request.getParameter("class");
		
		out.println("<html><body>");
		if(cls.equals("CSE-1")) {
			out.println("Time Table for CSE-1");
		}
		else if(cls.equals("CSE-2")) {
			out.println("Time Table for CSE-2");
		}
		else if(cls.equals("ISE-1")) {
			out.println("Time Table for ISE-1");
		}
		
		out.println("<br><a href=index.jsp> HOME </a>");
		out.println("</body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

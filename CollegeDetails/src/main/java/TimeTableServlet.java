import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TimeTableServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String cls = request.getParameter("class");
		
		//Step 1: Create Cookie Object
		Cookie ck = new Cookie("info", cls);
		//Step 2: Specify max age of that cookie
		ck.setMaxAge(60*60*24*7);
		//Step 3: Add the cookie to response object
		response.addCookie(ck);
		
		Cookie ck2 = new Cookie("xyz","abc");
		ck2.setMaxAge(123456);
		response.addCookie(ck2); 
		
		
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

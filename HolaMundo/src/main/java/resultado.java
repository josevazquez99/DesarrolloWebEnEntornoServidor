import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resultado")
public class resultado extends HttpServlet {

private static final long serialVersionUID=1L;


//@Override
//protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//String name=req.getParameter("name");
//
//PrintWriter writer=resp.getWriter();
//writer.println("<html>");
//writer.println("<body>");
//writer.println("Hola " + name);
//writer.println("</body>");
//writer.println("</html>");
//
//
//
//
//}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String resultado=req.getParameter("resultado");
	

	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("El resultado es  " + resultado);
	writer.println("</body>");
	writer.println("</html>");
	

	}

}



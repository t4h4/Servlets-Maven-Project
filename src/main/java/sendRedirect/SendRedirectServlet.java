package sendRedirect;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/sendRedirectServlet" })
public class SendRedirectServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			// asagidaki kod belirtilen siteye direk yonlendirir.
			// response.sendRedirect("http://www.tahayasinerkan.com");
			// yeni kodun gecerliligi icin maven install yaptik.
			// jetty stop and run
			// src/main/webapp icerisindeki intex.html'e yonlendirildi. / denilip
			// contextpath uzerinden olabilir.
			response.sendRedirect("index.html");
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error: " + e);
		}
	}
}

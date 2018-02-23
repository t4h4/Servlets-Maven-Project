package attribute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/RequestAttributeServletExample"})
public class RequestAttributeServletExample extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonPojo personPojo1 = new PersonPojo("taha", "erkan", 1, "9999");
		PersonPojo personPojo2 = new PersonPojo("tony", "stark", 2, "9998");
		PersonPojo personPojo3 = new PersonPojo("steve", "rogers", 3, "9997");
		
		List<PersonPojo> list = new ArrayList<>();
		
		list.add(personPojo1);
		list.add(personPojo2);
		list.add(personPojo3);
		
		request.setAttribute("personlist", list);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
		
	}

}

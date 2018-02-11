package downloading;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadingWithServlet
 */
public class DownloadingWithServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DownloadingWithServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// dosyanin icerik tipi yazilir. MIME types olarak googling yapilabilir.
		response.setContentType("");
		// indirilecek dosyanin adi setHeader'da belirtilmeli.
		response.setHeader("Content-Disposition", "attachment;filename=odtdosyasi.odt");
		// bundan sonra indirilecek dosyanin webapp klasoru altina alinmasi lazým.
		// okuma islemi icin InputStream nesnesi lazim.
		// InputStream'i servletlerde getServletContext ile elde ediyorduk.
		InputStream is = getServletContext().getResourceAsStream("/dosyaismi.uzantisi"); // dosya ismi yukaridan farkli
																						// olabilir

		int read = 0;
		byte[] bytes = new byte[1024];

		ServletOutputStream sos = response.getOutputStream();

		while ((read = is.read(bytes)) != -1) {
			// 0. gozden baslayacak okudugu yere kadar gidecek.
			sos.write(bytes, 0, read);
		}
		sos.close();
	}

}

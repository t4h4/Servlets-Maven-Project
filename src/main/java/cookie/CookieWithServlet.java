package cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/cookieWithServlet"})
public class CookieWithServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		//ilk parametre cookie'nin key ikincisi value (ikiside string tipinde)
		Cookie cookie1 = new Cookie("hero", ",ironman");
		Cookie cookie2 = new Cookie("hero2", ",spidey");
		
		//cookie2 15 saniye boyunca tarayýcýda yer alacak. yasam suresi. sonra silinecek.
		cookie2.setMaxAge(15);
		
		//olusturdugumuz cookileri ekliyoruz.
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		//addHeader ile yeni cookie olusturup, ekleme.
		response.addHeader("Set-Cookie", "hero3=natasha");
		
		//cookieleri yazdirmak icin hepsini cookies dizisine aktarýyoruz.
		Cookie[] cookies = request.getCookies();
		
		if (cookies !=null) {
			for(Cookie c : cookies) {
				System.out.println("Cookie Adi: "+c.getName()+"Cookie Degeri: "+c.getValue());
			}
		}
		
	}

}

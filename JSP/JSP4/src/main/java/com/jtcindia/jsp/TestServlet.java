package com.jtcindia.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init() method TestServlet");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sn = request.getParameter("sname");
		String em = request.getParameter("email");

		String ems[] = request.getParameterValues("email");

		System.out.println(sn);
		System.out.println(em);
		for (String str : ems) {
			System.out.println(str);
		}

		String ho = request.getHeader("host");
		String re = request.getHeader("referrer");
		String al = request.getHeader("accept-language");
		String ae = request.getHeader("accept-encoding");

		System.out.println(ho);
		System.out.println(re);
		System.out.println(al);
		System.out.println(ae);

		Cookie ck1 = new Cookie("email", "abc@jtc.com");
		Cookie ck2 = new Cookie("phone", "9334096480");
		System.out.println(" Test Cookie ");

		Cookie ck[] = request.getCookies();
		for (Cookie c : ck) {
			System.out.println(c.getName() + " " + c.getValue());
		}

		response.addCookie(ck1);
		response.addCookie(ck2);
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

	public void destroy() {

	}

}

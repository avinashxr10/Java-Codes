package com.jtcindia.jsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jtcindia.bean.Account;
import com.jtcindia.bean.Address;
import com.jtcindia.bean.Customer;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() method of TestServlet");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession ses = request.getSession();
		ServletContext ctx = ses.getServletContext();

		// 1) String Wrapper and Date
		request.setAttribute("EM", "akgpcamp@gmail.com");
		ses.setAttribute("PH", new Long(96480));
		ctx.setAttribute("DOB", new Date());

		// 2) Collection of String,Wrapper and Date
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(11));
		al.add(new Integer(22));
		al.add(new Integer(33));
		al.add(new Integer(44));
		al.add(new Integer(55));
		request.setAttribute("AL", al);

		String str[] = { "Avinash", "Kumar", "Dhanbad" };
		request.setAttribute("STR", str);

		// 3) Collection of Collections(*JSTL)
		ArrayList<ArrayList> al1 = new ArrayList<ArrayList>();
		al1.add(al);
		al1.add(al);
		al1.add(al);
		request.setAttribute("AL1", al1);

		// 4) Custom or User Defined class object
		Address add = new Address("c-29 sector", "Noida");
		Account acc = new Account(101, "SA", 999.9, add);
		Customer cust = new Customer(99, "Avinash", "akgpcamp@gmail.com", 8888, acc);
		ses.setAttribute("CUST", cust);

		// 5)Collection of User Defined class Object
		ArrayList<Customer> cs = new ArrayList<Customer>();
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		ses.setAttribute("CS", cs);

		// 6) Map Object
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("sid", "11");
		hm.put("sname", "Avinash");
		hm.put("email", "akgpcamp@gmail.com");
		ses.setAttribute("HM", hm);

		// 7)Colection of Map Object(*JSTL)
		ArrayList<HashMap<String, String>> al2 = new ArrayList<HashMap<String, String>>();
		al2.add(hm);
		al2.add(hm);
		al2.add(hm);
		request.setAttribute("AL2", al2);
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

	public void destroy() {

	}

}

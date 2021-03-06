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

public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void init(ServletConfig config) throws ServletException {
        System.out.println("TestServlet init() method called...");
    }

    @SuppressWarnings({"deprecation", "rawtypes"})
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
        ServletContext ctx = ses.getServletContext();

        // 1.) String, Wrappers and Data.
        request.setAttribute("EM", "mahesh.sharma89@gmail.com");
        ses.setAttribute("PH", new Long(643083729));
        ctx.setAttribute("DOB", new Date());

        // 2) Collection of String, Wrappers and Date
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(new Integer(101));
        al.add(new Integer(102));
        al.add(new Integer(103));
        al.add(new Integer(104));
        al.add(new Integer(105));
        request.setAttribute("AL", al);
        String str[] = {"Mahesh", "Kumar", "Sharma", "Itanagar", "Arunachal Pradesh"};
        ses.setAttribute("STR", str);
        // 3) Collection of Collections(*JSTL)
        ArrayList<ArrayList> al1 = new ArrayList<ArrayList>();
        al1.add(al);
        al1.add(al);
        al1.add(al);
        request.setAttribute("AL1", al1);

        // 4) Custom or User Defined class object

        Address add = new Address("F&G-Sector", "Ganga");
        Account acc = new Account(101, "A.P.", 792555, add);
        Customer cust = new Customer(9, "Mahesh", "mahesh.sharma89@gmail.com", 791113, acc);
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
        hm.put("sid", "101");
        hm.put("sname", "Mahesh");
        hm.put("Email", "mahesh.sharma89@gmail.com");
        request.setAttribute("HM", hm);

        // 7) Collection of Map Object(*JSTL)
        ArrayList<HashMap<String, String>> al2 = new ArrayList<HashMap<String, String>>();
        al2.add(hm);
        al2.add(hm);
        al2.add(hm);
        request.setAttribute("AL2", al2);
        RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
        rd.forward(request, response);

    }

    public void destroy() {
        // TODO Auto-generated method stub
    }

}

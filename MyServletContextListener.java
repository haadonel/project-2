package com.example;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event) {
		ServletContext sc = event.getServletContext();

		String urlred = sc.getInitParameter("myurl");
		Myurl myurl = new Myurl(urlred);
		sc.setAttribute("newmyurl", myurl);

		String txtred = sc.getInitParameter("mytxt");
		Myurl mytxt = new Myurl(txtred);
		sc.setAttribute("newmytxt", mytxt);
	}

	public void contextDestroyed(ServletContextEvent event) {
	}

}



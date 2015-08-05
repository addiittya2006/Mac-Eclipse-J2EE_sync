package com.addiittya.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.addiittya.DBConnectionManager;
/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
@WebListener
public class MyContextListener implements ServletContextListener {

	/**
	 * Default constructor. 
	 */
	public MyContextListener() {
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent servletContextEvent)  {
		ServletContext ctx = servletContextEvent.getServletContext();
		DBConnectionManager dbManager = (DBConnectionManager) ctx.getAttribute("DBManager");
		dbManager.closeConnection();
		System.out.println("Database connection closed for Application.");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent servletContextEvent)  {
		ServletContext ctx = servletContextEvent.getServletContext();

		String dr = ctx.getInitParameter("jdbc_driver");
		String url = ctx.getInitParameter("jdbc_url");
		String u = ctx.getInitParameter("jdbc_user");
		String p = ctx.getInitParameter("jdbc_pass");

		//create database connection from init parameters and set it to context
		DBConnectionManager dbManager = new DBConnectionManager(dr, url, u, p);
		ctx.setAttribute("DBManager", dbManager);
		System.out.println("Database connection initialized for Application.");
	}
	
}

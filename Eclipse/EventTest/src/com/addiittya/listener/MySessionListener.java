package com.addiittya.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

	/**
	 * Default constructor. 
	 */
	public MySessionListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		System.out.println("Session Created:: ID="+sessionEvent.getSession().getId());
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		System.out.println("Session Destroyed:: ID="+sessionEvent.getSession().getId());
	}

}

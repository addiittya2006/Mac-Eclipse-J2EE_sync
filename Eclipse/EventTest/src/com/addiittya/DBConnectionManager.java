package com.addiittya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
    private Connection con;
     
    public DBConnectionManager(String dr, String url, String u, String p){
        try {
        	Class.forName(dr);
			this.con = DriverManager.getConnection(url, u, p);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
     
    public Connection getConnection(){
        return this.con;
    }
     
    public void closeConnection(){
    	try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}

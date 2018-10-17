package com.addiittya.jdbctest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.net.URL;
import java.net.URISyntaxException;

public class JdbcMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException , FileNotFoundException, URISyntaxException{

		Connection conn;
		ResultSet rs;
		Statement st;
		try{
			String drvr_class_name = null;
			String conn_string = null;
			String uname = null;
			String pass = null;

			// FileInputStream fp = new FileInputStream("/Users/addiittya/Desktop/com/addiittya/jdbcfile.properties");
			URL url = JdbcMain.class.getClassLoader().getResource("com/addiittya/jdbctest/jdbcfile.properties");
			FileInputStream fp = new FileInputStream(url.toURI().getSchemeSpecificPart());

			Properties p = new Properties();
			p.load(fp);

			Set<Map.Entry<Object, Object>> s = p.entrySet();
			Iterator<Map.Entry<Object, Object>> itr = s.iterator();
			while (itr.hasNext()) {
				Map.Entry<Object, Object> m = itr.next();
				if (m.getKey().equals("jdbc_driver")) {
					drvr_class_name = (String) m.getValue();
				}
				if(m.getKey().equals("jdbc_url")){
					conn_string = (String) m.getValue();
				}
				if(m.getKey().equals("jdbc_user")){
					uname = (String) m.getValue();
				}
				if(m.getKey().equals("jdbc_pass")){
					pass = (String) m.getValue();
				}
			}
			Class.forName(drvr_class_name);
			conn = DriverManager.getConnection(conn_string, uname, pass);
			st = conn.createStatement();
			rs = st.executeQuery(" SELECT * from STUDENTS WHERE batch=\'B8\' ");
			while(rs.next()){
				System.out.println(rs.getString("name")+"    "+rs.getString("batch")+"     "+rs.getInt("roll"));
			}
			fp.close();
			rs.close();
			st.close();
			conn.close();
		}catch(SQLException e){
			System.out.println("Failed Query");
		}
	}
}

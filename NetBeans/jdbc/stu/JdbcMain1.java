package com.addiittya.jdbctest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.sql.PreparedStatement;

public class JdbcMain1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException , FileNotFoundException, URISyntaxException{

		Connection conn = null;
		ResultSet rs1;
		ResultSet rs2;
		Statement st;
		try{
			String drvr_class_name = null;
			String conn_string = null;
			String uname = null;
			String pass = null;
			
			URL url = JdbcMain1.class.getClassLoader().getResource("com/addiittya/jdbctest/jdbcfile.properties");
			FileInputStream fp = new FileInputStream(url.toURI().getSchemeSpecificPart());

			Properties p = new Properties();
			p.load(fp);
			fp.close();

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
			PreparedStatement stmt = conn.prepareStatement("SELECT * from students WHERE batch=?");
			Scanner read = new Scanner(System.in);
			
//			System.out.println("Enter Roll");
//			int k = read.nextInt();
			System.out.println("Enter Batch:");
			String bt = read.nextLine();
			
			stmt.setString(1, bt);
			rs1 = stmt.executeQuery();
			
			rs2 = st.executeQuery("SELECT * from STUDENTS WHERE roll=13103641");
			while(rs1.next()){
				System.out.println(rs1.getString("name")+"    "+rs1.getString("batch")+"     "+rs1.getInt("roll"));
			}
			while(rs2.next()){
				System.out.println(rs2.getString("name")+"     "+rs2.getInt("roll"));
			}
			

			read.close();
			rs1.close();
			rs2.close();
			st.close();
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
			System.out.println("Failed Query");
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
	}
}

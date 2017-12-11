//package com.AutomationDemo.Paxotech.helperClasses;
//
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//
//public class DbConnection extends BaseClass{
//	
//		public static ResultSet getResult(String query){
//
//			
////		Connection conn = null;
////		Statement stmt = null;
//		String url = "jdbc:mysql://ec2-54-213-245-0.us-west-2.compute.amazonaws.com:3306/";
//		String dbName = "";
//		String driver = "com.mysql.jdbc.Driver";
//		String userName = "";
//		String password = "";
//		ResultSet rs = null;
//
//		try {
//			Class.forName(driver).newInstance();   	
//			conn= DriverManager.getConnection(url+dbName,userName,password);
//			stmt = conn.createStatement();
//			
//			rs = stmt.executeQuery(query);
//			return rs;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			return rs;
//			
//		}
//		
//	}
//}
//
//
//

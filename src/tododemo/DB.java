/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tododemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;
import javax.swing.*;
import java.util.Vector;
public class DB {
	Connection con = null;
	java.sql.PreparedStatement pst;
	public static Connection dbconnect() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://HIMANSHU;database=todo;integratedSecurity=true;");
			return conn;
		}
		catch(Exception e2) {
			System.out.println(e2);
			return null;
		}
	}
}


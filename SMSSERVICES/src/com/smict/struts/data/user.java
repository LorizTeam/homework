package com.smict.struts.data;
import java.sql.*;
import java.util.*;

import com.smict.struts.form.LoginForm;
public class user {
	public ArrayList search_user (String username,String password) throws ClassNotFoundException, SQLException{
		ArrayList array_user = new ArrayList();
		dbconnect dbcon = new dbconnect();
		Connection con = dbcon.DBconn_mysql();
		String sqlQuery = "SELECT employee.emp_username," +
				"employee.emp_password," +
				"employee.emp_name," +
				"employee.emp_surname," +
				"employee.emptype_id," +
				"employee_type.emptype_name " +
				"FROM " +
				"employee " +
				"INNER JOIN employee_type ON employee_type.emptype_id = employee.emptype_id " +
				"where emp_username = '"+username+"' and emp_password='"+password+"'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sqlQuery);
//		String emp_id,emp_username,emp_password,emp_name,emp_surname,emptype_id,emptype_name;
		while(rs.next()){
			array_user.add(rs.getString("emp_username"));
			array_user.add(rs.getString("emp_password"));
			array_user.add(rs.getString("emp_name"));
			array_user.add(rs.getString("emp_surname"));
			array_user.add(rs.getString("emptype_id"));
			array_user.add(rs.getString("emptype_name"));
		}
		return array_user;
	}
}

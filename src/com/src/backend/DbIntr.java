package com.src.backend;

import java.sql.SQLException;

public interface DbIntr {
	
	public Employee getEmployeeDetails(String employeeId) throws SQLException;
	public int insertslip(String emp_name,String emp_id,String phoneno,String salary,String address,String doj,String payment_date)throws SQLException;
	public int updateslip(String salary, String emp_id)throws SQLException;
	public boolean deleteslip(String emp_id)throws SQLException;

}


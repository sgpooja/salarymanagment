package com.src.backend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbImpl implements DbIntr {
	
	private static Connection con;
	static{
		
		
	    try {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
	      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pooja*98");
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Employee getEmployeeDetails(String employeeId) throws SQLException{
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from slip where EMP_ID='"+employeeId+"'");
		Employee e=new Employee();
		while(rs.next()){
			e.setEmployeeId(rs.getString("EMP_ID"));
			e.setEmployeeName(rs.getString("EMP_NAME"));
			e.setSalary(rs.getString("SALARY"));
			e.setPhoneNumber(rs.getString("PHONE_NO"));
			e.setAddress(rs.getString("EMP_ADDRESS"));

			e.setDateOfJoining(rs.getString("DOJ"));
			
			e.setPaymentType(rs.getString("PAYMENT_DATE"));
			
		}
		
		return e;
		
		
	}
	
	
	//method to put data

public int insertslip(String emp_name,String emp_id,String phone_no,String salary,String emp_address,String doj,String payment_date)throws SQLException
{
	
int rowAfftected=0;
con.setAutoCommit(false);
Statement stmt=con.createStatement();
		Statement stmt1=con.createStatement();
		Statement stmt2=con.createStatement();



	/*stmt.setString(1,emp_id);
	stmt.setString(2,emp_name); 
	
	
	
	stmt1.setString(1,phone_no);
	stmt1.setString(2,salary); 
	stmt1.setString(3,emp_address);
	
	  
	stmt2.setString(1,doj);
	stmt2.setString(2,payment_date);
	

	rowAfftected=stmt.executeUpdate();
	rowAfftected=stmt1.executeUpdate();*/
	
	rowAfftected=stmt.executeUpdate("insert into employee1(emp_id,emp_name,emp_address)values('"+emp_id+"','"+emp_name+"','"+emp_address+"')");
	rowAfftected=stmt1.executeUpdate("insert into salaray_slip(salary,phone_no,emp_address,emp_id,emp_name)values('"+salary+"','"+phone_no+"','"+emp_address+"', '"+emp_id+"','"+emp_name+"')");
	rowAfftected=stmt2.executeUpdate("insert into emp_details(doj,payment_date,emp_id)values('"+doj+"','"+payment_date+"', '"+emp_id+"')");
	
	con.commit();

return rowAfftected;
}

public int updateslip(String salary, String emp_id)throws SQLException
{

	int rowAfftected=0;
	try(PreparedStatement stmt=con.prepareStatement("update salaray_slip set salary=? where emp_id=?");)

	{
		stmt.setString(1,salary);
		stmt.setString(2,emp_id);



		rowAfftected=stmt.executeUpdate();
	}
	catch(SQLException exe1)
			{

				throw exe1;
		}

return rowAfftected;
	
} 
	 

public boolean deleteslip(String emp_id)throws SQLException
{

		int rowAfftected=0;
 		boolean b;
		//try(PreparedStatement stmt=con.prepareStatement("delete from  employee1 where emp_id=?");)
		try(CallableStatement cs = con.prepareCall("call procedure2(?)" );)
		
		{
			System.out.println(emp_id);
			cs.setString(1,emp_id);



		//rowAfftected=cs.executeUpdate();
		b=	cs.execute();
		System.out.println(b);
		System.out.println("deleted");
		}
		catch(SQLException exe1)
				{

					throw exe1;
			}
return b;
//return rowAfftected;
}
}

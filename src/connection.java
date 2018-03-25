import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connection {

	public static void main(String[] args) 
	{
	
	    Connection connection = null;
	    try {
	      connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pooja*98");
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    if (connection != null) {
	      System.out.println("nSuccessfullly connected to Oracle DB");
	    } else {
	      System.out.println("nFailed to connect to Oracle DB");
	    }
	  }
}
	
		
		
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/winter", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("select * from user");
		
		ResultSet rs = pstmt.executeQuery();
		
		System.out.println(rs);
	}

}

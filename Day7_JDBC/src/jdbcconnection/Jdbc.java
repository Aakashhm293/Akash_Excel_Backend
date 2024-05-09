package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc {
	public static void main(String[] args) {

		String query = "insert into student (name,percentage,address) values (?,?,?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(Credentials.URL, Credentials.USER, Credentials.PASS);

			Scanner sc = new Scanner(System.in);

			PreparedStatement ps = con.prepareStatement(query);
			System.out.println("Enter the name");
			ps.setString(1, sc.next());
			System.out.println("Enter the Marks");
			ps.setDouble(2, sc.nextDouble());
			System.out.println("Enter the Address");
			ps.setString(3, sc.next());

			int res = ps.executeUpdate();
			if (res != 0) {
				System.out.println("Successfully Inserted");
			} else {
				System.out.println("Insertion Failed");
			}
			
			sc.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

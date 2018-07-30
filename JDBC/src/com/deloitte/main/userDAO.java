package com.deloitte.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.main.entities.User;

public class userDAO implements Dao<User> {
	
	PreparedStatement ps=null;
	Connection connection=null;
	static {
		try {
						// Load or register a jdbc driver
						DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
	}
	
	private void createConnection() throws SQLException{

	
			//Establish a connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@desktop-m03s522:1522:teamdb", "sushanth", "messi10");
		
	}

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		ArrayList<User> users=null;
		ResultSet rs=null;
		try {
			//Establish a connection
			createConnection();
			//Query the database
			ps = connection.prepareStatement("SELECT * FROM USERS");
			rs = ps.executeQuery();
			
			users=new ArrayList<User>();
			while(rs.next()) {
				long _ID = rs.getLong(0);
				String _userName = rs.getString(1);
				String _firstName = rs.getString(2);
				String _lastName = rs.getString(3);
				String _passwd = rs.getString(4);
				String _status = rs.getString(5);
				
				User user1 = new User(_ID,_userName, _firstName, _lastName,_passwd, _status);
				users.add(user1);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			releaseResource();
		}
		return null;
	}

	@Override
	public void save(User user) {
	
		try {
			//Establish a connection
			createConnection();
			//Query the database
			ps = connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?,?,?)");
			ps.setLong(1, user.getID());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPasswd());
			ps.setString(6, user.getStatus());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			releaseResource();
		}
	}
	
	private void releaseResource() {
		try {
			if(ps!=null && ps.isClosed()) {
			ps.close();
			}
			if(connection!=null && connection.isClosed()) {
			connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	@Override
	public void update(User user, String[] params) {
		// TODO Auto-generated method stub
		try {
			//Establish a connection
			createConnection();
			//Query the database
			String deleteSQL = "DELETE USERS WHERE ID = ?";
			ps = connection.prepareStatement(deleteSQL);
			ps.setInt(1, 1001);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			releaseResource();
		}
	}


	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		
	}

}

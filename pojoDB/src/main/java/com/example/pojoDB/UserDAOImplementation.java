package com.example.pojoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class UserDAOImplementation implements UserDAO {

	@Override
	public User getUser(Integer id) {
		try {
Connection connection = JDBCConfig.getConnection();
Statement statement = connection.createStatement();
			ResultSet resultSet =statement.executeQuery(sql);
			if(resultSet.next()) {
				return extractUserFromResultSet(resultSet);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	private User extractUserFromResultSet(ResultSet resultSet) throws SQLException {
		User user=new User();
		user.setUser_id(resultSet.getInt("id"));
		user.setName(resultSet.getString("username"));
		user.setPassword(resultSet.getString("password"));
		user.setCountry(resultSet.getString("country"));
		return user;
	}

	@Override
	public Set<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUserNameAndPassword(String user, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean batchInsertUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}

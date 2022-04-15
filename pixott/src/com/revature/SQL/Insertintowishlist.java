package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.dao.Util;

public class Insertintowishlist {
public List<Movielist> wishlist(int id){
	String sql = "insert into wishlist (wishlist) values (?);";
	List<Movielist> list = new ArrayList<>();
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		           stmt.setInt(1, id);
                 stmt.executeUpdate();
}catch(SQLException e) {
	Util.displayMessage(e);
}
	return list;
}
}

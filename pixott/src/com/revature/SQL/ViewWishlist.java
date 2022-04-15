package com.revature.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.revature.Moviedao.Movielist;
import com.revature.dao.Util;

public class ViewWishlist {
public List<Movielist> view(){
	String sql="select * from wishlist join movie on wishlist = movie.id;";
	List<Movielist> show = new ArrayList<>();
	try(
			Connection connection = Util.getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			){
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			Movielist sh=new Movielist();
			sh.setId(rs.getInt("id"));
			sh.setMovie_name(rs.getString("movie_name"));
			show.add(sh);
		}
}catch (SQLException e) {
	Util.displayMessage(e);
}
	return show;
}
}

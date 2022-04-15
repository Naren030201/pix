package com.revature.Usermenu;

import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.SQL.ViewWishlist;
import com.revature.app.App;

public class UserWishlist {
public static void display() {
	System.out.println("Your wishlist");
	System.out.println("==============");
	ViewWishlist s= new ViewWishlist();
	List<Movielist> h = s.view();
	h.forEach(System.out::println);
	System.out.println("Select an movie id to play");
	int id = App.scanner.nextInt();
	System.out.println("Put your phone in silent and grab a popcorn");
	System.out.println("Thanks for Watching......");
	userMenu.display();
}
}

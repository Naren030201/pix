package com.revature.Usermenu;

import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.SQL.ViewHistory;

public class UserViewHIstory {
public static void display() {
	System.out.println("your history");
	System.out.println("=============");
	ViewHistory history =new ViewHistory();
	List<Movielist> his = history.show();
	his.forEach(System.out::println);
	userMenu.display();
}
}

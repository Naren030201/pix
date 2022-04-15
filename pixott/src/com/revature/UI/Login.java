package com.revature.UI;

import java.util.ArrayList;
import java.util.List;

import com.revature.Admin.AdminMenu;
import com.revature.Moviedao.userLoginDao;
import com.revature.SQL.LoginDetails;
import com.revature.Usermenu.userMenu;
import com.revature.app.App;

public class Login {
public static void display() {
	System.out.println("Login");
	System.out.println("===");
	System.out.println("Mobile:");
	int mobile = App.scanner.nextInt();
	System.out.println("Password:");
	String password= App.scanner.next();
	String admin="pass";
	LoginDetails login = new LoginDetails();
	boolean user = login.check(mobile, password);
	if(mobile==9&&password.equals(admin)) {
		System.out.println("Welcome Admin");
		AdminMenu.display();
	}
	else if(user) {
		userMenu.display();
	}
	else {
    System.out.println("Invalid please try again with correct details or Signup if you are a new User");
    Mainmenu.display();
	}
	}
}

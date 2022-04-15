package com.revature.Usermenu;
import com.revature.SQL.Insertintowishlist;
import com.revature.UI.Mainmenu;
import com.revature.app.App;

public class Userchoice {
public static void display() {
	System.out.println("1) Add movie to Wish List");
	System.out.println("2) Play movie");
	System.out.println("Select an option:");
	int option = App.scanner.nextInt();
	if(option==1) {
	}
	else if(option ==2) {
		System.out.println("Put your phone in silent and grab a popcorn");
		System.out.println("Thanks for Watching......");
		userMenu.display();
	}
}
}

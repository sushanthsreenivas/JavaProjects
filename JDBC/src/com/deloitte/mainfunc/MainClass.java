package com.deloitte.mainfunc;

import com.deloitte.main.userDAO;
import com.deloitte.main.entities.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userDAO udao = new userDAO();
		User user = new User(1,"Sushi","Sushanth","Sreenivas","password","E");
		udao.save(user);
	}

}

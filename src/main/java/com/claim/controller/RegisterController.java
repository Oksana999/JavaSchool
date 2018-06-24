package com.claim.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.User;


@Controller
public class RegisterController {
	
/*	@RequestMapping("/register") 
	public ModelAndView register() {

		return new ModelAndView("register", "user", new User());
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@ModelAttribute("user") User user) {
		System.out.println(user);
		
		return "login";
	}*/

/*	public static void main(String... args) { HQL
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_school", "root", "smile999");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
			PreparedStatement ps = con.prepareStatement(
					"select * from user where id = ?");
			ps.setInt(1, new Integer(1));
			ResultSet rs1 = ps.executeQuery();
			while (rs1.next())
				System.out.println(rs1.getInt(1) + "  " + rs1.getString(2) + "  " + rs1.getString(3));
			
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		
	}
	*/
}



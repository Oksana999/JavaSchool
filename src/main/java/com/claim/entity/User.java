package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class User {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="user_id")
		private int userId;
		@Column
		private String fName;
		@Column
		private String lName;
		@Column
		private String email;
		@Column
		private String password;
		
		public User() {
			super();
		}
		public User(int userId, String fName, String lName, String email, String password) {
			super();
			this.userId = userId;
			this.fName = fName;
			this.lName = lName;
			this.email = email;
			this.password = password;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
					+ ", password=" + password + "]";
		}
		
		
			
}

	



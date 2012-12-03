package com.cwb.review;

public class User {
		private String firstName = null;
		private String lastName = null;
		private String major = null;
		private Integer id = null;
		
		// last name
		// birthdate
		// major
		// userId
		User(){
		}
		
		User(Integer id){
			
		}
		
		public int getId() {
			return this.id.intValue();
		}
		
		protected void setId(Integer id){
			this.id = id;
		}
		
		public void setFirstName(String first){
			this.firstName = first;
		}
		
		public String getFirstName(){
			return this.firstName;
		}
		
		public void setLastName(String last){
			this.lastName = last;
		}
		
		public String getLastName(){
			return this.lastName;
		}
		
		public void setMajor(String major){
			this.major = major;
		}
		
		public String getMajor(){
			return this.major;
		}
		
		public String csvFormat(){
			return getFirstName() + "," + getLastName() + "," + getMajor() + ",";
		}
		
	}
package com.example.MyProject.dto;

public class Weddinghalldto {
	
	
   

	private int id;
	private String name;
	private String email;
	private String phone;
	private String hallname;
	private String date;
	private String address;
	
	
	public Weddinghalldto (int id, String name, String email, String phone,String hallname, String date,String address) {
	    
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.hallname=hallname;
		this.date=date;
		this.address=address;
	   
	}
	
	public  Weddinghalldto() {

}
	
	  public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getHallname() {
			return hallname;
		}

		public void setHallname(String hallname) {
			this.hallname = hallname;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		@Override

		public String toString() {
		    return "FeedbackDto{" +
		            "id=" + id +
		            ", name='" + name + '\'' +
		            ", email='" + email + '\'' +
		            ",phone="+phone+
		            ", hallname=" + hallname  +
		            ", date=" + date+
		              ", address=" +address + 
		           '}';
		}

}
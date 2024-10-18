package com.example.MyProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="report")


public class WeddingHallentity {
	
	  @Id
	    @Column(name="id", length = 45)
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  private int id;
	  
	   @Column(name="name", length = 255)
	    private String name;

	    @Column(name="email", length = 255)
	    private String email;
	    
	    @Column(name="phone", length = 255)
	    private String phone;

	    @Column(name="hallname", length = 255)
	    private String hallname;
	   
	    @Column(name="date", length = 255)
	    private String date;
	    
	    
	    @Column(name="address", length = 255)
	    private String address;
	    
	    
	    public  WeddingHallentity(int id, String name, String email, String phone,String hallname, String date,String address) {
	        
	    	this.id=id;
	    	this.name=name;
	    	this.email=email;
	    	this.phone=phone;
	    	this.hallname=hallname;
	    	this.date=date;
	    	this.address=address;
	       
	    }
	    
	    public  WeddingHallentity() {
	    	
	    	
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
	        return "Weddinghalldto{" +
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

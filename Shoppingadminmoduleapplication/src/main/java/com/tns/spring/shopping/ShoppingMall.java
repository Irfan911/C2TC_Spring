package com.tns.spring.shopping;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class ShoppingMall {
	
	private int id;
	private String name;
	private String password;
	private String mall;
	private int phone;
	
	

	
	
   //Parametried Constructor
	public ShoppingMall(int id, String name, String password, String mall, int phone) {
		
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}
	//Default Constructor
	public ShoppingMall() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMall() {
		return mall;
	}


	public void setMall(String mall) {
		this.mall = mall;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "ShoppingMall [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + "]";
	}
	
	

}

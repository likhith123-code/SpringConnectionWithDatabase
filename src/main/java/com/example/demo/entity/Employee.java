package com.example.demo.entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="employee_table")
// this is table name
// create table in the employee database : with column names as provided below in the annotations list

public class Employee {
	// we need to make id as primary key and it is auto generate
	@Id
	@GeneratedValue()
	@Column(name="id")
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="passwords")
	private String password;
	@Column(name="mobilenumber")
	private String mobilenumber;
	@Column(name="roles")
	private String role;

	// In Post Man use : id,email,password,mobile number,role i.e. model variables
	
	public Employee() {
		
	}
	public Employee(String email, String password, String mobilenumber, String role, int id) {
		super();
		this.email = email;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.role = role;
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	// As we added lombog we need to create setters and getters we need to add annotations only.
}

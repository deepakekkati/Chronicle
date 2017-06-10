package com.chronicle.dto.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User implements Serializable {

	  @Id
	  @Column(name = "user_id")
	  private Long userId;
		
	  @Column(name = "username")
	  private String name;  
		
	  @Column(name = "firstname")
	  private String firstname;
		
	  @Column(name = "lastname")
	  private String lastname;
		
	  @Column(name = "emailid")
	  private String emailid;
		
	  @Column(name = "password")
	  private String password;
			
	  @Column(name = "role")
	  private String role;
		
	  @Column(name = "last_login_time")
	  private Date lastLoginDate;
	  
	  @Column(name = "no_records")
	  private int records;
	  
	  public int getRecords() {
		return records;
	  }
	
	  public void setRecords(int records) {
		this.records = records;
	  }
	
	  public User() { 
		  
	  }
	
	  public User(long userId) { 
	    this.userId = userId;
	  }
	  
	  public User(String email, String name) {
	    this.emailid = email;
	    this.name = name;
	  }
	  public User(long id,String email, String name) {
		  this.userId =id;
		    this.emailid = email;
		    this.name = name;
	  }
	  
	  public User(Long userId, String name, String firstname, String lastname, String emailid, String password, String role,
				Date lastLoginDate) {
			super();
			this.userId = userId;
			this.name = name;
			this.firstname = firstname;
			this.lastname = lastname;
			this.emailid = emailid;
			this.password = password;
			this.role = role;
			this.lastLoginDate = lastLoginDate;
	  }

	  public Long getUserId() {
		return userId;
	  }

	  public void setUserId(Long userId) {
		this.userId = userId;
	  }
	
	  public String getName() {
		return name;
	  }
	
	  public void setName(String name) {
		this.name = name;
	  }
	
	  public String getFirstname() {
		return firstname;
	  }
	
	  public void setFirstname(String firstname) {
		this.firstname = firstname;
	  }
	
	  public String getLastname() {
		return lastname;
	  }
	
	  public void setLastname(String lastname) {
		this.lastname = lastname;
	  }
	
	  public String getEmailid() {
		return emailid;
	  }
	
	  public void setEmailid(String emailid) {
		this.emailid = emailid;
	  }
	
	  public String getPassword() {
		return password;
	  }
	
	  public void setPassword(String password) {
		this.password = password;
	  }
	
	  public String getRole() {
		return role;
	  }
	
	  public void setRole(String role) {
		this.role = role;
	  }
	
	  public Date getLastLoginDate() {
		return lastLoginDate;
	  }
	
	  public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	  }

} 

package org.rock.dong.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 

public class UserDetails {
  @Id	@GeneratedValue
  
  private	int userId;
  @Embedded
  private   Address address;
  public void setAddress(Address address) {
	this.address = address;
}
public Date getJoinedDate() {
	return joinedDate;
}
public void setJoinedDate(Date joinedDate) {
	this.joinedDate = joinedDate;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

  private   Date joinedDate;
  private   String Address;
  private   String description;
 
  public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

private   String userName;

}

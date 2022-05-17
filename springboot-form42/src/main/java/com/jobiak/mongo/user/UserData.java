package com.jobiak.mongo.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class UserData {
	@Id
private Long userId;
private String name;
private String email;
private Long mobile;
public UserData() {
	// TODO Auto-generated constructor stub
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "UserData [userId=" + userId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
}

}

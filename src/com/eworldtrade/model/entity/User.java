package com.eworldtrade.model.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@NamedQueries({@NamedQuery(name="User.findAll", query="SELECT u FROM User u"),
@NamedQuery(name="User.findByUserNamePassword", query="SELECT u FROM User u where u.userName = :userName and u.password = :password "),
@NamedQuery(name="User.findByUserId", query="SELECT u FROM User u where u.userId = :userId")
})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_USERID_GENERATOR", sequenceName="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_USERID_GENERATOR")
	@Column(name="USER_ID")
	private int userId;

	@Column(name="PASSWORD")
	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_DOB")
	private Date userDob;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_GENDER")
	private String userGender;

	@Column(name="USER_NAME")
	private String userName;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_REGISTRATION_DATE")
	private Date userRegistrationDate;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getUserDob() {
		return this.userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserRegistrationDate() {
		return this.userRegistrationDate;
	}

	public void setUserRegistrationDate(Date userRegistrationDate) {
		this.userRegistrationDate = userRegistrationDate;
	}

}
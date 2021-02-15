package com.saveTheChildren.UsersInformation.dto;

/**
 * This is a DTO class for user.
 * 
 * @author Dhavalkumar Dadhania
 *
 */
public class UserDTO {

	private Long userId;

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	public UserDTO() {

	}

	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNumber
	 */
	public UserDTO(Long userId, String firstName, String lastName, String email, String phoneNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

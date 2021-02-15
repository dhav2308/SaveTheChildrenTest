package com.saveTheChildren.UsersInformation.service;

import java.util.List;

import com.saveTheChildren.UsersInformation.dto.UserDTO;

/**
 * This is an interface with methods for users
 * 
 * @author Dhavalkumar Dadhania
 *
 */
public interface UserService {

	/**
	 * This method will get all the users data.
	 * @return list of users data.
	 * @throws Exception
	 */
	public List<UserDTO> getAllUsers() throws Exception;

	/**
	 * This method will get the user by its id.
	 * @param userId
	 * @return the user.
	 * @throws Exception
	 */
	public UserDTO getUserById(Long userId) throws Exception;

	/**
	 * This method will delete the user by its id.
	 * @param userId
	 */
	public void deleteUser(Long userId);

	/**
	 * This method will save the user data.
	 * @param userDTO
	 * @return the saved user data.
	 * @throws Exception
	 */
	public UserDTO saveUser(UserDTO userDTO) throws Exception;
}

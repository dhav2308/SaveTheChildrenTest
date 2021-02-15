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

	public List<UserDTO> getAllUsers() throws Exception;

	public UserDTO getUserById(Long userId) throws Exception;

	public void deleteUser(Long userId);

	public UserDTO saveUser(UserDTO userDTO) throws Exception;
}

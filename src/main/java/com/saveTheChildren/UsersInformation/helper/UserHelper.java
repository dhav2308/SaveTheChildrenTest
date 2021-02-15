package com.saveTheChildren.UsersInformation.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saveTheChildren.UsersInformation.dto.UserDTO;
import com.saveTheChildren.UsersInformation.models.User;
import com.saveTheChildren.UsersInformation.util.UserUtil;

/**
 * This is a helper class to convert user DTO to Model and vice versa.
 * 
 * @author dhaval
 *
 */
@Component
public class UserHelper {

	@Autowired
	private UserUtil userUtil;

	public UserDTO ModelToDTO(User user) throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(user.getUserId());
		userDTO.setFirstName(userUtil.decryptUserData(user.getFirstName()));
		userDTO.setLastName(userUtil.decryptUserData(user.getLastName()));
		userDTO.setEmail(userUtil.decryptUserData(user.getEmail()));
		userDTO.setPhoneNumber(userUtil.decryptUserData(user.getPhoneNumber()));
		return userDTO;
	}

	public User DTOToModel(UserDTO userDTO) throws Exception {
		User user = new User();
		user.setUserId(userDTO.getUserId());
		user.setFirstName(userUtil.encryptUserData(userDTO.getFirstName()));
		user.setLastName(userUtil.encryptUserData(userDTO.getLastName()));
		user.setEmail(userUtil.encryptUserData(userDTO.getEmail()));
		user.setPhoneNumber(userUtil.encryptUserData(userDTO.getPhoneNumber()));
		return user;
	}
}

package com.saveTheChildren.UsersInformation.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saveTheChildren.UsersInformation.dto.UserDTO;
import com.saveTheChildren.UsersInformation.helper.UserHelper;
import com.saveTheChildren.UsersInformation.models.User;
import com.saveTheChildren.UsersInformation.repository.UserRepository;
import com.saveTheChildren.UsersInformation.service.UserService;

/**
 * This class implements users' service interface and overrides its methods.
 * 
 * @author Dhavalkumar Dadhania
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserHelper userHelper;

	@Override
	public List<UserDTO> getAllUsers() throws Exception {
		List<User> users = userRepository.findAll();
		List<UserDTO> userDTOS = new ArrayList<>();
		for (User user : users) {
			userDTOS.add(userHelper.ModelToDTO(user));
		}
		return userDTOS;
	}

	@Override
	public UserDTO getUserById(Long userId) throws Exception {
		User user = userRepository.getOne(userId);
		UserDTO userDTO = userHelper.ModelToDTO(user);
		return userDTO;
	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public UserDTO saveUser(UserDTO userDTO) throws Exception {
		User user = userHelper.DTOToModel(userDTO);
		User userSaved = userRepository.save(user);
		UserDTO userSavedDTO = userHelper.ModelToDTO(userSaved);
		return userSavedDTO;
	}
}

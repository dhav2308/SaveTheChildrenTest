package com.saveTheChildren.UsersInformation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saveTheChildren.UsersInformation.dto.UserDTO;
import com.saveTheChildren.UsersInformation.serviceimpl.UserServiceImpl;

/**
 * This is a controller class for Users, which is defining its APIs.
 * 
 * @author Dhavalkumar Dadhania
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@GetMapping("/list")
	public ResponseEntity<List<UserDTO>> getAllUsersList() throws Exception {
		List<UserDTO> userDTOS = userServiceImpl.getAllUsers();
		return new ResponseEntity<List<UserDTO>>(userDTOS, HttpStatus.OK);
	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable("userId") Long userId) throws Exception {
		UserDTO userDTO = userServiceImpl.getUserById(userId);
		return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserDTO userDTO) throws Exception {
		UserDTO userSavedDTO = userServiceImpl.saveUser(userDTO);
		return new ResponseEntity<UserDTO>(userSavedDTO, HttpStatus.CREATED);
	}

	@PutMapping("/update/{userId}")
	public ResponseEntity<UserDTO> updateUser(@PathVariable("userId") Long userId, @Valid @RequestBody UserDTO userDTO)
			throws Exception {
		UserDTO userUpdatedDTO = userServiceImpl.saveUser(userDTO);
		return new ResponseEntity<UserDTO>(userUpdatedDTO, HttpStatus.OK);
	}

	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<?> deleteUserById(@PathVariable("userId") Long userId) throws Exception {
		userServiceImpl.deleteUser(userId);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}

package com.saveTheChildren.UsersInformation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.saveTheChildren.UsersInformation.dto.UserDTO;
import com.saveTheChildren.UsersInformation.models.User;
import com.saveTheChildren.UsersInformation.repository.UserRepository;
import com.saveTheChildren.UsersInformation.service.UserService;

/**
 * Test suite class for users data.
 * @author dhaval
 *
 */
@SpringBootTest
class UsersInformationApplicationTests {

	@Autowired
	private UserService userService;

	@MockBean
	UserRepository userRepository;

	/**
	 * Test case for list of users.
	 * @throws Exception 
	 */
	@Test
	public void getAllUsersTest() throws Exception {
		when(userRepository.findAll()).thenReturn(Stream
				.of(new User(123L, "Chris", "Jordan", "chris@gmail.com", "02012345678"),
						new User(124L, "Roger", "Patel", "roger@gmail.com", "02023456789"))
				.collect(Collectors.toList()));
		assertEquals(2, userService.getAllUsers().size());
	}

	/**
	 * Test case to get user by id. 
	 * @throws Exception 
	 */
	@Test
	public void getUserByIdTest() throws Exception {
		Long id = 123L;
		User userById = new User(123L, "Chris", "Jordan", "chris@gmail.com", "02012345678");
		when(userRepository.getOne(id)).thenReturn(userById);
		assertEquals(id, userService.getUserById(id).getUserId());
	}

	/**
	 * Test case to save user data.
	 * @throws Exception
	 */
	@Test
	public void saveTest() throws Exception {
		UserDTO userDTO = new UserDTO(123L, "Chris", "Jordan", "chris@gmail.com", "02012345678");
		User user = new User(123L, "Chris", "Jordan", "chris@gmail.com", "02012345678");
		when(userRepository.save(Mockito.any(User.class))).thenReturn(user);
		assertEquals(userDTO.getUserId(), userService.saveUser(userDTO).getUserId());
	}

	/**
	 * Test case to delete user data.
	 */
	@Test
	public void deleteTest() {
		User user = new User(123L, "Chris", "Jordan", "chris@gmail.com", "02012345678");
		userService.deleteUser(user.getUserId());
		verify(userRepository, times(1)).deleteById(user.getUserId());
	}

}

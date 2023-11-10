package com.flightmanagementsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightmanagementsystem.dto.UserDTO;
import com.flightmanagementsystem.entity.User;
import com.flightmanagementsystem.exception.UserManagementException;
import com.flightmanagementsystem.repository.UserRepository;
import com.flightmanagementsystem.serviceimpl.IUserServiceImpl;

@SpringBootTest
class UserUnitTest {

	@InjectMocks
	private IUserServiceImpl userService;

	@Mock
	private UserRepository userRepository;

	private User testUser;

	@BeforeEach
	void setUp() {
		// Initialize a test User object
		testUser = new User();
		testUser.setUserId(1L);
		testUser.setEmail("test@example.com");
		testUser.setMobileNumber(1234567890L);
		testUser.setUserName("testUser");
		testUser.setUserRole("USER");
		testUser.setPassword("password");
		// Set other properties as needed
	}

	@Test
    void registerUser() throws UserManagementException {
        when(userRepository.save(any(User.class))).thenReturn(testUser);

        UserDTO result = userService.registerUser(testUser);

        assertNotNull(result);
        assertEquals(testUser.getUserId(), result.getUserId());
        verify(userRepository, times(1)).save(any(User.class)); 
    }

	@Test
    void viewAllUsers() {
        when(userRepository.findAll()).thenReturn(Arrays.asList(testUser));

        List<UserDTO> users = userService.viewAllUsers();

        assertEquals(1, users.size());
        verify(userRepository, times(1)).findAll();
    }

	@Test
    void deleteUser() throws UserManagementException {
        when(userRepository.existsById(1L)).thenReturn(true);

        String result = userService.deleteUser(1L);

        assertEquals("User deleted.", result);
        verify(userRepository, times(1)).deleteById(1L);
    }

	@Test
	void signOut() {
		String result = userService.signOut();

		assertEquals("You have been logged out.", result);
	}
}


package com.pakasio.app.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pakasio.app.model.User;

@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
		assertThat(userRepository).isNotNull();
	}

	@Test
	void saveAndDeleteUser() {
		userRepository.save(buildMockActiveUser());
		Optional<User> createdUser = userRepository.findByEmail("winnie@disney.com");
		assertThat(createdUser.isPresent()).isTrue();
		assertThat(createdUser.get().getId()).isNotNull();
		assertThat(createdUser.get().getId()).isNotZero();

		userRepository.deleteById(createdUser.get().getId());
		Optional<User> deleteUser = userRepository.findByEmail("winnie@disney.com");
		assertThat(deleteUser.isPresent()).isFalse();		
	}

	User buildMockActiveUser() {
		User activeUser = new User();
		activeUser.setFirstName("Winnie");
		activeUser.setLastName("Phoo");
		activeUser.setEmail("winnie@disney.com");
		activeUser.setPassword("miel");
		activeUser.setAvatar("www.images.com/winnie");
		activeUser.setActive(true);
		activeUser.setBirthdate(LocalDate.of(1980, 2, 2));
		activeUser.setRoles(null);
		return activeUser;
	}

}

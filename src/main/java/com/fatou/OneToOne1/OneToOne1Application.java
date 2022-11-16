package com.fatou.OneToOne1;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.OneToOne1.entity.Gender;
import com.fatou.OneToOne1.entity.User;
import com.fatou.OneToOne1.entity.UserProfile;
import com.fatou.OneToOne1.repository.UserProfileRepository;
import com.fatou.OneToOne1.repository.UserRepository;
@SpringBootApplication
public class OneToOne1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOne1Application.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository  userProfileRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//user object
		User user = new User();
		user.setName("fatou");
		user.setEmail("fdiopdiagne@gmail.com");
		
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAdress("sicap");
		userProfile.setBirthOfDate(LocalDate.of(1999, 01, 14));
		userProfile.setGender(Gender.FEMALE);
		userProfile.setPhoneNumber("776283200");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		userRepository.save(user);
		
		
		
		
	}


	
	


}

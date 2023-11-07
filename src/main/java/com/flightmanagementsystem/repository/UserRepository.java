package com.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User registerUser(User user);

	User signIn(String userName, String password);

	public String signOut();

}

package com.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightmanagementsystem.entity.User;

@Repository
<<<<<<< HEAD
public interface UserRepository extends JpaRepository<User, Long> {
=======
public interface UserRepository extends JpaRepository<User, Integer> {
>>>>>>> 084f402f86dbf6a45e4924da658c1c6c06aeee62

	
	User findByUserName(String name);
}

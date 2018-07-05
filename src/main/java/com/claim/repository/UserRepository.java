package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	@Query("select U from User U where U.email=:email and U.password=:password")
	User findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
	
	@Query("select U from User U where U.email=:email" )
	User findByEmail(@Param("email") String email);

}
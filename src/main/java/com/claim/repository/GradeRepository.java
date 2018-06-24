package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.claim.entity.Grade;


@Repository
public interface GradeRepository extends JpaRepository<Grade, String> {
	
	@Query("select G from Grade G where G.userId=:userId")
	Grade findByUserId(@Param("userId") int userId);
	
}

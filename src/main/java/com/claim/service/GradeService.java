package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Grade;
import com.claim.repository.GradeRepository;


@Service
public class GradeService {
	
	@Autowired
	private GradeRepository gradeRepository;
	
	public void saveGrade(Grade grade) {
		Grade existingGrade = gradeRepository.findByUserId(grade.getUserId());
		if (existingGrade != null) {
			grade.setGradeId(existingGrade.getGradeId());
		}
		gradeRepository.save(grade);
	}
	
	public Grade findGradeByUserId(int userId) {
		return gradeRepository.findByUserId(userId);
	}
	

}

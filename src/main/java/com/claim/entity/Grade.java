package com.claim.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="grade")
public class Grade {
	
	@Id
	@Column(name="grade_id")
	private int gradeId;
	@Column
	private int score;
	@Column
	private Date date; 
	@Column(name = "user_id")
    private int userId;
	@Column
    private String grade;
    
    
	public Grade() {
		super();
	}

	public Grade(int score, Date date, int userId, String grade, int gradeId) {
		super();
		this.score = score;
		this.date = date;
		this.userId = userId;
		this.grade = grade;
		this.gradeId = gradeId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	@Override
	public String toString() {
		return "Grade [score=" + score + ", date=" + date + ", userId=" + userId + ", grade=" + grade + ", gradeId="
				+ gradeId + "]";
	}
	
    
}

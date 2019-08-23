package com.ict.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="ENROLL")
	private long enroll;
	
	@Column(name="STUDENTNAME")
	private String studentname;
	
	@Column(name="STUDENTHOBBY")
	private String studenthobby;
	
	@Column(name="MOBILENO")
	private String mobileno;
	
	@Column(name="STATUS")
	private String status;
	
	public long getEnroll() {
		return enroll;
	}
	public void setEnroll(long enroll) {
		this.enroll = enroll;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudenthobby() {
		return studenthobby;
	}
	public void setStudenthobby(String studenthobby) {
		this.studenthobby = studenthobby;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

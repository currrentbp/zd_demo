package com.bp.entity;


/**
 * 
 * @author current_bp
 * @createTime 20161120
 *
 */
public class Student {
	
	private Long id;
	private String name;
	private String address;
	private Integer course;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getCourse() {
		return course;
	}
	public void setCourse(Integer course) {
		this.course = course;
	}
	
	
	

}
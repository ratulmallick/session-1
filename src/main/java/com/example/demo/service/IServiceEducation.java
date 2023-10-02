package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Education;

public interface IServiceEducation {
	
	public int addEdu(Education education);
	
	public List<Education> getAll();
	
	public void deleteById(Integer id);
	
	public Education getById(Integer id);
	
	public int updateBy(Education education);

}
